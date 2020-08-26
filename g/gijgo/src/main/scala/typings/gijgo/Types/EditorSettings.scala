package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Editor
@js.native
trait EditorSettings extends js.Object {
  var changed: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  //Events
  var changing: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var iconsLibrary: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var uiLibrary: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object EditorSettings {
  @scala.inline
  def apply(): EditorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSettings]
  }
  @scala.inline
  implicit class EditorSettingsOps[Self <: EditorSettings] (val x: Self) extends AnyVal {
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
    def setChanged(value: /* e */ js.Any => _): Self = this.set("changed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChanged: Self = this.set("changed", js.undefined)
    @scala.inline
    def setChanging(value: /* e */ js.Any => _): Self = this.set("changing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChanging: Self = this.set("changing", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIconsLibrary(value: String): Self = this.set("iconsLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconsLibrary: Self = this.set("iconsLibrary", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setUiLibrary(value: String): Self = this.set("uiLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUiLibrary: Self = this.set("uiLibrary", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

