package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationEntry extends js.Object {
  /**
    * Unique id of the navigation history entry.
    */
  var id: integer = js.native
  /**
    * Title of the navigation history entry.
    */
  var title: String = js.native
  /**
    * Transition type.
    */
  var transitionType: TransitionType = js.native
  /**
    * URL of the navigation history entry.
    */
  var url: String = js.native
  /**
    * URL that the user typed in the url bar.
    */
  var userTypedURL: String = js.native
}

object NavigationEntry {
  @scala.inline
  def apply(id: integer, title: String, transitionType: TransitionType, url: String, userTypedURL: String): NavigationEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userTypedURL = userTypedURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEntry]
  }
  @scala.inline
  implicit class NavigationEntryOps[Self <: NavigationEntry] (val x: Self) extends AnyVal {
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
    def setId(value: integer): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionType(value: TransitionType): Self = this.set("transitionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserTypedURL(value: String): Self = this.set("userTypedURL", value.asInstanceOf[js.Any])
  }
  
}

