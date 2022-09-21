package typings.ethersprojectHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@ethersproject/hash/lib/ens-normalize/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensNormalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ens_normalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensNormalizePostCheck(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ens_normalize_post_check")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
