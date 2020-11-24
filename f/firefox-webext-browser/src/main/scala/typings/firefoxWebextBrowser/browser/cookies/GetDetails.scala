package typings.firefoxWebextBrowser.browser.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details to identify the cookie being retrieved. */
@js.native
trait GetDetails extends js.Object {
  
  /**
    * The first-party domain which the cookie to retrieve is associated. This attribute is required if First-Party Isolation is enabled.
    */
  var firstPartyDomain: js.UndefOr[String] = js.native
  
  /** The name of the cookie to retrieve. */
  var name: String = js.native
  
  /**
    * The ID of the cookie store in which to look for the cookie. By default, the current execution context's cookie store will be used.
    */
  var storeId: js.UndefOr[String] = js.native
  
  /**
    * The URL with which the cookie to retrieve is associated. This argument may be a full URL, in which case any data following the URL path (e.g. the query string) is simply ignored. If host permissions for this URL are not specified in the manifest file, the API call will fail.
    */
  var url: String = js.native
}
object GetDetails {
  
  @scala.inline
  def apply(name: String, url: String): GetDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetails]
  }
  
  @scala.inline
  implicit class GetDetailsOps[Self <: GetDetails] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPartyDomain(value: String): Self = this.set("firstPartyDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPartyDomain: Self = this.set("firstPartyDomain", js.undefined)
    
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
  }
}
