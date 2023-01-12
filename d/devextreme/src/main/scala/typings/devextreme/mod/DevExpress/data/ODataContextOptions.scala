package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Async
import typings.devextreme.anon.ErrorDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ODataContextOptions extends StObject {
  
  /**
    * Specifies a function that customizes the request before it is sent to the server.
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, Unit]] = js.undefined
  
  /**
    * Specifies whether stores in the ODataContext serialize/parse date-time values.
    */
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies entity collections to be accessed.
    */
  var entities: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies a function that is executed when the ODataContext throws an error.
    */
  var errorHandler: js.UndefOr[js.Function1[/* e */ ErrorDetails, Unit]] = js.undefined
  
  /**
    * Specifies whether to convert string values to lowercase in filter and search requests. Applies to the following operations: &apos;startswith&apos;, &apos;endswith&apos;, &apos;contains&apos;, and &apos;notcontains&apos;.
    */
  var filterToLower: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether data should be sent using JSONP.
    */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the URL of an OData service.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the OData version.
    */
  var version: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to send cookies, authorization headers, and client certificates in a cross-origin request.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ODataContextOptions {
  
  inline def apply(): ODataContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataContextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ODataContextOptions] (val x: Self) extends AnyVal {
    
    inline def setBeforeSend(value: /* options */ Async => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setDeserializeDates(value: Boolean): Self = StObject.set(x, "deserializeDates", value.asInstanceOf[js.Any])
    
    inline def setDeserializeDatesUndefined: Self = StObject.set(x, "deserializeDates", js.undefined)
    
    inline def setEntities(value: Any): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setErrorHandler(value: /* e */ ErrorDetails => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setFilterToLower(value: Boolean): Self = StObject.set(x, "filterToLower", value.asInstanceOf[js.Any])
    
    inline def setFilterToLowerUndefined: Self = StObject.set(x, "filterToLower", js.undefined)
    
    inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
