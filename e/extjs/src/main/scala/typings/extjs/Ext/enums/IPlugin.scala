package typings.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin extends js.Object {
  /** [Property] (String) */
  var bufferedrenderer: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var cellediting: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var gridheaderresizer: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var gridviewdragdrop: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var rowediting: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var rowexpander: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var treeviewdragdrop: js.UndefOr[java.lang.String] = js.undefined
}

object IPlugin {
  @scala.inline
  def apply(
    bufferedrenderer: java.lang.String = null,
    cellediting: java.lang.String = null,
    gridheaderresizer: java.lang.String = null,
    gridviewdragdrop: java.lang.String = null,
    rowediting: java.lang.String = null,
    rowexpander: java.lang.String = null,
    treeviewdragdrop: java.lang.String = null
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

