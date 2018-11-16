package typings
package ethereumjsDashAbiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-abi", JSImport.Namespace)
@js.native
object ethereumjsDashAbiMod extends js.Object {
  def methodID(name: java.lang.String, types: js.Array[java.lang.String]): nodeLib.Buffer = js.native
  def rawDecode(signature: js.Array[java.lang.String], data: nodeLib.Buffer): js.Array[_] = js.native
  def simpleEncode(signature: java.lang.String, args: js.Any*): nodeLib.Buffer = js.native
  def soliditySHA256(argTypes: js.Array[java.lang.String], args: js.Array[_]): nodeLib.Buffer = js.native
  def soliditySHA3(argTypes: js.Array[java.lang.String], args: js.Array[_]): nodeLib.Buffer = js.native
}

