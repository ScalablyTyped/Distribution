package typings.draftConvert.anon

import typings.draftConvert.mod._Tag
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends _Tag {
  var element: ReactNode
  var empty: js.UndefOr[ReactNode] = js.undefined
}

object Element {
  @scala.inline
  def apply(element: ReactNode = null, empty: ReactNode = null): Element = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

