package typings.fastify

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.distTypesMod.ErrorObject
import typings.fastify.anon.Errorvalidationanyvalidat
import typings.fastify.fastifyStrings.http
import typings.fastify.fastifyStrings.https
import typings.fastify.typesContextMod.FastifyContext
import typings.fastify.typesContextMod.FastifyContextConfig
import typings.fastify.typesInstanceMod.FastifyInstance
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.fastify.typesRouteMod.RouteGenericInterface
import typings.fastify.typesSchemaMod.FastifySchema
import typings.fastify.typesTypeProviderMod.FastifyRequestType
import typings.fastify.typesTypeProviderMod.FastifyTypeProvider
import typings.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typings.fastify.typesUtilsMod.RawReplyDefaultExpression
import typings.fastify.typesUtilsMod.RawRequestDefaultExpression
import typings.fastify.typesUtilsMod.RawServerBase
import typings.fastify.typesUtilsMod.RawServerDefault
import typings.fastify.typesUtilsMod.RequestBodyDefault
import typings.fastify.typesUtilsMod.RequestHeadersDefault
import typings.fastify.typesUtilsMod.RequestParamsDefault
import typings.fastify.typesUtilsMod.RequestQuerystringDefault
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestMod {
  
  @js.native
  trait FastifyRequest[RouteGeneric /* <: RouteGenericInterface */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, ContextConfig, Logger /* <: FastifyBaseLogger */, RequestType /* <: FastifyRequestType[Any, Any, Any, Any] */] extends StObject {
    
    var body: /* import warning: importer.ImportType#apply Failed type conversion: RequestType['body'] */ js.Any = js.native
    
    def compileValidationSchema(schema: StringDictionary[Any]): ValidationFunction = js.native
    def compileValidationSchema(schema: StringDictionary[Any], httpPart: HTTPRequestPart): ValidationFunction = js.native
    
    // Prefer `socket` over deprecated `connection` property in node 13.0.0 or higher
    // @deprecated
    val connection: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any = js.native
    
    var context: FastifyContext[ContextConfig] = js.native
    
    def getValidationFunction(httpPart: HTTPRequestPart): ValidationFunction = js.native
    def getValidationFunction(schema: StringDictionary[Any]): ValidationFunction = js.native
    
    var headers: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['headers'] */ js.Any = js.native
    
    val hostname: String = js.native
    
    var id: Any = js.native
    
    // this enables the developer to extend the existing http(s|2) headers list
    val ip: String = js.native
    
    val ips: js.UndefOr[js.Array[String]] = js.native
    
    val is404: Boolean = js.native
    
    // this enables the developer to extend the existing http(s|2) headers list
    var log: Logger = js.native
    
    val method: String = js.native
    
    var params: /* import warning: importer.ImportType#apply Failed type conversion: RequestType['params'] */ js.Any = js.native
    
    val protocol: http | https = js.native
    
    var query: /* import warning: importer.ImportType#apply Failed type conversion: RequestType['query'] */ js.Any = js.native
    
    // deferred inference
    var raw: RawRequest = js.native
    
    /**
      * @deprecated Use `raw` property
      */
    val req: RawRequest & (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Headers'] */ js.Any) = js.native
    
    var routeConfig: FastifyContextConfig & ContextConfig = js.native
    
    var routeSchema: FastifySchema = js.native
    
    val routerMethod: String = js.native
    
    val routerPath: String = js.native
    
    var server: FastifyInstance[
        RawServerDefault, 
        RawRequestDefaultExpression[RawServerDefault], 
        RawReplyDefaultExpression[RawServerDefault], 
        FastifyBaseLogger, 
        FastifyTypeProviderDefault
      ] = js.native
    
    val socket: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any = js.native
    
    val url: String = js.native
    
    def validateInput(input: Any): Boolean = js.native
    def validateInput(input: Any, httpPart: HTTPRequestPart): Boolean = js.native
    def validateInput(input: Any, schema: StringDictionary[Any]): Boolean = js.native
    def validateInput(input: Any, schema: StringDictionary[Any], httpPart: HTTPRequestPart): Boolean = js.native
    
    /** in order for this to be used the user should ensure they have set the attachValidation option. */
    var validationError: js.UndefOr[Errorvalidationanyvalidat] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastify.fastifyStrings.body
    - typings.fastify.fastifyStrings.query
    - typings.fastify.fastifyStrings.querystring
    - typings.fastify.fastifyStrings.params
    - typings.fastify.fastifyStrings.headers
  */
  trait HTTPRequestPart extends StObject
  object HTTPRequestPart {
    
    inline def body: typings.fastify.fastifyStrings.body = "body".asInstanceOf[typings.fastify.fastifyStrings.body]
    
    inline def headers: typings.fastify.fastifyStrings.headers = "headers".asInstanceOf[typings.fastify.fastifyStrings.headers]
    
    inline def params: typings.fastify.fastifyStrings.params = "params".asInstanceOf[typings.fastify.fastifyStrings.params]
    
    inline def query: typings.fastify.fastifyStrings.query = "query".asInstanceOf[typings.fastify.fastifyStrings.query]
    
    inline def querystring: typings.fastify.fastifyStrings.querystring = "querystring".asInstanceOf[typings.fastify.fastifyStrings.querystring]
  }
  
  trait RequestGenericInterface extends StObject {
    
    var Body: js.UndefOr[RequestBodyDefault] = js.undefined
    
    var Headers: js.UndefOr[RequestHeadersDefault] = js.undefined
    
    var Params: js.UndefOr[RequestParamsDefault] = js.undefined
    
    var Querystring: js.UndefOr[RequestQuerystringDefault] = js.undefined
  }
  object RequestGenericInterface {
    
    inline def apply(): RequestGenericInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestGenericInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestGenericInterface] (val x: Self) extends AnyVal {
      
      inline def setBody(value: RequestBodyDefault): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setHeaders(value: RequestHeadersDefault): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
      
      inline def setParams(value: RequestParamsDefault): Self = StObject.set(x, "Params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "Params", js.undefined)
      
      inline def setQuerystring(value: RequestQuerystringDefault): Self = StObject.set(x, "Querystring", value.asInstanceOf[js.Any])
      
      inline def setQuerystringUndefined: Self = StObject.set(x, "Querystring", js.undefined)
    }
  }
  
  @js.native
  trait ValidationFunction extends StObject {
    
    def apply(input: Any): Boolean = js.native
    
    var errors: js.UndefOr[Null | (js.Array[ErrorObject[String, Record[String, Any], Any]])] = js.native
  }
}
