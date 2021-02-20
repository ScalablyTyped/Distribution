package typings.ethereumjsAbi

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-abi", "eventID")
  @js.native
  def eventID(name: String, types: js.Array[String]): Buffer = js.native
  
  @JSImport("ethereumjs-abi", "fromSerpent")
  @js.native
  def fromSerpent(signature: String): js.Array[String] = js.native
  
  @JSImport("ethereumjs-abi", "methodID")
  @js.native
  def methodID(name: String, types: js.Array[String]): Buffer = js.native
  
  @JSImport("ethereumjs-abi", "rawDecode")
  @js.native
  def rawDecode(types: js.Array[String], data: Buffer): js.Array[_] = js.native
  
  @JSImport("ethereumjs-abi", "rawEncode")
  @js.native
  def rawEncode(types: js.Array[String], values: js.Array[_]): Buffer = js.native
  
  @JSImport("ethereumjs-abi", "simpleDecode")
  @js.native
  def simpleDecode(signature: String, data: Buffer): js.Array[_] = js.native
  
  @JSImport("ethereumjs-abi", "simpleEncode")
  @js.native
  def simpleEncode(signature: String, args: js.Any*): Buffer = js.native
  
  @JSImport("ethereumjs-abi", "solidityPack")
  @js.native
  def solidityPack(types: js.Array[String], values: js.Array[_]): Buffer = js.native
  
  @JSImport("ethereumjs-abi", "solidityRIPEMD160")
  @js.native
  def solidityRIPEMD160(argTypes: js.Array[String], args: js.Array[_]): Buffer = js.native
  
  @JSImport("ethereumjs-abi", "soliditySHA256")
  @js.native
  def soliditySHA256(argTypes: js.Array[String], args: js.Array[_]): Buffer = js.native
  
  @JSImport("ethereumjs-abi", "soliditySHA3")
  @js.native
  def soliditySHA3(argTypes: js.Array[String], args: js.Array[_]): Buffer = js.native
  
  @JSImport("ethereumjs-abi", "stringify")
  @js.native
  def stringify(types: js.Array[String], values: js.Array[_]): String = js.native
  
  @JSImport("ethereumjs-abi", "toSerpent")
  @js.native
  def toSerpent(types: js.Array[String]): String = js.native
}
