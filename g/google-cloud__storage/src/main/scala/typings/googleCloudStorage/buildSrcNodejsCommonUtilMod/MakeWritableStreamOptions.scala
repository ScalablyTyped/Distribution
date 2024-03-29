package typings.googleCloudStorage.buildSrcNodejsCommonUtilMod

import typings.googleCloudStorage.anon.ContentType
import typings.googleCloudStorage.anon.OnAuthenticated
import typings.teenyRequest.mod.Options
import typings.teenyRequest.mod.OptionsWithUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeWritableStreamOptions extends StObject {
  
  /**
    * A connection instance used to get a token with and send the request
    * through.
    */
  var connection: js.UndefOr[js.Object] = js.undefined
  
  def makeAuthenticatedRequest(reqOpts: OptionsWithUri, fnobj: OnAuthenticated): Unit
  
  /**
    * Metadata to send at the head of the request.
    */
  var metadata: js.UndefOr[ContentType] = js.undefined
  
  /**
    * Request object, in the format of a standard Node.js http.request() object.
    */
  var request: js.UndefOr[Options] = js.undefined
}
object MakeWritableStreamOptions {
  
  inline def apply(makeAuthenticatedRequest: (OptionsWithUri, OnAuthenticated) => Unit): MakeWritableStreamOptions = {
    val __obj = js.Dynamic.literal(makeAuthenticatedRequest = js.Any.fromFunction2(makeAuthenticatedRequest))
    __obj.asInstanceOf[MakeWritableStreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MakeWritableStreamOptions] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: js.Object): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setMakeAuthenticatedRequest(value: (OptionsWithUri, OnAuthenticated) => Unit): Self = StObject.set(x, "makeAuthenticatedRequest", js.Any.fromFunction2(value))
    
    inline def setMetadata(value: ContentType): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRequest(value: Options): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
