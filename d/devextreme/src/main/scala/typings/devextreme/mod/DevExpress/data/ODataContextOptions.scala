package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Async
import typings.devextreme.anon.ErrorDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ODataContextOptions extends StObject {
  
  /**
    * [descr:ODataContext.Options.beforeSend]
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, js.Any]] = js.undefined
  
  /**
    * [descr:ODataContext.Options.deserializeDates]
    */
  var deserializeDates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:ODataContext.Options.entities]
    */
  var entities: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [descr:ODataContext.Options.errorHandler]
    */
  var errorHandler: js.UndefOr[js.Function1[/* e */ ErrorDetails, js.Any]] = js.undefined
  
  /**
    * [descr:ODataContext.Options.filterToLower]
    */
  var filterToLower: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:ODataContext.Options.jsonp]
    */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:ODataContext.Options.url]
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:ODataContext.Options.version]
    */
  var version: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:ODataContext.Options.withCredentials]
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ODataContextOptions {
  
  @scala.inline
  def apply(): ODataContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataContextOptions]
  }
  
  @scala.inline
  implicit class ODataContextOptionsMutableBuilder[Self <: ODataContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeSend(value: /* options */ Async => js.Any): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setDeserializeDates(value: Boolean): Self = StObject.set(x, "deserializeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserializeDatesUndefined: Self = StObject.set(x, "deserializeDates", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Any): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* e */ ErrorDetails => js.Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    @scala.inline
    def setFilterToLower(value: Boolean): Self = StObject.set(x, "filterToLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterToLowerUndefined: Self = StObject.set(x, "filterToLower", js.undefined)
    
    @scala.inline
    def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
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
