package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeSettings extends js.Object {
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  var border: js.UndefOr[scala.Boolean] = js.undefined
  var cascadeCheck: js.UndefOr[scala.Boolean] = js.undefined
  var cascadeSelection: js.UndefOr[scala.Boolean] = js.undefined
  var checkboxChange: js.UndefOr[
    js.Function4[/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ java.lang.String, _]
  ] = js.undefined
  var checkboxes: js.UndefOr[scala.Boolean] = js.undefined
  var checkedField: js.UndefOr[java.lang.String] = js.undefined
  var childrenField: js.UndefOr[java.lang.String] = js.undefined
  var collapse: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var disable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var disabledField: js.UndefOr[java.lang.String] = js.undefined
  var dragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  var enable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var expand: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var hasChildrenField: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[TreeIcons] = js.undefined
  var iconsLibrary: js.UndefOr[java.lang.String] = js.undefined
  var imageCssClassField: js.UndefOr[java.lang.String] = js.undefined
  var imageHtmlField: js.UndefOr[java.lang.String] = js.undefined
  var imageUrlField: js.UndefOr[java.lang.String] = js.undefined
  //Events
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var lazyLoading: js.UndefOr[scala.Boolean] = js.undefined
  var nodeDataBound: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var nodeDrop: js.UndefOr[
    js.Function4[
      /* e */ js.Any, 
      /* id */ java.lang.String, 
      /* parentId */ java.lang.String, 
      /* orderNumber */ scala.Double, 
      _
    ]
  ] = js.undefined
  var paramNames: js.UndefOr[TreeParamNames] = js.undefined
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var selectionType: js.UndefOr[java.lang.String] = js.undefined
  var textField: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var unselect: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _]] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TreeSettings {
  @scala.inline
  def apply(
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    border: js.UndefOr[scala.Boolean] = js.undefined,
    cascadeCheck: js.UndefOr[scala.Boolean] = js.undefined,
    cascadeSelection: js.UndefOr[scala.Boolean] = js.undefined,
    checkboxChange: js.Function4[/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ java.lang.String, _] = null,
    checkboxes: js.UndefOr[scala.Boolean] = js.undefined,
    checkedField: java.lang.String = null,
    childrenField: java.lang.String = null,
    collapse: js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _] = null,
    dataBinding: js.Function1[/* e */ js.Any, _] = null,
    dataBound: js.Function1[/* e */ js.Any, _] = null,
    dataSource: js.Any = null,
    destroying: js.Function1[/* e */ js.Any, _] = null,
    disable: js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _] = null,
    disabledField: java.lang.String = null,
    dragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    enable: js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _] = null,
    expand: js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _] = null,
    hasChildrenField: java.lang.String = null,
    icons: TreeIcons = null,
    iconsLibrary: java.lang.String = null,
    imageCssClassField: java.lang.String = null,
    imageHtmlField: java.lang.String = null,
    imageUrlField: java.lang.String = null,
    initialized: js.Function1[/* e */ js.Any, _] = null,
    lazyLoading: js.UndefOr[scala.Boolean] = js.undefined,
    nodeDataBound: js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _] = null,
    nodeDrop: js.Function4[
      /* e */ js.Any, 
      /* id */ java.lang.String, 
      /* parentId */ java.lang.String, 
      /* orderNumber */ scala.Double, 
      _
    ] = null,
    paramNames: TreeParamNames = null,
    primaryKey: java.lang.String = null,
    select: js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _] = null,
    selectionType: java.lang.String = null,
    textField: java.lang.String = null,
    uiLibrary: java.lang.String = null,
    unselect: js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ java.lang.String, _] = null,
    width: scala.Int | scala.Double = null
  ): TreeSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(cascadeCheck)) __obj.updateDynamic("cascadeCheck")(cascadeCheck)
    if (!js.isUndefined(cascadeSelection)) __obj.updateDynamic("cascadeSelection")(cascadeSelection)
    if (checkboxChange != null) __obj.updateDynamic("checkboxChange")(checkboxChange)
    if (!js.isUndefined(checkboxes)) __obj.updateDynamic("checkboxes")(checkboxes)
    if (checkedField != null) __obj.updateDynamic("checkedField")(checkedField)
    if (childrenField != null) __obj.updateDynamic("childrenField")(childrenField)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (destroying != null) __obj.updateDynamic("destroying")(destroying)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (disabledField != null) __obj.updateDynamic("disabledField")(disabledField)
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (hasChildrenField != null) __obj.updateDynamic("hasChildrenField")(hasChildrenField)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary)
    if (imageCssClassField != null) __obj.updateDynamic("imageCssClassField")(imageCssClassField)
    if (imageHtmlField != null) __obj.updateDynamic("imageHtmlField")(imageHtmlField)
    if (imageUrlField != null) __obj.updateDynamic("imageUrlField")(imageUrlField)
    if (initialized != null) __obj.updateDynamic("initialized")(initialized)
    if (!js.isUndefined(lazyLoading)) __obj.updateDynamic("lazyLoading")(lazyLoading)
    if (nodeDataBound != null) __obj.updateDynamic("nodeDataBound")(nodeDataBound)
    if (nodeDrop != null) __obj.updateDynamic("nodeDrop")(nodeDrop)
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType)
    if (textField != null) __obj.updateDynamic("textField")(textField)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (unselect != null) __obj.updateDynamic("unselect")(unselect)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeSettings]
  }
}

