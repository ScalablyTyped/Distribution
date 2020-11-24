package typings.expoWebBrowser.webBrowserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebBrowserCustomTabsResults extends js.Object {
  
  var browserPackages: js.Array[String] = js.native
  
  var defaultBrowserPackage: js.UndefOr[String] = js.native
  
  var preferredBrowserPackage: js.UndefOr[String] = js.native
  
  var servicePackages: js.Array[String] = js.native
}
object WebBrowserCustomTabsResults {
  
  @scala.inline
  def apply(browserPackages: js.Array[String], servicePackages: js.Array[String]): WebBrowserCustomTabsResults = {
    val __obj = js.Dynamic.literal(browserPackages = browserPackages.asInstanceOf[js.Any], servicePackages = servicePackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserCustomTabsResults]
  }
  
  @scala.inline
  implicit class WebBrowserCustomTabsResultsOps[Self <: WebBrowserCustomTabsResults] (val x: Self) extends AnyVal {
    
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
    def setBrowserPackagesVarargs(value: String*): Self = this.set("browserPackages", js.Array(value :_*))
    
    @scala.inline
    def setBrowserPackages(value: js.Array[String]): Self = this.set("browserPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePackagesVarargs(value: String*): Self = this.set("servicePackages", js.Array(value :_*))
    
    @scala.inline
    def setServicePackages(value: js.Array[String]): Self = this.set("servicePackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBrowserPackage(value: String): Self = this.set("defaultBrowserPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBrowserPackage: Self = this.set("defaultBrowserPackage", js.undefined)
    
    @scala.inline
    def setPreferredBrowserPackage(value: String): Self = this.set("preferredBrowserPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredBrowserPackage: Self = this.set("preferredBrowserPackage", js.undefined)
  }
}
