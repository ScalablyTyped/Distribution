package typings.draftDashConvert

import typings.draftDashConvert.draftDashConvertMod._Tag
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends _Tag {
  var element: ReactNode
  var empty: js.UndefOr[ReactNode] = js.undefined
}

object Anon_Element {
  @scala.inline
  def apply(element: ReactNode = null, empty: ReactNode = null): Anon_Element = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Element]
  }
}

