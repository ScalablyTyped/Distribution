package typings
package extjsLib.ExtNs.enumsNs

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
    if (bufferedrenderer != null) __obj.updateDynamic("bufferedrenderer")(bufferedrenderer)
    if (cellediting != null) __obj.updateDynamic("cellediting")(cellediting)
    if (gridheaderresizer != null) __obj.updateDynamic("gridheaderresizer")(gridheaderresizer)
    if (gridviewdragdrop != null) __obj.updateDynamic("gridviewdragdrop")(gridviewdragdrop)
    if (rowediting != null) __obj.updateDynamic("rowediting")(rowediting)
    if (rowexpander != null) __obj.updateDynamic("rowexpander")(rowexpander)
    if (treeviewdragdrop != null) __obj.updateDynamic("treeviewdragdrop")(treeviewdragdrop)
    __obj.asInstanceOf[IPlugin]
  }
}

