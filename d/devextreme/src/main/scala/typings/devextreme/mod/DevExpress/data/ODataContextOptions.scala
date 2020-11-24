package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Async
import typings.devextreme.anon.ErrorDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataContextOptions extends js.Object {
  
  /**
    * [descr:ODataContext.Options.beforeSend]
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, _]] = js.native
  
  /**
    * [descr:ODataContext.Options.deserializeDates]
    */
  var deserializeDates: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataContext.Options.entities]
    */
  var entities: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:ODataContext.Options.errorHandler]
    */
  var errorHandler: js.UndefOr[js.Function1[/* e */ ErrorDetails, _]] = js.native
  
  /**
    * [descr:ODataContext.Options.filterToLower]
    */
  var filterToLower: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataContext.Options.jsonp]
    */
  var jsonp: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataContext.Options.url]
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * [descr:ODataContext.Options.version]
    */
  var version: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ODataContext.Options.withCredentials]
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object ODataContextOptions {
  
  @scala.inline
  def apply(): ODataContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataContextOptions]
  }
  
  @scala.inline
  implicit class ODataContextOptionsOps[Self <: ODataContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeforeSend(value: /* options */ Async => _): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    
    @scala.inline
    def setDeserializeDates(value: Boolean): Self = this.set("deserializeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeserializeDates: Self = this.set("deserializeDates", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Any): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* e */ ErrorDetails => _): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setFilterToLower(value: Boolean): Self = this.set("filterToLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterToLower: Self = this.set("filterToLower", js.undefined)
    
    @scala.inline
    def setJsonp(value: Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
