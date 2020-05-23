package typings.ecmarkdown.visitorMod

import typings.ecmarkdown.nodeTypesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var enter: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var exit: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply(enter: /* node */ Node => Unit = null, exit: /* node */ Node => Unit = null): Observer = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction1(enter))
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction1(exit))
    __obj.asInstanceOf[Observer]
  }
}

