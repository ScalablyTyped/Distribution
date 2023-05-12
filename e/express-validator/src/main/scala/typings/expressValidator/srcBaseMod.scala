package typings.expressValidator

import org.scalablytyped.runtime.StringDictionary
import typings.expressValidator.anon.Req
import typings.expressValidator.expressValidatorStrings.alternative
import typings.expressValidator.expressValidatorStrings.alternative_grouped
import typings.expressValidator.expressValidatorStrings.field
import typings.expressValidator.expressValidatorStrings.unknown_fields
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBaseMod {
  
  @JSImport("express-validator/src/base", "ValidationHalt")
  @js.native
  open class ValidationHalt ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("express-validator/src/base", "contextsKey")
  @js.native
  val contextsKey: /* "express-validator#contexts" */ String = js.native
  
  type AlternativeMessageFactory = js.Function2[/* nestedErrors */ js.Array[FieldValidationError], /* opts */ Req, Any]
  
  trait AlternativeValidationError
    extends StObject
       with ValidationError {
    
    /**
      * The error message
      */
    var msg: Any
    
    /**
      * The list of underlying validation errors returned by validation chains in `oneOf()`
      */
    var nestedErrors: js.Array[FieldValidationError]
    
    /**
      * Indicates that the error occurred because all alternatives (e.g. in `oneOf()`) were invalid
      */
    var `type`: alternative
  }
  object AlternativeValidationError {
    
    inline def apply(msg: Any, nestedErrors: js.Array[FieldValidationError]): AlternativeValidationError = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("alternative")
      __obj.asInstanceOf[AlternativeValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlternativeValidationError] (val x: Self) extends AnyVal {
      
      inline def setMsg(value: Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setNestedErrors(value: js.Array[FieldValidationError]): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
      
      inline def setNestedErrorsVarargs(value: FieldValidationError*): Self = StObject.set(x, "nestedErrors", js.Array(value*))
      
      inline def setType(value: alternative): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomSanitizer = js.Function2[/* input */ Any, /* meta */ Meta, Any]
  
  type CustomValidator = js.Function2[/* input */ Any, /* meta */ Meta, Any]
  
  type ErrorMessage = String | Double | js.Symbol | Boolean | js.Object | js.Array[Any]
  
  trait FieldInstance extends StObject {
    
    var location: Location
    
    var originalPath: String
    
    var path: String
    
    var value: Any
  }
  object FieldInstance {
    
    inline def apply(location: Location, originalPath: String, path: String, value: Any): FieldInstance = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalPath = originalPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldInstance] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type FieldMessageFactory = js.Function2[/* value */ Any, /* meta */ Meta, Any]
  
  trait FieldValidationError
    extends StObject
       with ValidationError {
    
    /**
      * The location within the request where this field is
      */
    var location: Location
    
    /**
      * The error message
      */
    var msg: Any
    
    /**
      * The path to the field which has a validation error
      */
    var path: String
    
    /**
      * Indicates that the error occurred because a field had an invalid value
      */
    var `type`: field
    
    /**
      * The value of the field
      */
    var value: Any
  }
  object FieldValidationError {
    
    inline def apply(location: Location, msg: Any, path: String, value: Any): FieldValidationError = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("field")
      __obj.asInstanceOf[FieldValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldValidationError] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: field): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type GroupedAlternativeMessageFactory = js.Function2[/* nestedErrors */ js.Array[js.Array[FieldValidationError]], /* opts */ Req, Any]
  
  trait GroupedAlternativeValidationError
    extends StObject
       with ValidationError {
    
    /**
      * The error message
      */
    var msg: Any
    
    /**
      * The list of underlying validation errors returned by validation chains in `oneOf()`
      */
    var nestedErrors: js.Array[js.Array[FieldValidationError]]
    
    /**
      * Indicates that the error occurred because all alternatives (e.g. in `oneOf()`) were invalid,
      * and the nested errors are grouped per alternative.
      */
    var `type`: alternative_grouped
  }
  object GroupedAlternativeValidationError {
    
    inline def apply(msg: Any, nestedErrors: js.Array[js.Array[FieldValidationError]]): GroupedAlternativeValidationError = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("alternative_grouped")
      __obj.asInstanceOf[GroupedAlternativeValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupedAlternativeValidationError] (val x: Self) extends AnyVal {
      
      inline def setMsg(value: Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setNestedErrors(value: js.Array[js.Array[FieldValidationError]]): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
      
      inline def setNestedErrorsVarargs(value: js.Array[FieldValidationError]*): Self = StObject.set(x, "nestedErrors", js.Array(value*))
      
      inline def setType(value: alternative_grouped): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InternalRequest
    extends StObject
       with Request
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.expressValidatorStrings.body
    - typings.expressValidator.expressValidatorStrings.cookies
    - typings.expressValidator.expressValidatorStrings.headers
    - typings.expressValidator.expressValidatorStrings.params
    - typings.expressValidator.expressValidatorStrings.query
  */
  trait Location extends StObject
  object Location {
    
    inline def body: typings.expressValidator.expressValidatorStrings.body = "body".asInstanceOf[typings.expressValidator.expressValidatorStrings.body]
    
    inline def cookies: typings.expressValidator.expressValidatorStrings.cookies = "cookies".asInstanceOf[typings.expressValidator.expressValidatorStrings.cookies]
    
    inline def headers: typings.expressValidator.expressValidatorStrings.headers = "headers".asInstanceOf[typings.expressValidator.expressValidatorStrings.headers]
    
    inline def params: typings.expressValidator.expressValidatorStrings.params = "params".asInstanceOf[typings.expressValidator.expressValidatorStrings.params]
    
    inline def query: typings.expressValidator.expressValidatorStrings.query = "query".asInstanceOf[typings.expressValidator.expressValidatorStrings.query]
  }
  
  trait Meta extends StObject {
    
    /**
      * Which of the request objects the field was picked from
      */
    var location: Location
    
    /**
      * The full path of the field within the request object.
      *
      * @example
      * const meta = { req, location: 'body', path: 'foo.bar' }; // req.body.foo.bar
      */
    var path: String
    
    /**
      * The express request from which the field was validated
      */
    var req: Request
  }
  object Meta {
    
    inline def apply(location: Location, path: String, req: Request): Meta = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  type Middleware = js.Function3[
    /* req */ Request, 
    /* res */ Any, 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  trait Request
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var cookies: js.UndefOr[Record[String, Any]] = js.undefined
    
    var headers: js.UndefOr[Record[String, Any]] = js.undefined
    
    var params: js.UndefOr[Record[String, Any]] = js.undefined
    
    var query: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCookies(value: Record[String, Any]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  @js.native
  trait StandardSanitizer extends StObject {
    
    def apply(input: String, options: Any*): Any = js.native
  }
  
  @js.native
  trait StandardValidator extends StObject {
    
    def apply(input: String, options: Any*): Boolean = js.native
  }
  
  /* Inlined std.Omit<express-validator.express-validator/src/base.FieldInstance, 'originalPath'> */
  trait UnknownFieldInstance extends StObject {
    
    var location: Location
    
    var path: String
    
    var value: Any
  }
  object UnknownFieldInstance {
    
    inline def apply(location: Location, path: String, value: Any): UnknownFieldInstance = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnknownFieldInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnknownFieldInstance] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type UnknownFieldMessageFactory = js.Function2[/* unknownFields */ js.Array[UnknownFieldInstance], /* opts */ Req, Any]
  
  trait UnknownFieldsError
    extends StObject
       with ValidationError {
    
    /**
      * The list of fields that are unknown
      */
    var fields: js.Array[UnknownFieldInstance]
    
    /**
      * The error message
      */
    var msg: Any
    
    /**
      * Indicates that the error occurred because one or more fields are unknown in the request
      */
    var `type`: unknown_fields
  }
  object UnknownFieldsError {
    
    inline def apply(fields: js.Array[UnknownFieldInstance], msg: Any): UnknownFieldsError = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unknown_fields")
      __obj.asInstanceOf[UnknownFieldsError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnknownFieldsError] (val x: Self) extends AnyVal {
      
      inline def setFields(value: js.Array[UnknownFieldInstance]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: UnknownFieldInstance*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setMsg(value: Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setType(value: unknown_fields): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.srcBaseMod.AlternativeValidationError
    - typings.expressValidator.srcBaseMod.GroupedAlternativeValidationError
    - typings.expressValidator.srcBaseMod.UnknownFieldsError
    - typings.expressValidator.srcBaseMod.FieldValidationError
  */
  trait ValidationError extends StObject
  object ValidationError {
    
    inline def AlternativeValidationError(msg: Any, nestedErrors: js.Array[FieldValidationError]): typings.expressValidator.srcBaseMod.AlternativeValidationError = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("alternative")
      __obj.asInstanceOf[typings.expressValidator.srcBaseMod.AlternativeValidationError]
    }
    
    inline def FieldValidationError(location: Location, msg: Any, path: String, value: Any): typings.expressValidator.srcBaseMod.FieldValidationError = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("field")
      __obj.asInstanceOf[typings.expressValidator.srcBaseMod.FieldValidationError]
    }
    
    inline def GroupedAlternativeValidationError(msg: Any, nestedErrors: js.Array[js.Array[FieldValidationError]]): typings.expressValidator.srcBaseMod.GroupedAlternativeValidationError = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("alternative_grouped")
      __obj.asInstanceOf[typings.expressValidator.srcBaseMod.GroupedAlternativeValidationError]
    }
    
    inline def UnknownFieldsError(fields: js.Array[UnknownFieldInstance], msg: Any): typings.expressValidator.srcBaseMod.UnknownFieldsError = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unknown_fields")
      __obj.asInstanceOf[typings.expressValidator.srcBaseMod.UnknownFieldsError]
    }
  }
}
