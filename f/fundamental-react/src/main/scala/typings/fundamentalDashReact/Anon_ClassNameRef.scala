package typings.fundamentalDashReact

import typings.react.reactMod.Ref
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameRef extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
}

object Anon_ClassNameRef {
  @scala.inline
  def apply(className: String = null, ref: Ref[HTMLDivElement] = null): Anon_ClassNameRef = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameRef]
  }
}

