package typings.dynatable.JQueryDynatable

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /** Set up a listener for popstate event on window */
  def init(): Unit = js.native
  /**
    * Check if pushState option is true, and if browser supports it
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean = js.native
  /**
    * Handler for the popstate event
    *
    * @param event The native popstate event
    */
  def pop(event: Event): Unit = js.native
  /**
    * Update the URL data using pushState
    *
    * @param data An object with the parameters we want to push
    */
  def push(data: js.Object): Unit = js.native
}

object State {
  @scala.inline
  def apply(init: () => Unit, initOnLoad: () => Boolean, pop: Event => Unit, push: js.Object => Unit): State = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), pop = js.Any.fromFunction1(pop), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setInitOnLoad(value: () => Boolean): Self = this.set("initOnLoad", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: Event => Unit): Self = this.set("pop", js.Any.fromFunction1(value))
    @scala.inline
    def setPush(value: js.Object => Unit): Self = this.set("push", js.Any.fromFunction1(value))
  }
  
}

