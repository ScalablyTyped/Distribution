package typings.ethereumjsAbi

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-abi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventID(name: String, types: js.Array[String]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("eventID")(name.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def fromSerpent(signature: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSerpent")(signature.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def methodID(name: String, types: js.Array[String]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("methodID")(name.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def rawDecode(types: js.Array[String], data: Buffer): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("rawDecode")(types.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def rawEncode(types: js.Array[String], values: js.Array[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("rawEncode")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def simpleDecode(signature: String, data: Buffer): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleDecode")(signature.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def simpleEncode(signature: String, args: Any*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleEncode")(List(signature.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Buffer]
  
  inline def solidityPack(types: js.Array[String], values: js.Array[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityPack")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def solidityRIPEMD160(argTypes: js.Array[String], args: js.Array[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityRIPEMD160")(argTypes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def soliditySHA256(argTypes: js.Array[String], args: js.Array[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("soliditySHA256")(argTypes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def soliditySHA3(argTypes: js.Array[String], args: js.Array[Any]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("soliditySHA3")(argTypes.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def stringify(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toSerpent(types: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSerpent")(types.asInstanceOf[js.Any]).asInstanceOf[String]
}
