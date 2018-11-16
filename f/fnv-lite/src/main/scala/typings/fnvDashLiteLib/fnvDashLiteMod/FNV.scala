package typings
package fnvDashLiteLib.fnvDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FNV extends js.Object {
  def digest(): js.Array[scala.Double] = js.native
  @JSName("digest")
  def digest_base36(`type`: fnvDashLiteLib.fnvDashLiteLibStrings.base36): java.lang.String = js.native
  @JSName("digest")
  def digest_base64(`type`: fnvDashLiteLib.fnvDashLiteLibStrings.base64): java.lang.String = js.native
  @JSName("digest")
  def digest_base64Url(`type`: fnvDashLiteLib.fnvDashLiteLibStrings.base64Url): java.lang.String = js.native
  @JSName("digest")
  def digest_hex(`type`: fnvDashLiteLib.fnvDashLiteLibStrings.hex): java.lang.String = js.native
  def update(input: fnvDashLiteLib.Input): this.type = js.native
}

