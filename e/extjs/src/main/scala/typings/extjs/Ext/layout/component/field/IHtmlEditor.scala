package typings.extjs.Ext.layout.component.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHtmlEditor extends IFieldContainer {
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM  */
  @JSName("finishedLayout")
  var finishedLayout_IHtmlEditor: js.UndefOr[js.Function0[Unit]] = js.native
}

object IHtmlEditor {
  @scala.inline
  def apply(): IHtmlEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHtmlEditor]
  }
  @scala.inline
  implicit class IHtmlEditorOps[Self <: IHtmlEditor] (val x: Self) extends AnyVal {
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
    def setFinishedLayout(value: () => Unit): Self = this.set("finishedLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFinishedLayout: Self = this.set("finishedLayout", js.undefined)
  }
  
}

