package typings.firefoxWebextBrowser.browser.topSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOptions extends js.Object {
  
  /** Include sites that the user has blocked from appearing on the Firefox new tab. */
  var includeBlocked: js.UndefOr[Boolean] = js.native
  
  /** Include sites favicon if available. */
  var includeFavicon: js.UndefOr[Boolean] = js.native
  
  /** Include sites that the user has pinned on the Firefox new tab. */
  var includePinned: js.UndefOr[Boolean] = js.native
  
  /** Include search shortcuts appearing on the Firefox new tab. */
  var includeSearchShortcuts: js.UndefOr[Boolean] = js.native
  
  /** The number of top sites to return, defaults to the value used by Firefox */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Return the sites that exactly appear on the user's new-tab page. When true, all other options are ignored except limit and includeFavicon. If the user disabled newtab Top Sites, the newtab parameter will be ignored.
    */
  var newtab: js.UndefOr[Boolean] = js.native
  
  /** Limit the result to a single top site link per domain */
  var onePerDomain: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Please use the other options to tune the results received from topSites. */
  var providers: js.UndefOr[js.Array[String]] = js.native
}
object GetOptions {
  
  @scala.inline
  def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  
  @scala.inline
  implicit class GetOptionsOps[Self <: GetOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeBlocked(value: Boolean): Self = this.set("includeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeBlocked: Self = this.set("includeBlocked", js.undefined)
    
    @scala.inline
    def setIncludeFavicon(value: Boolean): Self = this.set("includeFavicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFavicon: Self = this.set("includeFavicon", js.undefined)
    
    @scala.inline
    def setIncludePinned(value: Boolean): Self = this.set("includePinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePinned: Self = this.set("includePinned", js.undefined)
    
    @scala.inline
    def setIncludeSearchShortcuts(value: Boolean): Self = this.set("includeSearchShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSearchShortcuts: Self = this.set("includeSearchShortcuts", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setNewtab(value: Boolean): Self = this.set("newtab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewtab: Self = this.set("newtab", js.undefined)
    
    @scala.inline
    def setOnePerDomain(value: Boolean): Self = this.set("onePerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnePerDomain: Self = this.set("onePerDomain", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: String*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[String]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
  }
}
