package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transaction Related Information
  */
@js.native
trait BundleEntryResponse extends BackboneElement {
  
  /**
    * Contains extended information for property 'etag'.
    */
  var _etag: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'lastModified'.
    */
  var _lastModified: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'location'.
    */
  var _location: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * The etag for the resource (if relevant)
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Server's date time modified
    */
  var lastModified: js.UndefOr[instant] = js.native
  
  /**
    * The location, if the operation returns a location
    */
  var location: js.UndefOr[uri] = js.native
  
  /**
    * OperationOutcome with hints and warnings (for batch/transaction)
    */
  var outcome: js.UndefOr[Resource] = js.native
  
  /**
    * Status response code (text optional)
    */
  var status: String = js.native
}
object BundleEntryResponse {
  
  @scala.inline
  def apply(status: String): BundleEntryResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryResponse]
  }
  
  @scala.inline
  implicit class BundleEntryResponseOps[Self <: BundleEntryResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_etag(value: Element): Self = this.set("_etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_etag: Self = this.set("_etag", js.undefined)
    
    @scala.inline
    def set_lastModified(value: Element): Self = this.set("_lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lastModified: Self = this.set("_lastModified", js.undefined)
    
    @scala.inline
    def set_location(value: Element): Self = this.set("_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_location: Self = this.set("_location", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setLastModified(value: instant): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setLocation(value: uri): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setOutcome(value: Resource): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
  }
}
