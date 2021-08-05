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

trait ODataStoreOptions
  extends StObject
     with StoreOptions[ODataStore] {
  
  /**
    * [descr:ODataStore.Options.beforeSend]
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, js.Any]] = js.undefined
  
  /**
    * [descr:ODataStore.Options.deserializeDates]
    */
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:ODataStore.Options.errorHandler]
    */
  @JSName("errorHandler")
  var errorHandler_ODataStoreOptions: js.UndefOr[js.Function1[/* e */ ErrorDetails, js.Any]] = js.undefined
  
  /**
    * [descr:ODataStore.Options.fieldTypes]
    */
  var fieldTypes: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:ODataStore.Options.filterToLower]
    */
  var filterToLower: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:ODataStore.Options.jsonp]
    */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:ODataStore.Options.keyType]
    */
  var keyType: js.UndefOr[
    String | Int32 | Int64 | typings.devextreme.devextremeStrings.Guid | typings.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
  ] = js.undefined
  
  /**
    * [descr:ODataStore.Options.url]
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * [descr:ODataStore.Options.version]
    */
  var version: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:ODataStore.Options.withCredentials]
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ODataStoreOptions {
  
  inline def apply(): ODataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataStoreOptions]
  }
  
  extension [Self <: ODataStoreOptions](x: Self) {
    
    inline def setBeforeSend(value: /* options */ Async => js.Any): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setDeserializeDates(value: Boolean): Self = StObject.set(x, "deserializeDates", value.asInstanceOf[js.Any])
    
    inline def setDeserializeDatesUndefined: Self = StObject.set(x, "deserializeDates", js.undefined)
    
    inline def setErrorHandler(value: /* e */ ErrorDetails => js.Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setFieldTypes(value: js.Any): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
    
    inline def setFieldTypesUndefined: Self = StObject.set(x, "fieldTypes", js.undefined)
    
    inline def setFilterToLower(value: Boolean): Self = StObject.set(x, "filterToLower", value.asInstanceOf[js.Any])
    
    inline def setFilterToLowerUndefined: Self = StObject.set(x, "filterToLower", js.undefined)
    
    inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setKeyType(
      value: String | Int32 | Int64 | typings.devextreme.devextremeStrings.Guid | typings.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
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
