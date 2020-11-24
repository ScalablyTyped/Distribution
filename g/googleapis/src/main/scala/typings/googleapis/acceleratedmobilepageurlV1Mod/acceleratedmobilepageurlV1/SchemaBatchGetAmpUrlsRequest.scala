package typings.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AMP URL request for a batch of URLs.
  */
@js.native
trait SchemaBatchGetAmpUrlsRequest extends js.Object {
  
  /**
    * The lookup_strategy being requested.
    */
  var lookupStrategy: js.UndefOr[String] = js.native
  
  /**
    * List of URLs to look up for the paired AMP URLs. The URLs are
    * case-sensitive. Up to 50 URLs per lookup (see [Usage
    * Limits](/amp/cache/reference/limits)).
    */
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object SchemaBatchGetAmpUrlsRequest {
  
  @scala.inline
  def apply(): SchemaBatchGetAmpUrlsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetAmpUrlsRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchGetAmpUrlsRequestOps[Self <: SchemaBatchGetAmpUrlsRequest] (val x: Self) extends AnyVal {
    
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
    def setLookupStrategy(value: String): Self = this.set("lookupStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupStrategy: Self = this.set("lookupStrategy", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
}
