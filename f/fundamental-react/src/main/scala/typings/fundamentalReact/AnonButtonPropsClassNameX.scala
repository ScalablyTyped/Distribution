package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonPropsClassNameX extends js.Object {
  /* Additional props to be spread to the header expand/collapse `<button>` element. */
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
}

object AnonButtonPropsClassNameX {
  @scala.inline
  def apply(buttonProps: StringDictionary[js.Any] = null, className: String = null): AnonButtonPropsClassNameX = {
    val __obj = js.Dynamic.literal()
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonPropsClassNameX]
  }
}

