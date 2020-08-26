package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteCleanupSettings extends js.Object {
  /** This API is used to clean the unwanted css in the elements pasted from word document to editor.
    * @Default {false}
    */
  var cleanCSS: js.UndefOr[Boolean] = js.native
  /** This API is used to clean the unwanted elements pasted from word document to editor.
    * @Default {false}
    */
  var cleanElements: js.UndefOr[Boolean] = js.native
  /** This API is used to convert the list elements pasted from word document to editor.
    * @Default {false}
    */
  var listConversion: js.UndefOr[Boolean] = js.native
  /** This API is used to remove all styles in the elements pasted from word document to editor.
    * @Default {false}
    */
  var removeStyles: js.UndefOr[Boolean] = js.native
}

object PasteCleanupSettings {
  @scala.inline
  def apply(): PasteCleanupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteCleanupSettings]
  }
  @scala.inline
  implicit class PasteCleanupSettingsOps[Self <: PasteCleanupSettings] (val x: Self) extends AnyVal {
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
    def setCleanCSS(value: Boolean): Self = this.set("cleanCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanCSS: Self = this.set("cleanCSS", js.undefined)
    @scala.inline
    def setCleanElements(value: Boolean): Self = this.set("cleanElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanElements: Self = this.set("cleanElements", js.undefined)
    @scala.inline
    def setListConversion(value: Boolean): Self = this.set("listConversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListConversion: Self = this.set("listConversion", js.undefined)
    @scala.inline
    def setRemoveStyles(value: Boolean): Self = this.set("removeStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveStyles: Self = this.set("removeStyles", js.undefined)
  }
  
}

