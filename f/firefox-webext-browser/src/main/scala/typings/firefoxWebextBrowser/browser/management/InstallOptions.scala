package typings.firefoxWebextBrowser.browser.management

import typings.firefoxWebextBrowser.browser.manifest.HttpURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallOptions extends js.Object {
  
  /** A hash of the XPI file, using sha256 or stronger. */
  var hash: js.UndefOr[String] = js.native
  
  /** URL pointing to the XPI file on addons.mozilla.org or similar. */
  var url: HttpURL = js.native
}
object InstallOptions {
  
  @scala.inline
  def apply(url: HttpURL): InstallOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallOptions]
  }
  
  @scala.inline
  implicit class InstallOptionsOps[Self <: InstallOptions] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: HttpURL): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
  }
}
