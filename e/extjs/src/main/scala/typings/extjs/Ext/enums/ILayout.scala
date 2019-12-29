package typings.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayout extends js.Object {
  /** [Property] (String) */
  var absolute: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var accordion: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var anchor: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var auto: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var autocomponent: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var autocontainer: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var border: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var box: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var card: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var checkboxgroup: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var column: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var container: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var fit: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var form: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var hbox: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var table: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var vbox: js.UndefOr[String] = js.undefined
}

object ILayout {
  @scala.inline
  def apply(
    absolute: String = null,
    accordion: String = null,
    anchor: String = null,
    auto: String = null,
    autocomponent: String = null,
    autocontainer: String = null,
    border: String = null,
    box: String = null,
    card: String = null,
    checkboxgroup: String = null,
    column: String = null,
    container: String = null,
    fit: String = null,
    form: String = null,
    hbox: String = null,
    table: String = null,
    vbox: String = null
  ): ILayout = {
    val __obj = js.Dynamic.literal()
    if (absolute != null) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (accordion != null) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (auto != null) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (autocomponent != null) __obj.updateDynamic("autocomponent")(autocomponent.asInstanceOf[js.Any])
    if (autocontainer != null) __obj.updateDynamic("autocontainer")(autocontainer.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (checkboxgroup != null) __obj.updateDynamic("checkboxgroup")(checkboxgroup.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (hbox != null) __obj.updateDynamic("hbox")(hbox.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (vbox != null) __obj.updateDynamic("vbox")(vbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayout]
  }
}

