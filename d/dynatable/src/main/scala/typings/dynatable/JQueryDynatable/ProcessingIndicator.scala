package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingIndicator extends js.Object {
  /** Insert the processing indicator inside the page */
  def attach(): Unit = js.native
  /**
    * Generate the html markup for the processing indicator
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery = js.native
  /** Hide the processing indicator */
  def hide(): Unit = js.native
  /** Set up the processing indicator */
  def init(): Unit = js.native
  /**
    * Position the processing indicator at the center
    *
    * @return A jQuery object containing the processing indicator
    */
  def position(): JQuery = js.native
  /** Show the processing indicator */
  def show(): Unit = js.native
}

object ProcessingIndicator {
  @scala.inline
  def apply(
    attach: () => Unit,
    create: () => JQuery,
    hide: () => Unit,
    init: () => Unit,
    position: () => JQuery,
    show: () => Unit
  ): ProcessingIndicator = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), position = js.Any.fromFunction0(position), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ProcessingIndicator]
  }
  @scala.inline
  implicit class ProcessingIndicatorOps[Self <: ProcessingIndicator] (val x: Self) extends AnyVal {
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
    def setAttach(value: () => Unit): Self = this.set("attach", js.Any.fromFunction0(value))
    @scala.inline
    def setCreate(value: () => JQuery): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setPosition(value: () => JQuery): Self = this.set("position", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

