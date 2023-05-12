package typings.expressValidator

import typings.expressValidator.anon.PartialMatchedDataOptions
import typings.expressValidator.srcBaseMod.CustomSanitizer
import typings.expressValidator.srcBaseMod.CustomValidator
import typings.expressValidator.srcBaseMod.ErrorMessage
import typings.expressValidator.srcBaseMod.FieldMessageFactory
import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcBaseMod.Middleware
import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcBaseMod.ValidationError
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import typings.expressValidator.srcMiddlewaresExactMod.CheckExactInput
import typings.expressValidator.srcMiddlewaresExactMod.CheckExactOptions
import typings.expressValidator.srcMiddlewaresOneOfMod.OneOfOptions
import typings.expressValidator.srcMiddlewaresSchemaMod.RunnableValidationChains
import typings.expressValidator.srcValidationResultMod.ErrorFormatter
import typings.expressValidator.srcValidationResultMod.Result
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExpressValidatorMod {
  
  @JSImport("express-validator/src/express-validator", "ExpressValidator")
  @js.native
  open class ExpressValidator[V /* <: CustomValidatorsMap */, S /* <: CustomSanitizersMap */, E] () extends StObject {
    def this(validators: V) = this()
    def this(validators: V, sanitizers: S) = this()
    def this(validators: Unit, sanitizers: S) = this()
    def this(validators: V, sanitizers: S, options: CustomOptions[E]) = this()
    def this(validators: V, sanitizers: Unit, options: CustomOptions[E]) = this()
    def this(validators: Unit, sanitizers: S, options: CustomOptions[E]) = this()
    def this(validators: Unit, sanitizers: Unit, options: CustomOptions[E]) = this()
    
    /**
      * Same as {@link ExpressValidator.check}, but only validates in `req.body`.
      */
    def body(): CustomValidationChain[this.type] = js.native
    def body(fields: String): CustomValidationChain[this.type] = js.native
    def body(fields: String, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def body(fields: String, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def body(fields: js.Array[String]): CustomValidationChain[this.type] = js.native
    def body(fields: js.Array[String], message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def body(fields: js.Array[String], message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def body(fields: Unit, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def body(fields: Unit, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    
    def buildCheckFunction(locations: js.Array[Location]): js.Function2[
        /* fields */ js.UndefOr[String | js.Array[String]], 
        /* message */ js.UndefOr[FieldMessageFactory | ErrorMessage], 
        CustomValidationChain[this.type]
      ] = js.native
    
    /**
      * Creates a middleware/validation chain for one or more fields that may be located in
      * any of the following:
      *
      * - `req.body`
      * - `req.cookies`
      * - `req.headers`
      * - `req.params`
      * - `req.query`
      *
      * @param fields  a string or array of field names to validate/sanitize
      * @param message an error message to use when failed validations don't specify a custom message.
      *                Defaults to `Invalid Value`.
      */
    def check(): CustomValidationChain[this.type] = js.native
    def check(fields: String): CustomValidationChain[this.type] = js.native
    def check(fields: String, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def check(fields: String, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def check(fields: js.Array[String]): CustomValidationChain[this.type] = js.native
    def check(fields: js.Array[String], message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def check(fields: js.Array[String], message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def check(fields: Unit, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def check(fields: Unit, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    
    /**
      * Checks whether the request contains exactly only those fields that have been validated.
      *
      * This method is here for convenience; it does exactly the same as `checkExact`.
      *
      * @see {@link checkExact}
      */
    def checkExact(): Middleware & ContextRunner = js.native
    def checkExact(chains: Unit, opts: CheckExactOptions): Middleware & ContextRunner = js.native
    def checkExact(chains: CheckExactInput): Middleware & ContextRunner = js.native
    def checkExact(chains: CheckExactInput, opts: CheckExactOptions): Middleware & ContextRunner = js.native
    
    /**
      * Creates an express middleware with validations for multiple fields at once in the form of
      * a schema object.
      *
      * @param schema the schema to validate.
      * @param defaultLocations which locations to validate in each field. Defaults to every location.
      */
    def checkSchema[T /* <: String */](schema: CustomSchema[this.type, T]): RunnableValidationChains[CustomValidationChain[this.type]] = js.native
    def checkSchema[T /* <: String */](schema: CustomSchema[this.type, T], locations: js.Array[Location]): RunnableValidationChains[CustomValidationChain[this.type]] = js.native
    
    /**
      * Same as {@link ExpressValidator.check}, but only validates in `req.cookies`.
      */
    def cookie(): CustomValidationChain[this.type] = js.native
    def cookie(fields: String): CustomValidationChain[this.type] = js.native
    def cookie(fields: String, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def cookie(fields: String, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def cookie(fields: js.Array[String]): CustomValidationChain[this.type] = js.native
    def cookie(fields: js.Array[String], message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def cookie(fields: js.Array[String], message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def cookie(fields: Unit, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def cookie(fields: Unit, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    
    /* private */ var createChain: Any = js.native
    
    /**
      * Same as {@link ExpressValidator.check}, but only validates in `req.headers`.
      */
    def header(): CustomValidationChain[this.type] = js.native
    def header(fields: String): CustomValidationChain[this.type] = js.native
    def header(fields: String, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def header(fields: String, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def header(fields: js.Array[String]): CustomValidationChain[this.type] = js.native
    def header(fields: js.Array[String], message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def header(fields: js.Array[String], message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def header(fields: Unit, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def header(fields: Unit, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    
    /**
      * Extracts data validated or sanitized from the request, and builds an object with them.
      *
      * This method is a shortcut for `matchedData`; it does nothing different than it.
      *
      * @see {@link matchedData}
      */
    def matchedData(req: Request): Record[String, Any] = js.native
    def matchedData(req: Request, options: PartialMatchedDataOptions): Record[String, Any] = js.native
    
    /**
      * Creates a middleware that will ensure that at least one of the given validation chains
      * or validation chain groups are valid.
      *
      * If none are, a single error of type `alternative` is added to the request,
      * with the errors of each chain made available under the `nestedErrors` property.
      *
      * @param chains an array of validation chains to check if are valid.
      *               If any of the items of `chains` is an array of validation chains, then all of them
      *               must be valid together for the request to be considered valid.
      */
    def oneOf(chains: js.Array[CustomValidationChain[this.type] | js.Array[CustomValidationChain[this.type]]]): Middleware & ContextRunner = js.native
    def oneOf(
      chains: js.Array[CustomValidationChain[this.type] | js.Array[CustomValidationChain[this.type]]],
      options: OneOfOptions
    ): Middleware & ContextRunner = js.native
    
    /* private */ val options: Any = js.native
    
    /**
      * Same as {@link ExpressValidator.check}, but only validates in `req.params`.
      */
    def param(): CustomValidationChain[this.type] = js.native
    def param(fields: String): CustomValidationChain[this.type] = js.native
    def param(fields: String, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def param(fields: String, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def param(fields: js.Array[String]): CustomValidationChain[this.type] = js.native
    def param(fields: js.Array[String], message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def param(fields: js.Array[String], message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def param(fields: Unit, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def param(fields: Unit, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    
    /**
      * Same as {@link ExpressValidator.check}, but only validates in `req.query`.
      */
    def query(): CustomValidationChain[this.type] = js.native
    def query(fields: String): CustomValidationChain[this.type] = js.native
    def query(fields: String, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def query(fields: String, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def query(fields: js.Array[String]): CustomValidationChain[this.type] = js.native
    def query(fields: js.Array[String], message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def query(fields: js.Array[String], message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    def query(fields: Unit, message: ErrorMessage): CustomValidationChain[this.type] = js.native
    def query(fields: Unit, message: FieldMessageFactory): CustomValidationChain[this.type] = js.native
    
    /* private */ val sanitizerEntries: Any = js.native
    
    /* private */ val sanitizers: Any = js.native
    
    /**
      * Extracts the validation errors of an express request using the default error formatter of this
      * instance.
      *
      * @see {@link validationResult()}
      * @param req the express request object
      * @returns a `Result` which will by default use the error formatter passed when
      *          instantiating `ExpressValidator`.
      */
    def validationResult(req: Request): Result[E] = js.native
    
    /* private */ val validatorEntries: Any = js.native
    
    /* private */ val validators: Any = js.native
  }
  
  trait CustomOptions[E] extends StObject {
    
    var errorFormatter: js.UndefOr[ErrorFormatter[E]] = js.undefined
  }
  object CustomOptions {
    
    inline def apply[E](): CustomOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomOptions[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomOptions[?], E] (val x: Self & CustomOptions[E]) extends AnyVal {
      
      inline def setErrorFormatter(value: /* error */ ValidationError => E): Self = StObject.set(x, "errorFormatter", js.Any.fromFunction1(value))
      
      inline def setErrorFormatterUndefined: Self = StObject.set(x, "errorFormatter", js.undefined)
    }
  }
  
  type CustomSanitizersMap = Record[String, CustomSanitizer]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends express-validator.express-validator/src/express-validator.ExpressValidator<infer V, infer S, any> ? std.Record<string, express-validator.express-validator/src/express-validator.ParamSchemaWithExtensions<std.Extract<keyof V, string>, std.Extract<keyof S, string>, K>> : never
    }}}
    */
  @js.native
  trait CustomSchema[T /* <: ExpressValidator[Any, Any, Any] */, K /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends express-validator.express-validator/src/express-validator.ExpressValidator<infer V, infer S, any> ? express-validator.express-validator/src/express-validator.ValidationChainWithExtensions<std.Extract<keyof V | keyof S, string>> : never
    }}}
    */
  @js.native
  trait CustomValidationChain[T /* <: ExpressValidator[Any, Any, Any] */] extends StObject
  
  type CustomValidatorsMap = Record[String, CustomValidator]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof express-validator.express-validator/src/middlewares/schema.ParamSchema<T> | V | S ]:? K extends V? express-validator.express-validator/src/middlewares/schema.ExtensionValidatorSchemaOptions : K extends S? express-validator.express-validator/src/middlewares/schema.ExtensionSanitizerSchemaOptions : K extends keyof express-validator.express-validator/src/middlewares/schema.ParamSchema<T>? express-validator.express-validator/src/middlewares/schema.ParamSchema<T>[K] : never}
    }}}
    */
  @js.native
  trait ParamSchemaWithExtensions[V /* <: String */, S /* <: String */, T /* <: String */] extends StObject
  
  type ValidationChainWithExtensions[T /* <: String */] = Middleware & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof express-validator.express-validator/src/chain/validation-chain.ValidationChain ]: express-validator.express-validator/src/chain/validation-chain.ValidationChain[K] extends (args : infer A): express-validator.express-validator/src/chain/validation-chain.ValidationChain? (params : A): express-validator.express-validator/src/express-validator.ValidationChainWithExtensions<T> : express-validator.express-validator/src/chain/validation-chain.ValidationChain[K]} */ js.Any)
}
