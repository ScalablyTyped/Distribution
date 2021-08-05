package typings.expressValidator

import typings.expressValidator.baseMod.Location
import typings.expressValidator.sanitizationChainMod.SanitizationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizationChainBuildersMod {
  
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildSanitizeFunction(locations: js.Array[Location]): js.Function1[/* fields */ js.UndefOr[String | js.Array[String]], SanitizationChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSanitizeFunction")(locations.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fields */ js.UndefOr[String | js.Array[String]], SanitizationChain]]
  
  inline def sanitize(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")().asInstanceOf[SanitizationChain]
  inline def sanitize(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  inline def sanitize(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  inline def sanitizeBody(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeBody")().asInstanceOf[SanitizationChain]
  inline def sanitizeBody(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeBody")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  inline def sanitizeBody(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeBody")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  inline def sanitizeCookie(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeCookie")().asInstanceOf[SanitizationChain]
  inline def sanitizeCookie(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeCookie")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  inline def sanitizeCookie(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeCookie")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  inline def sanitizeParam(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeParam")().asInstanceOf[SanitizationChain]
  inline def sanitizeParam(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeParam")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  inline def sanitizeParam(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeParam")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  inline def sanitizeQuery(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeQuery")().asInstanceOf[SanitizationChain]
  inline def sanitizeQuery(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeQuery")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  inline def sanitizeQuery(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeQuery")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
}
