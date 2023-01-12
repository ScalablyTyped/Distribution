package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod.DevExpress.data.ODataContext.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataContext extends StObject {
  
  /**
    * Invokes an OData operation that returns a value.
    */
  def get(operationName: String, params: Any): js.Promise[Any] = js.native
  
  /**
    * Invokes an OData operation that returns nothing.
    */
  def invoke(operationName: String, params: Any, httpMethod: HttpMethod): js.Promise[Unit] = js.native
  
  def objectLink(entityAlias: String, key: String): Any = js.native
  /**
    * Gets a link to an entity with a specific key.
    */
  def objectLink(entityAlias: String, key: Any): Any = js.native
  def objectLink(entityAlias: String, key: Double): Any = js.native
}
object ODataContext {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.GET
    - typings.devextreme.devextremeStrings.POST
    - typings.devextreme.devextremeStrings.PATCH
    - typings.devextreme.devextremeStrings.MERGE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def GET: typings.devextreme.devextremeStrings.GET = "GET".asInstanceOf[typings.devextreme.devextremeStrings.GET]
    
    inline def MERGE: typings.devextreme.devextremeStrings.MERGE = "MERGE".asInstanceOf[typings.devextreme.devextremeStrings.MERGE]
    
    inline def PATCH: typings.devextreme.devextremeStrings.PATCH = "PATCH".asInstanceOf[typings.devextreme.devextremeStrings.PATCH]
    
    inline def POST: typings.devextreme.devextremeStrings.POST = "POST".asInstanceOf[typings.devextreme.devextremeStrings.POST]
  }
  
  trait ODataRequestOptions extends StObject {
    
    var accepts: Any
    
    var async: Boolean
    
    var contentType: String | Boolean
    
    var data: Any
    
    var dataType: String
    
    var headers: Any
    
    var jsonp: js.UndefOr[Boolean] = js.undefined
    
    var method: String
    
    var timeout: Double
    
    var url: String
    
    var xhrFields: Any
  }
  object ODataRequestOptions {
    
    inline def apply(
      accepts: Any,
      async: Boolean,
      contentType: String | Boolean,
      data: Any,
      dataType: String,
      headers: Any,
      method: String,
      timeout: Double,
      url: String,
      xhrFields: Any
    ): ODataRequestOptions = {
      val __obj = js.Dynamic.literal(accepts = accepts.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrFields = xhrFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[ODataRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ODataRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setAccepts(value: Any): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String | Boolean): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setXhrFields(value: Any): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    }
  }
}
