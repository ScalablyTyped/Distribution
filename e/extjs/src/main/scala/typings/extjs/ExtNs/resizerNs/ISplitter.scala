package typings.extjs.ExtNs.resizerNs

import typings.extjs.ExtNs.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplitter extends IComponent {
  /** [Config Option] (Boolean) */
  var collapseOnDblClick: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Ext.panel.Panel) */
  var collapseTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var defaultSplitMax: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var defaultSplitMin: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the config object with an xclass property for the splitter tracker  */
  var getTrackerConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_ISplitter: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (String) */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var performCollapse: js.UndefOr[Boolean] = js.undefined
  /** [Method] Work around IE bug
  		* @returns Ext.Component this
  		*/
  @JSName("setSize")
  var setSize_ISplitter: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (Number) */
  var size: js.UndefOr[Double] = js.undefined
}

object ISplitter {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    baseCls: java.lang.String = null,
    beforeDestroy: () => Unit = null,
    collapseOnDblClick: js.UndefOr[Boolean] = js.undefined,
    collapseTarget: js.Any = null,
    collapsedCls: java.lang.String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    defaultSplitMax: Int | Double = null,
    defaultSplitMin: Int | Double = null,
    getTrackerConfig: () => Unit = null,
    onRender: () => Unit = null,
    orientation: java.lang.String = null,
    performCollapse: js.UndefOr[Boolean] = js.undefined,
    renderTpl: js.Any = null,
    setSize: () => IComponent = null,
    size: Int | Double = null
  ): ISplitter = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction0(beforeDestroy))
    if (!js.isUndefined(collapseOnDblClick)) __obj.updateDynamic("collapseOnDblClick")(collapseOnDblClick)
    if (collapseTarget != null) __obj.updateDynamic("collapseTarget")(collapseTarget)
    if (collapsedCls != null) __obj.updateDynamic("collapsedCls")(collapsedCls)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (defaultSplitMax != null) __obj.updateDynamic("defaultSplitMax")(defaultSplitMax.asInstanceOf[js.Any])
    if (defaultSplitMin != null) __obj.updateDynamic("defaultSplitMin")(defaultSplitMin.asInstanceOf[js.Any])
    if (getTrackerConfig != null) __obj.updateDynamic("getTrackerConfig")(js.Any.fromFunction0(getTrackerConfig))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(performCollapse)) __obj.updateDynamic("performCollapse")(performCollapse)
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction0(setSize))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplitter]
  }
}

