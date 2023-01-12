package typings.ethersprojectWeb

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait GetUrlResponse extends StObject {
    
    var body: js.typedarray.Uint8Array
    
    var headers: StringDictionary[String]
    
    var statusCode: Double
    
    var statusMessage: String
  }
  object GetUrlResponse {
    
    inline def apply(
      body: js.typedarray.Uint8Array,
      headers: StringDictionary[String],
      statusCode: Double,
      statusMessage: String
    ): GetUrlResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUrlResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetUrlResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var allowGzip: js.UndefOr[Boolean] = js.undefined
    
    var body: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var fetchOptions: js.UndefOr[Record[String, String]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var skipFetchSetup: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowGzip(value: Boolean): Self = StObject.set(x, "allowGzip", value.asInstanceOf[js.Any])
      
      inline def setAllowGzipUndefined: Self = StObject.set(x, "allowGzip", js.undefined)
      
      inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFetchOptions(value: Record[String, String]): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setSkipFetchSetup(value: Boolean): Self = StObject.set(x, "skipFetchSetup", value.asInstanceOf[js.Any])
      
      inline def setSkipFetchSetupUndefined: Self = StObject.set(x, "skipFetchSetup", js.undefined)
    }
  }
}
