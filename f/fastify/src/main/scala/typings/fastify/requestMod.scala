package typings.fastify

import org.scalablytyped.runtime.StringDictionary
import typings.fastify.anon.Errorvalidationanyvalidat
import typings.fastify.contextMod.FastifyContext
import typings.fastify.fastifyStrings.http
import typings.fastify.fastifyStrings.https
import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyBaseLogger
import typings.fastify.routeMod.RouteGenericInterface
import typings.fastify.schemaMod.FastifySchema
import typings.fastify.typeProviderMod.FastifyRequestType
import typings.fastify.typeProviderMod.FastifyTypeProvider
import typings.fastify.typeProviderMod.FastifyTypeProviderDefault
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerBase
import typings.fastify.utilsMod.RawServerDefault
import typings.fastify.utilsMod.RequestBodyDefault
import typings.fastify.utilsMod.RequestHeadersDefault
import typings.fastify.utilsMod.RequestParamsDefault
import typings.fastify.utilsMod.RequestQuerystringDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @js.native
  trait FastifyRequest[RouteGeneric /* <: RouteGenericInterface */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, ContextConfig, Logger /* <: FastifyBaseLogger */, RequestType /* <: FastifyRequestType[Any, Any, Any, Any] */] extends StObject {
    
    var body: /* import warning: importer.ImportType#apply Failed type conversion: RequestType['body'] */ js.Any = js.native
    
    def compileValidationSchema(schema: StringDictionary[Any]): js.Function1[/* input */ Any, Boolean] = js.native
    def compileValidationSchema(schema: StringDictionary[Any], httpPart: HTTPRequestPart): js.Function1[/* input */ Any, Boolean] = js.native
    
    // Prefer `socket` over deprecated `connection` property in node 13.0.0 or higher
    // @deprecated
    val connection: /* import warning: importer.ImportType#apply Failed type conversion: RawRequest['socket'] */ js.Any = js.native
    
    var context: FastifyContext[ContextConfig] = js.native
    
    def getValidationFunction(httpPart: HTTPRequestPart): js.Function1[/* input */ Any, Boolean] = js.native
    def getValidationFunction(schema: StringDictionary[Any]): js.Function1[/* input */ Any, Boolean] = js.native
    
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
    
    extension [Self <: RequestGenericInterface](x: Self) {
      
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
}
