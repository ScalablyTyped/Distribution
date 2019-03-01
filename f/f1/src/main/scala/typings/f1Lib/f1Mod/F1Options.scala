package typings
package f1Lib.f1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait F1Options extends js.Object {
  var name: java.lang.String
  var onState: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var parsers: js.Any
  var states: js.Any
  var targets: js.Any
  var transitions: js.Array[_]
}

object F1Options {
  @scala.inline
  def apply(
    name: java.lang.String,
    parsers: js.Any,
    states: js.Any,
    targets: js.Any,
    transitions: js.Array[_],
    onState: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    onUpdate: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): F1Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parsers")(parsers)
    __obj.updateDynamic("states")(states)
    __obj.updateDynamic("targets")(targets)
    __obj.updateDynamic("transitions")(transitions)
    if (onState != null) __obj.updateDynamic("onState")(onState)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.asInstanceOf[F1Options]
  }
}

