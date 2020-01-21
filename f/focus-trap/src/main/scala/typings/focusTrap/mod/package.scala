package typings.focusTrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActivateOptions = typings.std.Pick[typings.focusTrap.mod.Options, typings.focusTrap.focusTrapStrings.onActivate]
  type FocusTarget = typings.std.HTMLElement | java.lang.String | js.Function0[typings.std.HTMLElement]
}
