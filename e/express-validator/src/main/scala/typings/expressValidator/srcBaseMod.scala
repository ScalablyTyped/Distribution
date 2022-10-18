package typings.expressValidator

import org.scalablytyped.runtime.StringDictionary
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
  
  type CustomSanitizer = js.Function2[/* input */ Any, /* meta */ Meta, Any]
  
  type CustomValidator = js.Function2[/* input */ Any, /* meta */ Meta, Any]
  
  type DynamicMessageCreator = js.Function2[/* value */ Any, /* meta */ Meta, Any]
  
  trait FieldInstance extends StObject {
    
    var location: Location
    
    var originalPath: String
    
    var originalValue: Any
    
    var path: String
    
    var value: Any
  }
  object FieldInstance {
    
    inline def apply(location: Location, originalPath: String, originalValue: Any, path: String, value: Any): FieldInstance = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalPath = originalPath.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInstance]
    }
    
    extension [Self <: FieldInstance](x: Self) {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    var location: Location
    
    var path: String
    
    var req: Request
  }
  object Meta {
    
    inline def apply(location: Location, path: String, req: Request): Meta = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
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
    
    extension [Self <: Request](x: Self) {
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.anon.Location
    - typings.expressValidator.anon.Msg
  */
  trait ValidationError extends StObject
  object ValidationError {
    
    inline def Location(location: Unit, msg: Any, nestedErrors: js.Array[ValidationError], value: Unit): typings.expressValidator.anon.Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = "_error", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expressValidator.anon.Location]
    }
    
    inline def Msg(location: Location, msg: Any, param: String, value: Any): typings.expressValidator.anon.Msg = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expressValidator.anon.Msg]
    }
  }
}
