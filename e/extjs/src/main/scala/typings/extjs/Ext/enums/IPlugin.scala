package typings.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  /** [Property] (String) */
  var bufferedrenderer: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var cellediting: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var gridheaderresizer: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var gridviewdragdrop: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var rowediting: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var rowexpander: js.UndefOr[String] = js.undefined
  /** [Property] (String) */
  var treeviewdragdrop: js.UndefOr[String] = js.undefined
}

object IPlugin {
  @scala.inline
  def apply(
    bufferedrenderer: String = null,
    cellediting: String = null,
    gridheaderresizer: String = null,
    gridviewdragdrop: String = null,
    rowediting: String = null,
    rowexpander: String = null,
    treeviewdragdrop: String = null
  ): IPlugin = {
    val __obj = js.Dynamic.literal()
    if (bufferedrenderer != null) __obj.updateDynamic("bufferedrenderer")(bufferedrenderer.asInstanceOf[js.Any])
    if (cellediting != null) __obj.updateDynamic("cellediting")(cellediting.asInstanceOf[js.Any])
    if (gridheaderresizer != null) __obj.updateDynamic("gridheaderresizer")(gridheaderresizer.asInstanceOf[js.Any])
    if (gridviewdragdrop != null) __obj.updateDynamic("gridviewdragdrop")(gridviewdragdrop.asInstanceOf[js.Any])
    if (rowediting != null) __obj.updateDynamic("rowediting")(rowediting.asInstanceOf[js.Any])
    if (rowexpander != null) __obj.updateDynamic("rowexpander")(rowexpander.asInstanceOf[js.Any])
    if (treeviewdragdrop != null) __obj.updateDynamic("treeviewdragdrop")(treeviewdragdrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugin]
  }
}

