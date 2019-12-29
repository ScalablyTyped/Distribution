package typings.atFirebaseFirestore.distTestUnitSpecsSpecUnderscoreTestUnderscoreRunnerMod

import typings.atFirebaseFirestore.atFirebaseFirestoreBooleans.`true`
import typings.std.VisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecClientState extends js.Object {
  /** Whether this tab should try to forcefully become primary. */
  var primary: js.UndefOr[`true`] = js.undefined
  /** The visibility state of the browser tab running the client. */
  var visibility: js.UndefOr[VisibilityState] = js.undefined
}

object SpecClientState {
  @scala.inline
  def apply(primary: `true` = null, visibility: VisibilityState = null): SpecClientState = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecClientState]
  }
}

