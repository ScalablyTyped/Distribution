package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import typings.firefoxWebextBrowser.browser.history.TransitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition extends js.Object {
  /** The title of the page. */
  var title: js.UndefOr[String] = js.native
  /** The transition type for this visit from its referrer. */
  var transition: js.UndefOr[TransitionType] = js.native
  /** The URL to add. Must be a valid URL that can be added to history. */
  var url: String = js.native
  /** The date when this visit occurred. */
  var visitTime: js.UndefOr[Date] = js.native
}

object Transition {
  @scala.inline
  def apply(url: String): Transition = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  @scala.inline
  implicit class TransitionOps[Self <: Transition] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransition(value: TransitionType): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setVisitTime(value: Date): Self = this.set("visitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisitTime: Self = this.set("visitTime", js.undefined)
  }
  
}

