package typings.f1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait F1Options extends js.Object {
  var name: String
  var onState: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var parsers: js.Any
  var states: js.Any
  var targets: js.Any
  var transitions: js.Array[_]
}

object F1Options {
  @scala.inline
  def apply(
    name: String,
    parsers: js.Any,
    states: js.Any,
    targets: js.Any,
    transitions: js.Array[_],
    onState: /* repeated */ js.Any => Unit = null,
    onUpdate: /* repeated */ js.Any => Unit = null
  ): F1Options = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    if (onState != null) __obj.updateDynamic("onState")(js.Any.fromFunction1(onState))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    __obj.asInstanceOf[F1Options]
  }
}

