package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeardownTag extends js.Object {
  /** If true, fire the teardown tag if and only if the main tag fires successfully. If false, fire the teardown tag regardless of main tag firing status. */
  var stopTeardownOnFailure: js.UndefOr[Boolean] = js.native
  /** The name of the teardown tag. */
  var tagName: js.UndefOr[String] = js.native
}

object TeardownTag {
  @scala.inline
  def apply(): TeardownTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeardownTag]
  }
  @scala.inline
  implicit class TeardownTagOps[Self <: TeardownTag] (val x: Self) extends AnyVal {
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
    def setStopTeardownOnFailure(value: Boolean): Self = this.set("stopTeardownOnFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopTeardownOnFailure: Self = this.set("stopTeardownOnFailure", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
  
}

