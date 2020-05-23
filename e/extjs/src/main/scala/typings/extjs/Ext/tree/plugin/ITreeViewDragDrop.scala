package typings.extjs.Ext.tree.plugin

import typings.extjs.Ext.Array
import typings.extjs.Ext.IAbstractPlugin
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeViewDragDrop extends IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var allowContainerDrops: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var dragGroup: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var dragText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var dropGroup: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableDrag: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableDrop: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[Double] = js.undefined
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
    * @param view Object
    */
  @JSName("init")
  var init_ITreeViewDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var nodeHighlightColor: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var nodeHighlightOnDrop: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var nodeHighlightOnRepair: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var sortOnDrop: js.UndefOr[Boolean] = js.undefined
}

object ITreeViewDragDrop {
  @scala.inline
  def apply(
    alias: Array = null,
    allowContainerDrops: js.UndefOr[Boolean] = js.undefined,
    allowParentInserts: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    appendOnly: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => Unit = null,
    config: js.Any = null,
    containerScroll: js.Any = null,
    ddGroup: String = null,
    destroy: () => Unit = null,
    disable: () => Unit = null,
    displayField: String = null,
    dragGroup: String = null,
    dragText: String = null,
    dropGroup: String = null,
    enable: () => Unit = null,
    enableDrag: js.UndefOr[Boolean] = js.undefined,
    enableDrop: js.UndefOr[Boolean] = js.undefined,
    expandDelay: js.UndefOr[Double] = js.undefined,
    extend: String = null,
    getCmp: () => IComponent = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    inheritableStatics: js.Any = null,
    init: /* view */ js.UndefOr[js.Any] => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ITreeViewDragDrop = null,
    isPlugin: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    nodeHighlightColor: String = null,
    nodeHighlightOnDrop: js.UndefOr[Boolean] = js.undefined,
    nodeHighlightOnRepair: js.UndefOr[Boolean] = js.undefined,
    pluginId: String = null,
    requires: Array = null,
    self: IClass = null,
    setCmp: /* cmp */ js.UndefOr[IComponent] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortOnDrop: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITreeViewDragDrop = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowContainerDrops)) __obj.updateDynamic("allowContainerDrops")(allowContainerDrops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowParentInserts)) __obj.updateDynamic("allowParentInserts")(allowParentInserts.get.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(appendOnly)) __obj.updateDynamic("appendOnly")(appendOnly.get.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(js.Any.fromFunction1(clonePlugin))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (containerScroll != null) __obj.updateDynamic("containerScroll")(containerScroll.asInstanceOf[js.Any])
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (dragGroup != null) __obj.updateDynamic("dragGroup")(dragGroup.asInstanceOf[js.Any])
    if (dragText != null) __obj.updateDynamic("dragText")(dragText.asInstanceOf[js.Any])
    if (dropGroup != null) __obj.updateDynamic("dropGroup")(dropGroup.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (!js.isUndefined(enableDrag)) __obj.updateDynamic("enableDrag")(enableDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDrop)) __obj.updateDynamic("enableDrop")(enableDrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandDelay)) __obj.updateDynamic("expandDelay")(expandDelay.get.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getCmp != null) __obj.updateDynamic("getCmp")(js.Any.fromFunction0(getCmp))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (nodeHighlightColor != null) __obj.updateDynamic("nodeHighlightColor")(nodeHighlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeHighlightOnDrop)) __obj.updateDynamic("nodeHighlightOnDrop")(nodeHighlightOnDrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeHighlightOnRepair)) __obj.updateDynamic("nodeHighlightOnRepair")(nodeHighlightOnRepair.get.asInstanceOf[js.Any])
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCmp != null) __obj.updateDynamic("setCmp")(js.Any.fromFunction1(setCmp))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOnDrop)) __obj.updateDynamic("sortOnDrop")(sortOnDrop.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeViewDragDrop]
  }
}

