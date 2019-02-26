package typings
package ethereumjsDashAbiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-abi", JSImport.Namespace)
@js.native
object ethereumjsDashAbiMod extends js.Object {
  def eventID(name: java.lang.String, types: js.Array[java.lang.String]): nodeLib.Buffer = js.native
  def fromSerpent(signature: java.lang.String): js.Array[java.lang.String] = js.native
  def methodID(name: java.lang.String, types: js.Array[java.lang.String]): nodeLib.Buffer = js.native
  def rawDecode(types: js.Array[java.lang.String], data: nodeLib.Buffer): js.Array[_] = js.native
  def rawEncode(types: js.Array[java.lang.String], values: js.Array[_]): nodeLib.Buffer = js.native
  def simpleDecode(signature: java.lang.String, data: nodeLib.Buffer): js.Array[_] = js.native
  def simpleEncode(signature: java.lang.String, args: js.Any*): nodeLib.Buffer = js.native
  def solidityPack(types: js.Array[java.lang.String], values: js.Array[_]): nodeLib.Buffer = js.native
  def solidityRIPEMD160(argTypes: js.Array[java.lang.String], args: js.Array[_]): nodeLib.Buffer = js.native
  def soliditySHA256(argTypes: js.Array[java.lang.String], args: js.Array[_]): nodeLib.Buffer = js.native
  def soliditySHA3(argTypes: js.Array[java.lang.String], args: js.Array[_]): nodeLib.Buffer = js.native
  def stringify(types: js.Array[java.lang.String], values: js.Array[_]): java.lang.String = js.native
  def toSerpent(types: js.Array[java.lang.String]): java.lang.String = js.native
}

