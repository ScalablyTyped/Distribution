package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedStringBundle extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#localizedStringBundle. */
  var kind: js.UndefOr[String] = js.native
  /** The locale strings. */
  var translations: js.UndefOr[js.Array[LocalizedString]] = js.native
}

object LocalizedStringBundle {
  @scala.inline
  def apply(): LocalizedStringBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedStringBundle]
  }
  @scala.inline
  implicit class LocalizedStringBundleOps[Self <: LocalizedStringBundle] (val x: Self) extends AnyVal {
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
    def setTranslationsVarargs(value: LocalizedString*): Self = this.set("translations", js.Array(value :_*))
    @scala.inline
    def setTranslations(value: js.Array[LocalizedString]): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

