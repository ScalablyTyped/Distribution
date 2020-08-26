package typings.expectPuppeteer.mod

import typings.expectPuppeteer.expectPuppeteerStrings.left
import typings.expectPuppeteer.expectPuppeteerStrings.middle
import typings.expectPuppeteer.expectPuppeteerStrings.right
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectToClickOptions extends ExpectTimingActions {
  /**
    * Defaults to left.
    */
  var button: js.UndefOr[left | right | middle] = js.native
  /**
    * defaults to 1. See UIEvent.detail.
    */
  var clickCount: js.UndefOr[Double] = js.native
  /**
    * A text or a RegExp to match in element textContent.
    */
  var text: js.UndefOr[String | RegExp] = js.native
  /**
    * wait for element to be present in DOM and to be visible, i.e. to not have display: none or visibility: hidden CSS properties. Defaults to false.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ExpectToClickOptions {
  @scala.inline
  def apply(): ExpectToClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpectToClickOptions]
  }
  @scala.inline
  implicit class ExpectToClickOptionsOps[Self <: ExpectToClickOptions] (val x: Self) extends AnyVal {
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
    def setButton(value: left | right | middle): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setClickCount(value: Double): Self = this.set("clickCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickCount: Self = this.set("clickCount", js.undefined)
    @scala.inline
    def setText(value: String | RegExp): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

