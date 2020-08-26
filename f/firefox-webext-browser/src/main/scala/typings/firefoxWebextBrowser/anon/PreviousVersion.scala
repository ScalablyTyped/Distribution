package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.runtime.OnInstalledReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousVersion extends js.Object {
  /**
    * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is
    * 'shared_module_update'.
    * @deprecated Unsupported on Firefox at this time.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Indicates the previous version of the extension, which has just been updated. This is present only if
    * 'reason' is 'update'.
    */
  var previousVersion: js.UndefOr[String] = js.native
  /** The reason that this event is being dispatched. */
  var reason: OnInstalledReason = js.native
  /** Indicates whether the addon is installed as a temporary extension. */
  var temporary: Boolean = js.native
}

object PreviousVersion {
  @scala.inline
  def apply(reason: OnInstalledReason, temporary: Boolean): PreviousVersion = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], temporary = temporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousVersion]
  }
  @scala.inline
  implicit class PreviousVersionOps[Self <: PreviousVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReason(value: OnInstalledReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("temporary", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPreviousVersion(value: String): Self = this.set("previousVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousVersion: Self = this.set("previousVersion", js.undefined)
  }
  
}

