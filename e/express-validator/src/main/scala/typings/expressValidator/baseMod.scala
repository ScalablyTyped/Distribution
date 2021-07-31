package typings.expressValidator

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("express-validator/src/base", "ValidationHalt")
  @js.native
  class ValidationHalt ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("express-validator/src/base", "contextsKey")
  @js.native
  val contextsKey: /* "express-validator#contexts" */ String = js.native
  
  type CustomSanitizer = js.Function2[/* input */ js.Any, /* meta */ Meta, js.Any]
  
  type CustomValidator = js.Function2[/* input */ js.Any, /* meta */ Meta, js.Any]
  
  type DynamicMessageCreator = js.Function2[/* value */ js.Any, /* meta */ Meta, js.Any]
  
  trait FieldInstance extends StObject {
    
    var location: Location
    
    var originalPath: String
    
    var originalValue: js.Any
    
    var path: String
    
    var value: js.Any
  }
  object FieldInstance {
    
    @scala.inline
    def apply(location: Location, originalPath: String, originalValue: js.Any, path: String, value: js.Any): FieldInstance = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], originalPath = originalPath.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInstance]
    }
    
    @scala.inline
    implicit class FieldInstanceMutableBuilder[Self <: FieldInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def body: typings.expressValidator.expressValidatorStrings.body = "body".asInstanceOf[typings.expressValidator.expressValidatorStrings.body]
    
    @scala.inline
    def cookies: typings.expressValidator.expressValidatorStrings.cookies = "cookies".asInstanceOf[typings.expressValidator.expressValidatorStrings.cookies]
    
    @scala.inline
    def headers: typings.expressValidator.expressValidatorStrings.headers = "headers".asInstanceOf[typings.expressValidator.expressValidatorStrings.headers]
    
    @scala.inline
    def params: typings.expressValidator.expressValidatorStrings.params = "params".asInstanceOf[typings.expressValidator.expressValidatorStrings.params]
    
    @scala.inline
    def query: typings.expressValidator.expressValidatorStrings.query = "query".asInstanceOf[typings.expressValidator.expressValidatorStrings.query]
  }
  
  trait Meta extends StObject {
    
    var location: Location
    
    var path: String
    
    var req: Request
  }
  object Meta {
    
    @scala.inline
    def apply(location: Location, path: String, req: Request): Meta = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: Request): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  type Middleware = js.Function3[
    /* req */ Request, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  trait Request
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var cookies: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var headers: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var params: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var query: js.UndefOr[Record[String, js.Any]] = js.undefined
  }
  object Request {
    
    @scala.inline
    def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCookies(value: Record[String, js.Any]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setParams(value: Record[String, js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuery(value: Record[String, js.Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  @js.native
  trait StandardSanitizer extends StObject {
    
    def apply(input: String, options: js.Any*): js.Any = js.native
  }
  
  @js.native
  trait StandardValidator extends StObject {
    
    def apply(input: String, options: js.Any*): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.anon.Location
    - typings.expressValidator.anon.Msg
  */
  trait ValidationError extends StObject
  object ValidationError {
    
    @scala.inline
    def Location(
      location: Unit,
      msg: js.Any,
      nestedErrors: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
        ],
      value: Unit
    ): typings.expressValidator.anon.Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = "_error", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expressValidator.anon.Location]
    }
    
    @scala.inline
    def Msg(location: Location, msg: js.Any, param: String, value: js.Any): typings.expressValidator.anon.Msg = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expressValidator.anon.Msg]
    }
  }
}
