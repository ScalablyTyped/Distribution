package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Async
import typings.devextreme.anon.ErrorDetails
import typings.devextreme.devextremeStrings.Decimal
import typings.devextreme.devextremeStrings.Int32
import typings.devextreme.devextremeStrings.Int64
import typings.devextreme.devextremeStrings.Single
import typings.devextreme.devextremeStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ODataStoreOptions[TItem, TKey]
  extends StObject
     with StoreOptions[TItem, TKey] {
  
  /**
    * Specifies a function that customizes the request before it is sent to the server.
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, Unit]] = js.undefined
  
  /**
    * Specifies whether the store serializes/parses date-time values.
    */
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a function that is executed when the ODataStore throws an error.
    */
  @JSName("errorHandler")
  var errorHandler_ODataStoreOptions: js.UndefOr[js.Function1[/* e */ ErrorDetails, Unit]] = js.undefined
  
  /**
    * Specifies the data field types. Accepts the following types: &apos;String&apos;, &apos;Int32&apos;, &apos;Int64&apos;, &apos;Boolean&apos;, &apos;Single&apos;, &apos;Decimal&apos; and &apos;Guid&apos;.
    */
  var fieldTypes: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies whether to convert string values to lowercase in filter and search requests. Applies to the following operations: &apos;startswith&apos;, &apos;endswith&apos;, &apos;contains&apos;, and &apos;notcontains&apos;.
    */
  var filterToLower: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether data should be sent using JSONP.
    */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the type of the key property or properties.
    */
  var keyType: js.UndefOr[
    String | Int32 | Int64 | typings.devextreme.devextremeStrings.Guid | typings.devextreme.devextremeStrings.Boolean | Single | Decimal | Any
  ] = js.undefined
  
  /**
    * Specifies the URL of an OData entity collection.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * Specifies the OData version.
    */
  var version: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to send cookies, authorization headers, and client certificates in a cross-origin request.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ODataStoreOptions {
  
  inline def apply[TItem, TKey](): ODataStoreOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataStoreOptions[TItem, TKey]]
  }
  
  extension [Self <: ODataStoreOptions[?, ?], TItem, TKey](x: Self & (ODataStoreOptions[TItem, TKey])) {
    
    inline def setBeforeSend(value: /* options */ Async => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setDeserializeDates(value: Boolean): Self = StObject.set(x, "deserializeDates", value.asInstanceOf[js.Any])
    
    inline def setDeserializeDatesUndefined: Self = StObject.set(x, "deserializeDates", js.undefined)
    
    inline def setErrorHandler(value: /* e */ ErrorDetails => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setFieldTypes(value: Any): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
    
    inline def setFieldTypesUndefined: Self = StObject.set(x, "fieldTypes", js.undefined)
    
    inline def setFilterToLower(value: Boolean): Self = StObject.set(x, "filterToLower", value.asInstanceOf[js.Any])
    
    inline def setFilterToLowerUndefined: Self = StObject.set(x, "filterToLower", js.undefined)
    
    inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setKeyType(
      value: String | Int32 | Int64 | typings.devextreme.devextremeStrings.Guid | typings.devextreme.devextremeStrings.Boolean | Single | Decimal | Any
    ): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
