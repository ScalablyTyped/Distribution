package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.anon.Cancel
import typings.googleGax.buildSrcFallbackMod.AuthClient
import typings.googleGax.buildSrcStreamArrayParserMod.StreamArrayParser
import typings.node.bufferMod.global.Buffer
import typings.protobufjs.mod.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFallbackServiceStubMod {
  
  @JSImport("google-gax/build/src/fallbackServiceStub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateServiceStub(
    rpcs: StringDictionary[Method],
    protocol: String,
    servicePath: String,
    servicePort: Double,
    authClient: AuthClient,
    requestEncoder: js.Function6[
      /* rpc */ Method, 
      /* protocol */ String, 
      /* servicePath */ String, 
      /* servicePort */ Double, 
      /* request */ js.Object, 
      /* numericEnums */ Boolean, 
      FetchParameters
    ],
    responseDecoder: js.Function3[
      /* rpc */ Method, 
      /* ok */ Boolean, 
      /* response */ Buffer | js.typedarray.ArrayBuffer, 
      js.Object
    ],
    numericEnums: Boolean
  ): FallbackServiceStub = (^.asInstanceOf[js.Dynamic].applyDynamic("generateServiceStub")(rpcs.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], servicePath.asInstanceOf[js.Any], servicePort.asInstanceOf[js.Any], authClient.asInstanceOf[js.Any], requestEncoder.asInstanceOf[js.Any], responseDecoder.asInstanceOf[js.Any], numericEnums.asInstanceOf[js.Any])).asInstanceOf[FallbackServiceStub]
  
  type FallbackServiceStub = StringDictionary[
    js.Function4[
      /* request */ js.Object, 
      /* options */ js.UndefOr[js.Object], 
      /* metadata */ js.UndefOr[js.Object], 
      /* callback */ js.UndefOr[
        js.Function2[/* err */ js.UndefOr[js.Error], /* response */ js.UndefOr[js.Object], Unit]
      ], 
      StreamArrayParser | Cancel
    ]
  ]
  
  trait FetchParameters extends StObject {
    
    var body: Buffer | js.typedarray.Uint8Array | String
    
    var headers: StringDictionary[String]
    
    var method: FetchParametersMethod
    
    var url: String
  }
  object FetchParameters {
    
    inline def apply(
      body: Buffer | js.typedarray.Uint8Array | String,
      headers: StringDictionary[String],
      method: FetchParametersMethod,
      url: String
    ): FetchParameters = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchParameters] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Buffer | js.typedarray.Uint8Array | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: FetchParametersMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleGax.googleGaxStrings.GET
    - typings.googleGax.googleGaxStrings.POST
    - typings.googleGax.googleGaxStrings.PUT
    - typings.googleGax.googleGaxStrings.PATCH
    - typings.googleGax.googleGaxStrings.DELETE
  */
  trait FetchParametersMethod extends StObject
  object FetchParametersMethod {
    
    inline def DELETE: typings.googleGax.googleGaxStrings.DELETE = "DELETE".asInstanceOf[typings.googleGax.googleGaxStrings.DELETE]
    
    inline def GET: typings.googleGax.googleGaxStrings.GET = "GET".asInstanceOf[typings.googleGax.googleGaxStrings.GET]
    
    inline def PATCH: typings.googleGax.googleGaxStrings.PATCH = "PATCH".asInstanceOf[typings.googleGax.googleGaxStrings.PATCH]
    
    inline def POST: typings.googleGax.googleGaxStrings.POST = "POST".asInstanceOf[typings.googleGax.googleGaxStrings.POST]
    
    inline def PUT: typings.googleGax.googleGaxStrings.PUT = "PUT".asInstanceOf[typings.googleGax.googleGaxStrings.PUT]
  }
}
