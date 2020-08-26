package typings.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPagespeedonline.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagespeedapiResource extends js.Object {
  /**
    * Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other
    * information.
    */
  def runpagespeed(request: Alt): Request[Result] = js.native
}

object PagespeedapiResource {
  @scala.inline
  def apply(runpagespeed: Alt => Request[Result]): PagespeedapiResource = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
    __obj.asInstanceOf[PagespeedapiResource]
  }
  @scala.inline
  implicit class PagespeedapiResourceOps[Self <: PagespeedapiResource] (val x: Self) extends AnyVal {
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
    def setRunpagespeed(value: Alt => Request[Result]): Self = this.set("runpagespeed", js.Any.fromFunction1(value))
  }
  
}

