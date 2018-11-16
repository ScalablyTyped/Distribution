package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("Wifi", JSImport.Namespace)
@js.native
object wifiMod extends js.Object {
  def connect(ssid: java.lang.String, options: js.Any, callback: js.Function1[/* err */ js.Any, _]): js.Any = js.native
  def startAP(ssid: java.lang.String, options: js.Any, callback: js.Function1[/* err */ js.Any, _]): js.Any = js.native
}

