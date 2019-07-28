package typings.focusDashTrap

import typings.focusDashTrap.Fn_HTMLElement
import typings.focusDashTrap.focusDashTrapStrings.onActivate
import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object focusDashTrapMod {
  type ActivateOptions = Pick[Options, onActivate]
  type FocusTarget = HTMLElement | String | Fn_HTMLElement
}
