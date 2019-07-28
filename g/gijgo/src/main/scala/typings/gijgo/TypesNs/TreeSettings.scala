package typings.gijgo.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeSettings extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var border: js.UndefOr[Boolean] = js.undefined
  var cascadeCheck: js.UndefOr[Boolean] = js.undefined
  var cascadeSelection: js.UndefOr[Boolean] = js.undefined
  var checkboxChange: js.UndefOr[
    js.Function4[/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String, _]
  ] = js.undefined
  var checkboxes: js.UndefOr[Boolean] = js.undefined
  var checkedField: js.UndefOr[String] = js.undefined
  var childrenField: js.UndefOr[String] = js.undefined
  var collapse: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var disable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var disabledField: js.UndefOr[String] = js.undefined
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  var enable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var expand: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var hasChildrenField: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[TreeIcons] = js.undefined
  var iconsLibrary: js.UndefOr[String] = js.undefined
  var imageCssClassField: js.UndefOr[String] = js.undefined
  var imageHtmlField: js.UndefOr[String] = js.undefined
  var imageUrlField: js.UndefOr[String] = js.undefined
  //Events
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var lazyLoading: js.UndefOr[Boolean] = js.undefined
  var nodeDataBound: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var nodeDrop: js.UndefOr[
    js.Function4[/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double, _]
  ] = js.undefined
  var paramNames: js.UndefOr[TreeParamNames] = js.undefined
  var primaryKey: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var selectionType: js.UndefOr[String] = js.undefined
  var textField: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var unselect: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TreeSettings {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    border: js.UndefOr[Boolean] = js.undefined,
    cascadeCheck: js.UndefOr[Boolean] = js.undefined,
    cascadeSelection: js.UndefOr[Boolean] = js.undefined,
    checkboxChange: (/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String) => _ = null,
    checkboxes: js.UndefOr[Boolean] = js.undefined,
    checkedField: String = null,
    childrenField: String = null,
    collapse: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _ = null,
    dataBinding: /* e */ js.Any => _ = null,
    dataBound: /* e */ js.Any => _ = null,
    dataSource: js.Any = null,
    destroying: /* e */ js.Any => _ = null,
    disable: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _ = null,
    disabledField: String = null,
    dragAndDrop: js.UndefOr[Boolean] = js.undefined,
    enable: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _ = null,
    expand: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _ = null,
    hasChildrenField: String = null,
    icons: TreeIcons = null,
    iconsLibrary: String = null,
    imageCssClassField: String = null,
    imageHtmlField: String = null,
    imageUrlField: String = null,
    initialized: /* e */ js.Any => _ = null,
    lazyLoading: js.UndefOr[Boolean] = js.undefined,
    nodeDataBound: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _ = null,
    nodeDrop: (/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double) => _ = null,
    paramNames: TreeParamNames = null,
    primaryKey: String = null,
    select: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _ = null,
    selectionType: String = null,
    textField: String = null,
    uiLibrary: String = null,
    unselect: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _ = null,
    width: Int | Double = null
  ): TreeSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(cascadeCheck)) __obj.updateDynamic("cascadeCheck")(cascadeCheck)
    if (!js.isUndefined(cascadeSelection)) __obj.updateDynamic("cascadeSelection")(cascadeSelection)
    if (checkboxChange != null) __obj.updateDynamic("checkboxChange")(js.Any.fromFunction4(checkboxChange))
    if (!js.isUndefined(checkboxes)) __obj.updateDynamic("checkboxes")(checkboxes)
    if (checkedField != null) __obj.updateDynamic("checkedField")(checkedField)
    if (childrenField != null) __obj.updateDynamic("childrenField")(childrenField)
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction3(collapse))
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (destroying != null) __obj.updateDynamic("destroying")(js.Any.fromFunction1(destroying))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction3(disable))
    if (disabledField != null) __obj.updateDynamic("disabledField")(disabledField)
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction3(enable))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction3(expand))
    if (hasChildrenField != null) __obj.updateDynamic("hasChildrenField")(hasChildrenField)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary)
    if (imageCssClassField != null) __obj.updateDynamic("imageCssClassField")(imageCssClassField)
    if (imageHtmlField != null) __obj.updateDynamic("imageHtmlField")(imageHtmlField)
    if (imageUrlField != null) __obj.updateDynamic("imageUrlField")(imageUrlField)
    if (initialized != null) __obj.updateDynamic("initialized")(js.Any.fromFunction1(initialized))
    if (!js.isUndefined(lazyLoading)) __obj.updateDynamic("lazyLoading")(lazyLoading)
    if (nodeDataBound != null) __obj.updateDynamic("nodeDataBound")(js.Any.fromFunction3(nodeDataBound))
    if (nodeDrop != null) __obj.updateDynamic("nodeDrop")(js.Any.fromFunction4(nodeDrop))
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType)
    if (textField != null) __obj.updateDynamic("textField")(textField)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (unselect != null) __obj.updateDynamic("unselect")(js.Any.fromFunction3(unselect))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeSettings]
  }
}

