package typings.extjs.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonGroup
  extends typings.extjs.ExtNs.panelNs.IPanel {
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] private
  		* @param component Object
  		*/
  @JSName("onBeforeAdd")
  var onBeforeAdd_IButtonGroup: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IButtonGroup {
  @scala.inline
  def apply(
    IPanel: typings.extjs.ExtNs.panelNs.IPanel = null,
    baseCls: java.lang.String = null,
    columns: Int | Double = null,
    defaultButtonUI: java.lang.String = null,
    defaultType: java.lang.String = null,
    frame: js.UndefOr[Boolean] = js.undefined,
    layout: js.Any = null,
    onBeforeAdd: /* component */ js.UndefOr[js.Any] => Unit = null,
    titleAlign: java.lang.String = null
  ): IButtonGroup = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (defaultButtonUI != null) __obj.updateDynamic("defaultButtonUI")(defaultButtonUI)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (onBeforeAdd != null) __obj.updateDynamic("onBeforeAdd")(js.Any.fromFunction1(onBeforeAdd))
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    __obj.asInstanceOf[IButtonGroup]
  }
}

