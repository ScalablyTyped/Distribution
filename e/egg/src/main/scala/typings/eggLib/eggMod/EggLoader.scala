package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "EggLoader")
@js.native
class EggLoader protected () extends js.Object {
  def this(options: EggLoaderOptions) = this()
  var options: EggLoaderOptions = js.native
  def getAppInfo(): EggAppInfo = js.native
  def getHomedir(): java.lang.String = js.native
}

