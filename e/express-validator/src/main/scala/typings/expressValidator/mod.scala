package typings.expressValidator

import typings.expressValidator.anon.PartialMatchedDataOptions
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
  class Result[T] protected ()
    extends typings.expressValidator.validationResultMod.Result[T] {
    def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
  }
  
  @scala.inline
  def body(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")().asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def body(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def buildCheckFunction(locations: js.Array[Location]): js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[js.Any], 
    ValidationChain
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCheckFunction")(locations.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[js.Any], 
    ValidationChain
  ]]
  
  @scala.inline
  def buildSanitizeFunction(locations: js.Array[Location]): js.Function1[/* fields */ js.UndefOr[String | js.Array[String]], SanitizationChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSanitizeFunction")(locations.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fields */ js.UndefOr[String | js.Array[String]], SanitizationChain]]
  
  @scala.inline
  def check(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def check(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def checkSchema(schema: Schema): js.Array[ValidationChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[ValidationChain]]
  @scala.inline
  def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any], defaultLocations.asInstanceOf[js.Any])).asInstanceOf[js.Array[ValidationChain]]
  
  @scala.inline
  def cookie(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")().asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def cookie(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def header(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")().asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def header(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def matchedData(req: Request): Record[String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchedData")(req.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Any]]
  @scala.inline
  def matchedData(req: Request, options: PartialMatchedDataOptions): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchedData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
  
  @scala.inline
  def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  @scala.inline
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: js.Any): Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Middleware]
  @scala.inline
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Middleware]
  
  @scala.inline
  def param(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")().asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def param(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def query(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: String, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: js.Array[String], message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  @scala.inline
  def query(fields: Unit, message: js.Any): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @scala.inline
  def sanitize(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")().asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitize(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitize(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  @scala.inline
  def sanitizeBody(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeBody")().asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitizeBody(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeBody")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitizeBody(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeBody")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  @scala.inline
  def sanitizeCookie(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeCookie")().asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitizeCookie(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeCookie")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitizeCookie(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeCookie")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  @scala.inline
  def sanitizeParam(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeParam")().asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitizeParam(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeParam")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitizeParam(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeParam")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  @scala.inline
  def sanitizeQuery(): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeQuery")().asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitizeQuery(fields: String): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeQuery")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  @scala.inline
  def sanitizeQuery(fields: js.Array[String]): SanitizationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeQuery")(fields.asInstanceOf[js.Any]).asInstanceOf[SanitizationChain]
  
  @JSImport("express-validator", "validationResult")
  @js.native
  val validationResult: ResultFactory[ValidationError] & WithDefaults = js.native
}
