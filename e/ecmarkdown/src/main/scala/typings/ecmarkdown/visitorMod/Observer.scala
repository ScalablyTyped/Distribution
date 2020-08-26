package typings.ecmarkdown.visitorMod

import typings.ecmarkdown.nodeTypesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer extends js.Object {
  var enter: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  var exit: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
}

object Observer {
  @scala.inline
  def apply(): Observer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observer]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer] (val x: Self) extends AnyVal {
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
    def setEnter(value: /* node */ Node => Unit): Self = this.set("enter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setExit(value: /* node */ Node => Unit): Self = this.set("exit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
  
}

