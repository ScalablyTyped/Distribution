package typings.expressValidator

import typings.expressValidator.baseMod.Location
import typings.expressValidator.sanitizationChainMod.SanitizationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizationChainBuildersMod {
  
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "buildSanitizeFunction")
  @js.native
  def buildSanitizeFunction(locations: js.Array[Location]): js.Function1[/* fields */ js.UndefOr[String | js.Array[String]], SanitizationChain] = js.native
  
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitize")
  @js.native
  def sanitize(): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitize")
  @js.native
  def sanitize(fields: String): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitize")
  @js.native
  def sanitize(fields: js.Array[String]): SanitizationChain = js.native
  
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeBody")
  @js.native
  def sanitizeBody(): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeBody")
  @js.native
  def sanitizeBody(fields: String): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeBody")
  @js.native
  def sanitizeBody(fields: js.Array[String]): SanitizationChain = js.native
  
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeCookie")
  @js.native
  def sanitizeCookie(): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeCookie")
  @js.native
  def sanitizeCookie(fields: String): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeCookie")
  @js.native
  def sanitizeCookie(fields: js.Array[String]): SanitizationChain = js.native
  
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeParam")
  @js.native
  def sanitizeParam(): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeParam")
  @js.native
  def sanitizeParam(fields: String): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeParam")
  @js.native
  def sanitizeParam(fields: js.Array[String]): SanitizationChain = js.native
  
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeQuery")
  @js.native
  def sanitizeQuery(): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeQuery")
  @js.native
  def sanitizeQuery(fields: String): SanitizationChain = js.native
  @JSImport("express-validator/src/middlewares/sanitization-chain-builders", "sanitizeQuery")
  @js.native
  def sanitizeQuery(fields: js.Array[String]): SanitizationChain = js.native
}
