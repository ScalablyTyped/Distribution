package typings.ethersprojectKeccak256

import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/keccak256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keccak256(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
