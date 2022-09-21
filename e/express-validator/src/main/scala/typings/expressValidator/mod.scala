package typings.expressValidator

import typings.expressValidator.anon.ArrayValidationChainrunre
import typings.expressValidator.anon.PartialMatchedDataOptions
import typings.expressValidator.anon.Run
import typings.expressValidator.anon.WithDefaults
import typings.expressValidator.baseMod.Location
import typings.expressValidator.baseMod.Middleware
import typings.expressValidator.baseMod.Request
import typings.expressValidator.baseMod.ValidationError
import typings.expressValidator.oneOfMod.OneOfCustomMessageBuilder
import typings.expressValidator.sanitizationChainMod.SanitizationChain
import typings.expressValidator.schemaMod.Schema
import typings.expressValidator.validationChainMod.ValidationChain
import typings.expressValidator.validationResultMod.ErrorFormatter
import typings.expressValidator.validationResultMod.ResultFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-validator", "Result")
  @js.native
  open class Result[T] protected ()
    extends typings.expressValidator.validationResultMod.Result[T] {
    def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
  }
  
  inline def body(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")().asInstanceOf[ValidationChain]
  inline def body(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def body(fields: String, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def body(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def body(fields: js.Array[String], message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def body(fields: Unit, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def buildCheckFunction(locations: js.Array[Location]): js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[Any], 
    ValidationChain
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCheckFunction")(locations.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[Any], 
    ValidationChain
  ]]
  
  inline def buildSanitizeFunction(locations: js.Array[Location]): js.Function1[/* fields */ js.UndefOr[String | js.Array[String]], SanitizationChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSanitizeFunction")(locations.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fields */ js.UndefOr[String | js.Array[String]], SanitizationChain]]
  
  inline def check(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[ValidationChain]
  inline def check(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def check(fields: String, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def check(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def check(fields: js.Array[String], message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def check(fields: Unit, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def checkSchema(schema: Schema): ArrayValidationChainrunre = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[ArrayValidationChainrunre]
  inline def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): ArrayValidationChainrunre = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any], defaultLocations.asInstanceOf[js.Any])).asInstanceOf[ArrayValidationChainrunre]
  
  inline def cookie(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")().asInstanceOf[ValidationChain]
  inline def cookie(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def cookie(fields: String, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def cookie(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def cookie(fields: js.Array[String], message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def cookie(fields: Unit, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def header(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")().asInstanceOf[ValidationChain]
  inline def header(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def header(fields: String, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def header(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def header(fields: js.Array[String], message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def header(fields: Unit, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def matchedData(req: Request): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchedData")(req.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def matchedData(req: Request, options: PartialMatchedDataOptions): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchedData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware & Run = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any]).asInstanceOf[Middleware & Run]
  inline def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: Any): Middleware & Run = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Middleware & Run]
  inline def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware & Run = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Middleware & Run]
  
  inline def param(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")().asInstanceOf[ValidationChain]
  inline def param(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def param(fields: String, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def param(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def param(fields: js.Array[String], message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def param(fields: Unit, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def query(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[ValidationChain]
  inline def query(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def query(fields: String, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def query(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def query(fields: js.Array[String], message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def query(fields: Unit, message: Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
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
  
  @JSImport("express-validator", "validationResult")
  @js.native
  val validationResult: ResultFactory[ValidationError] & WithDefaults = js.native
}
