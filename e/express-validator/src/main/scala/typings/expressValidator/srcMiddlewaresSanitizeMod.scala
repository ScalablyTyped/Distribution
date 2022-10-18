package typings.expressValidator

import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcChainSanitizationChainMod.SanitizationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewaresSanitizeMod {
  
  @JSImport("express-validator/src/middlewares/sanitize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sanitize(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")().asInstanceOf[SanitizationChain]
  inline def sanitize(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  inline def sanitize(fields: String, locations: js.Array[Location]): SanitizationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any])).asInstanceOf[SanitizationChain]
  inline def sanitize(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  inline def sanitize(fields: js.Array[String], locations: js.Array[Location]): SanitizationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any])).asInstanceOf[SanitizationChain]
  inline def sanitize(fields: Unit, locations: js.Array[Location]): SanitizationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any], locations.asInstanceOf[js.Any])).asInstanceOf[SanitizationChain]
}
