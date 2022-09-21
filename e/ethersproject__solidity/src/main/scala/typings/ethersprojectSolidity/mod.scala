package typings.ethersprojectSolidity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/solidity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keccak256(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pack(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sha256(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
}
