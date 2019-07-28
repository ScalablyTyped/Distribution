package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.runtimeNs.OnInstalledReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdPreviousVersion extends js.Object {
  /**
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is
    * 'shared_module_update'.
    * @deprecated Unsupported on Firefox at this time.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Indicates the previous version of the extension, which has just been updated. This is present only if
    * 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.undefined
  /** The reason that this event is being dispatched. */
  var reason: OnInstalledReason
  /** Indicates whether the addon is installed as a temporary extension. */
  var temporary: Boolean
}

object Anon_IdPreviousVersion {
  @scala.inline
  def apply(reason: OnInstalledReason, temporary: Boolean, id: String = null, previousVersion: String = null): Anon_IdPreviousVersion = {
    val __obj = js.Dynamic.literal(reason = reason, temporary = temporary)
    if (id != null) __obj.updateDynamic("id")(id)
    if (previousVersion != null) __obj.updateDynamic("previousVersion")(previousVersion)
    __obj.asInstanceOf[Anon_IdPreviousVersion]
  }
}

