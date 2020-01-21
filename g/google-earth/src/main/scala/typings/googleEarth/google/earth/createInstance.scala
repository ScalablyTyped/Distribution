package typings.googleEarth.google.earth

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.createInstance")
@js.native
object createInstance extends js.Object {
  def apply(
    domNode: String,
    initCallback: js.Function1[/* plugin */ GEPlugin, Unit],
    failureCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def apply(
    domNode: String,
    initCallback: js.Function1[/* plugin */ GEPlugin, Unit],
    failureCallback: js.Function1[/* error */ js.Any, Unit],
    options: js.Any
  ): Unit = js.native
  def apply(
    domNode: Element,
    initCallback: js.Function1[/* plugin */ GEPlugin, Unit],
    failureCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def apply(
    domNode: Element,
    initCallback: js.Function1[/* plugin */ GEPlugin, Unit],
    failureCallback: js.Function1[/* error */ js.Any, Unit],
    options: js.Any
  ): Unit = js.native
}

