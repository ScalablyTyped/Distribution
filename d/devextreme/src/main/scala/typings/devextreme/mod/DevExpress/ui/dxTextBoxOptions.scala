package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.password
import typings.devextreme.devextremeStrings.search
import typings.devextreme.devextremeStrings.tel
import typings.devextreme.devextremeStrings.text
import typings.devextreme.devextremeStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTextBoxOptions[T] extends dxTextEditorOptions[T] {
  /** @name dxTextBox.Options.maxLength */
  var maxLength: js.UndefOr[String | Double] = js.native
  /** @name dxTextBox.Options.mode */
  var mode: js.UndefOr[email | password | search | tel | text | url] = js.native
  /** @name dxTextBox.Options.value */
  @JSName("value")
  var value_dxTextBoxOptions: js.UndefOr[String] = js.native
}

object dxTextBoxOptions {
  @scala.inline
  def apply[T](): dxTextBoxOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextBoxOptions[T]]
  }
  @scala.inline
  implicit class dxTextBoxOptionsOps[Self <: dxTextBoxOptions[_], T] (val x: Self with dxTextBoxOptions[T]) extends AnyVal {
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
    def setMaxLength(value: String | Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMode(value: email | password | search | tel | text | url): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

