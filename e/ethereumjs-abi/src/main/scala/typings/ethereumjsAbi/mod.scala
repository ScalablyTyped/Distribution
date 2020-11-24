package typings.ethereumjsAbi

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-abi", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def eventID(name: String, types: js.Array[String]): Buffer = js.native
  
  def fromSerpent(signature: String): js.Array[String] = js.native
  
  def methodID(name: String, types: js.Array[String]): Buffer = js.native
  
  def rawDecode(types: js.Array[String], data: Buffer): js.Array[_] = js.native
  
  def rawEncode(types: js.Array[String], values: js.Array[_]): Buffer = js.native
  
  def simpleDecode(signature: String, data: Buffer): js.Array[_] = js.native
  
  def simpleEncode(signature: String, args: js.Any*): Buffer = js.native
  
  def solidityPack(types: js.Array[String], values: js.Array[_]): Buffer = js.native
  
  def solidityRIPEMD160(argTypes: js.Array[String], args: js.Array[_]): Buffer = js.native
  
  def soliditySHA256(argTypes: js.Array[String], args: js.Array[_]): Buffer = js.native
  
  def soliditySHA3(argTypes: js.Array[String], args: js.Array[_]): Buffer = js.native
  
  def stringify(types: js.Array[String], values: js.Array[_]): String = js.native
  
  def toSerpent(types: js.Array[String]): String = js.native
}
