package typings.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayout extends js.Object {
  /** [Property] (String) */
  var absolute: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var accordion: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var anchor: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var auto: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var autocomponent: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var autocontainer: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var border: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var box: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var card: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var checkboxgroup: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var column: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var container: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var fit: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var form: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var hbox: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var table: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var vbox: js.UndefOr[String] = js.native
}

object ILayout {
  @scala.inline
  def apply(): ILayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayout]
  }
  @scala.inline
  implicit class ILayoutOps[Self <: ILayout] (val x: Self) extends AnyVal {
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
    def setAbsolute(value: String): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    @scala.inline
    def setAccordion(value: String): Self = this.set("accordion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccordion: Self = this.set("accordion", js.undefined)
    @scala.inline
    def setAnchor(value: String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setAuto(value: String): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setAutocomponent(value: String): Self = this.set("autocomponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomponent: Self = this.set("autocomponent", js.undefined)
    @scala.inline
    def setAutocontainer(value: String): Self = this.set("autocontainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocontainer: Self = this.set("autocontainer", js.undefined)
    @scala.inline
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBox(value: String): Self = this.set("box", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    @scala.inline
    def setCard(value: String): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setCheckboxgroup(value: String): Self = this.set("checkboxgroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxgroup: Self = this.set("checkboxgroup", js.undefined)
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setFit(value: String): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setHbox(value: String): Self = this.set("hbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHbox: Self = this.set("hbox", js.undefined)
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setVbox(value: String): Self = this.set("vbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVbox: Self = this.set("vbox", js.undefined)
  }
  
}

