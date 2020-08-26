package typings.electronSettings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsOptions extends js.Object {
  /**
    * Prettify the JSON output. Defaults to `false`.
    */
  var prettify: js.UndefOr[Boolean] = js.native
}

object SettingsOptions {
  @scala.inline
  def apply(): SettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsOptions]
  }
  @scala.inline
  implicit class SettingsOptionsOps[Self <: SettingsOptions] (val x: Self) extends AnyVal {
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
    def setPrettify(value: Boolean): Self = this.set("prettify", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettify: Self = this.set("prettify", js.undefined)
  }
  
}

