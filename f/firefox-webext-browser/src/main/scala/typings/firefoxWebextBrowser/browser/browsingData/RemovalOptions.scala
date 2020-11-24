package typings.firefoxWebextBrowser.browser.browsingData

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* browsingData types */
/** Options that determine exactly what data will be removed. */
@js.native
trait RemovalOptions extends js.Object {
  
  /** Only remove data associated with these hostnames (only applies to cookies and localStorage). */
  var hostnames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An object whose properties specify which origin types ought to be cleared. If this object isn't specified, it defaults to clearing only "unprotected" origins. Please ensure that you _really_ want to remove application data before adding 'protectedWeb' or 'extensions'.
    */
  var originTypes: js.UndefOr[RemovalOptionsOriginTypes] = js.native
  
  /**
    * Remove data accumulated on or after this date, represented in milliseconds since the epoch (accessible via the `getTime` method of the JavaScript `Date` object). If absent, defaults to 0 (which would remove all browsing data).
    */
  var since: js.UndefOr[Date] = js.native
}
object RemovalOptions {
  
  @scala.inline
  def apply(): RemovalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovalOptions]
  }
  
  @scala.inline
  implicit class RemovalOptionsOps[Self <: RemovalOptions] (val x: Self) extends AnyVal {
    
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
    def setHostnamesVarargs(value: String*): Self = this.set("hostnames", js.Array(value :_*))
    
    @scala.inline
    def setHostnames(value: js.Array[String]): Self = this.set("hostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostnames: Self = this.set("hostnames", js.undefined)
    
    @scala.inline
    def setOriginTypes(value: RemovalOptionsOriginTypes): Self = this.set("originTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginTypes: Self = this.set("originTypes", js.undefined)
    
    @scala.inline
    def setSince(value: Date): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
  }
}
