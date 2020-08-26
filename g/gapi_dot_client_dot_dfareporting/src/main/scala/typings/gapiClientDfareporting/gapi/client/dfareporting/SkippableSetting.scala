package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkippableSetting extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#skippableSetting". */
  var kind: js.UndefOr[String] = js.native
  /** Amount of time to play videos served to this placement before counting a view. Applicable when skippable is true. */
  var progressOffset: js.UndefOr[VideoOffset] = js.native
  /** Amount of time to play videos served to this placement before the skip button should appear. Applicable when skippable is true. */
  var skipOffset: js.UndefOr[VideoOffset] = js.native
  /** Whether the user can skip creatives served to this placement. */
  var skippable: js.UndefOr[Boolean] = js.native
}

object SkippableSetting {
  @scala.inline
  def apply(): SkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkippableSetting]
  }
  @scala.inline
  implicit class SkippableSettingOps[Self <: SkippableSetting] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProgressOffset(value: VideoOffset): Self = this.set("progressOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressOffset: Self = this.set("progressOffset", js.undefined)
    @scala.inline
    def setSkipOffset(value: VideoOffset): Self = this.set("skipOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipOffset: Self = this.set("skipOffset", js.undefined)
    @scala.inline
    def setSkippable(value: Boolean): Self = this.set("skippable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkippable: Self = this.set("skippable", js.undefined)
  }
  
}

