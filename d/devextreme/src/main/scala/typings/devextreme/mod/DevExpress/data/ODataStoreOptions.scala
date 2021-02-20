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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataStoreOptions extends StoreOptions[ODataStore] {
  
  /**
    * [descr:ODataStore.Options.beforeSend]
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, _]] = js.native
  
  /**
    * [descr:ODataStore.Options.deserializeDates]
    */
  var deserializeDates: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataStore.Options.errorHandler]
    */
  @JSName("errorHandler")
  var errorHandler_ODataStoreOptions: js.UndefOr[js.Function1[/* e */ ErrorDetails, _]] = js.native
  
  /**
    * [descr:ODataStore.Options.fieldTypes]
    */
  var fieldTypes: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:ODataStore.Options.filterToLower]
    */
  var filterToLower: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataStore.Options.jsonp]
    */
  var jsonp: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataStore.Options.keyType]
    */
  var keyType: js.UndefOr[
    String | Int32 | Int64 | typings.devextreme.devextremeStrings.Guid | typings.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
  ] = js.native
  
  /**
    * [descr:ODataStore.Options.url]
    */
  var url: js.UndefOr[java.lang.String] = js.native
  
  /**
    * [descr:ODataStore.Options.version]
    */
  var version: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ODataStore.Options.withCredentials]
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object ODataStoreOptions {
  
  @scala.inline
  def apply(): ODataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataStoreOptions]
  }
  
  @scala.inline
  implicit class ODataStoreOptionsMutableBuilder[Self <: ODataStoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeSend(value: /* options */ Async => _): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setDeserializeDates(value: Boolean): Self = StObject.set(x, "deserializeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserializeDatesUndefined: Self = StObject.set(x, "deserializeDates", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* e */ ErrorDetails => _): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    @scala.inline
    def setFieldTypes(value: js.Any): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTypesUndefined: Self = StObject.set(x, "fieldTypes", js.undefined)
    
    @scala.inline
    def setFilterToLower(value: Boolean): Self = StObject.set(x, "filterToLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterToLowerUndefined: Self = StObject.set(x, "filterToLower", js.undefined)
    
    @scala.inline
    def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setKeyType(
      value: String | Int32 | Int64 | typings.devextreme.devextremeStrings.Guid | typings.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
    ): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
