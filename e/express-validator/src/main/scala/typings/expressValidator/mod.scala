package typings.expressValidator

import typings.expressValidator.anon.PartialMatchedDataOptions
import typings.expressValidator.anon.WithDefaults
import typings.expressValidator.srcBaseMod.ErrorMessage
import typings.expressValidator.srcBaseMod.FieldMessageFactory
import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcBaseMod.Middleware
import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcBaseMod.ValidationError
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import typings.expressValidator.srcChainValidationChainMod.ValidationChain
import typings.expressValidator.srcExpressValidatorMod.CustomOptions
import typings.expressValidator.srcExpressValidatorMod.CustomSanitizersMap
import typings.expressValidator.srcExpressValidatorMod.CustomValidatorsMap
import typings.expressValidator.srcMiddlewaresExactMod.CheckExactInput
import typings.expressValidator.srcMiddlewaresExactMod.CheckExactOptions
import typings.expressValidator.srcMiddlewaresOneOfMod.OneOfOptions
import typings.expressValidator.srcMiddlewaresSchemaMod.RunnableValidationChains
import typings.expressValidator.srcMiddlewaresSchemaMod.Schema
import typings.expressValidator.srcValidationResultMod.ErrorFormatter
import typings.expressValidator.srcValidationResultMod.ResultFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-validator", "ExpressValidator")
  @js.native
  open class ExpressValidator[V /* <: CustomValidatorsMap */, S /* <: CustomSanitizersMap */, E] ()
    extends typings.expressValidator.srcExpressValidatorMod.ExpressValidator[V, S, E] {
    def this(validators: V) = this()
    def this(validators: V, sanitizers: S) = this()
    def this(validators: Unit, sanitizers: S) = this()
    def this(validators: V, sanitizers: S, options: CustomOptions[E]) = this()
    def this(validators: V, sanitizers: Unit, options: CustomOptions[E]) = this()
    def this(validators: Unit, sanitizers: S, options: CustomOptions[E]) = this()
    def this(validators: Unit, sanitizers: Unit, options: CustomOptions[E]) = this()
  }
  
  @JSImport("express-validator", "Result")
  @js.native
  open class Result[T] protected ()
    extends typings.expressValidator.srcValidationResultMod.Result[T] {
    def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
  }
  
  inline def body(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")().asInstanceOf[ValidationChain]
  inline def body(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def body(fields: String, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def body(fields: String, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def body(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def body(fields: js.Array[String], message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def body(fields: js.Array[String], message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def body(fields: Unit, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def body(fields: Unit, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("body")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def buildCheckFunction(locations: js.Array[Location]): js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[FieldMessageFactory | ErrorMessage], 
    ValidationChain
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCheckFunction")(locations.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[FieldMessageFactory | ErrorMessage], 
    ValidationChain
  ]]
  
  inline def check(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[ValidationChain]
  inline def check(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def check(fields: String, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def check(fields: String, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def check(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def check(fields: js.Array[String], message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def check(fields: js.Array[String], message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def check(fields: Unit, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def check(fields: Unit, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def checkExact(): Middleware & ContextRunner = ^.asInstanceOf[js.Dynamic].applyDynamic("checkExact")().asInstanceOf[Middleware & ContextRunner]
  inline def checkExact(chains: Unit, opts: CheckExactOptions): Middleware & ContextRunner = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExact")(chains.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Middleware & ContextRunner]
  inline def checkExact(chains: CheckExactInput): Middleware & ContextRunner = ^.asInstanceOf[js.Dynamic].applyDynamic("checkExact")(chains.asInstanceOf[js.Any]).asInstanceOf[Middleware & ContextRunner]
  inline def checkExact(chains: CheckExactInput, opts: CheckExactOptions): Middleware & ContextRunner = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExact")(chains.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Middleware & ContextRunner]
  
  inline def checkSchema[T /* <: String */](schema: Schema[T]): RunnableValidationChains[ValidationChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[RunnableValidationChains[ValidationChain]]
  inline def checkSchema[T /* <: String */](schema: Schema[T], defaultLocations: js.Array[Location]): RunnableValidationChains[ValidationChain] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSchema")(schema.asInstanceOf[js.Any], defaultLocations.asInstanceOf[js.Any])).asInstanceOf[RunnableValidationChains[ValidationChain]]
  
  inline def cookie(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")().asInstanceOf[ValidationChain]
  inline def cookie(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def cookie(fields: String, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def cookie(fields: String, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def cookie(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def cookie(fields: js.Array[String], message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def cookie(fields: js.Array[String], message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def cookie(fields: Unit, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def cookie(fields: Unit, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("cookie")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def header(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")().asInstanceOf[ValidationChain]
  inline def header(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def header(fields: String, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def header(fields: String, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def header(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def header(fields: js.Array[String], message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def header(fields: js.Array[String], message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def header(fields: Unit, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def header(fields: Unit, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def matchedData(req: Request): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchedData")(req.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def matchedData(req: Request, options: PartialMatchedDataOptions): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchedData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]]): Middleware & ContextRunner = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any]).asInstanceOf[Middleware & ContextRunner]
  inline def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], options: OneOfOptions): Middleware & ContextRunner = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware & ContextRunner]
  
  inline def param(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")().asInstanceOf[ValidationChain]
  inline def param(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def param(fields: String, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def param(fields: String, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def param(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def param(fields: js.Array[String], message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def param(fields: js.Array[String], message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def param(fields: Unit, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def param(fields: Unit, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  inline def query(): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[ValidationChain]
  inline def query(fields: String): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def query(fields: String, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def query(fields: String, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def query(fields: js.Array[String]): ValidationChain = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any]).asInstanceOf[ValidationChain]
  inline def query(fields: js.Array[String], message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def query(fields: js.Array[String], message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def query(fields: Unit, message: ErrorMessage): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  inline def query(fields: Unit, message: FieldMessageFactory): ValidationChain = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(fields.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[ValidationChain]
  
  @JSImport("express-validator", "validationResult")
  @js.native
  val validationResult: ResultFactory[ValidationError] & WithDefaults = js.native
}
