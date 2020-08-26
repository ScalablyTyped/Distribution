package typings.elementReady.mod

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Automatically stop checking for the element to be ready after the DOM ready event. The promise is then resolved to `undefined`.
  		@default true
  		*/
  val stopOnDomReady: js.UndefOr[Boolean] = js.native
  /**
  		The element that's expected to contain a match.
  		@default document
  		*/
  val target: js.UndefOr[Element | Document] = js.native
  /**
  		Milliseconds to wait before stopping the search and resolving the promise to `undefined`.
  		@default Infinity
  		*/
  val timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setStopOnDomReady(value: Boolean): Self = this.set("stopOnDomReady", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnDomReady: Self = this.set("stopOnDomReady", js.undefined)
    @scala.inline
    def setTarget(value: Element | Document): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

