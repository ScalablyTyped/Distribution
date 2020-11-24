package typings.gapiPagespeedonline.gapi.client.pagespeedonline

import typings.gapi.gapi.client.HttpRequest
import typings.gapiPagespeedonline.GoogleApiPageSpeedOnlineResource
import typings.gapiPagespeedonline.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pagespeedapi extends js.Object {
  
  /**
    * Runs Page Speed analysis on the page at the specified URL, and returns a Page Speed score, a list of suggestions to make that page faster, and other information.
    */
  def runpagespeed(`object`: Fields): HttpRequest[GoogleApiPageSpeedOnlineResource] = js.native
}
object pagespeedapi {
  
  @scala.inline
  def apply(runpagespeed: Fields => HttpRequest[GoogleApiPageSpeedOnlineResource]): pagespeedapi = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
    __obj.asInstanceOf[pagespeedapi]
  }
  
  @scala.inline
  implicit class pagespeedapiOps[Self <: pagespeedapi] (val x: Self) extends AnyVal {
    
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
    def setRunpagespeed(value: Fields => HttpRequest[GoogleApiPageSpeedOnlineResource]): Self = this.set("runpagespeed", js.Any.fromFunction1(value))
  }
}
