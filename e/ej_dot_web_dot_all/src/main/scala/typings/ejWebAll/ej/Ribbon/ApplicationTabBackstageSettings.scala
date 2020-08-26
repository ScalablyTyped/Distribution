package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationTabBackstageSettings extends js.Object {
  /** Specifies the width of backstage page header that contains tabs and buttons.
    * @Default {null}
    */
  var headerWidth: js.UndefOr[String | Double] = js.native
  /** Specifies the height of ribbon backstage page.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the ribbon backstage page with its tab and button elements.
    * @Default {Array}
    */
  var pages: js.UndefOr[js.Array[ApplicationTabBackstageSettingsPage]] = js.native
  /** Specifies the display text of application tab.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the width of ribbon backstage page.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object ApplicationTabBackstageSettings {
  @scala.inline
  def apply(): ApplicationTabBackstageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationTabBackstageSettings]
  }
  @scala.inline
  implicit class ApplicationTabBackstageSettingsOps[Self <: ApplicationTabBackstageSettings] (val x: Self) extends AnyVal {
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
    def setHeaderWidth(value: String | Double): Self = this.set("headerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderWidth: Self = this.set("headerWidth", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPagesVarargs(value: ApplicationTabBackstageSettingsPage*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[ApplicationTabBackstageSettingsPage]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

