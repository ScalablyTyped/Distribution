package typings.expoLinearGradient.anon

import typings.reactNative.mod.AccessibilityActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  name  :react-native.react-native.AccessibilityActionName,   label ? :string | undefined}> */
trait ReadonlynameAccessibility extends js.Object {
  val label: js.UndefOr[String] = js.undefined
  val name: AccessibilityActionName
}

object ReadonlynameAccessibility {
  @scala.inline
  def apply(name: AccessibilityActionName, label: String = null): ReadonlynameAccessibility = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlynameAccessibility]
  }
}

