package typings
package gaxiosLib.buildSrcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios/build/src/common", "GaxiosError")
@js.native
class GaxiosError[T] protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
  var code: js.UndefOr[java.lang.String] = js.native
  var config: GaxiosOptions = js.native
  var response: js.UndefOr[GaxiosResponse[T]] = js.native
}

