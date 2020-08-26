package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSettings extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.native
  var border: js.UndefOr[Boolean] = js.native
  var cascadeCheck: js.UndefOr[Boolean] = js.native
  var cascadeSelection: js.UndefOr[Boolean] = js.native
  var checkboxChange: js.UndefOr[
    js.Function4[/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String, _]
  ] = js.native
  var checkboxes: js.UndefOr[Boolean] = js.native
  var checkedField: js.UndefOr[String] = js.native
  var childrenField: js.UndefOr[String] = js.native
  var collapse: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var dataSource: js.UndefOr[js.Any] = js.native
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var disable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var disabledField: js.UndefOr[String] = js.native
  var dragAndDrop: js.UndefOr[Boolean] = js.native
  var enable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var expand: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var hasChildrenField: js.UndefOr[String] = js.native
  var icons: js.UndefOr[TreeIcons] = js.native
  var iconsLibrary: js.UndefOr[String] = js.native
  var imageCssClassField: js.UndefOr[String] = js.native
  var imageHtmlField: js.UndefOr[String] = js.native
  var imageUrlField: js.UndefOr[String] = js.native
  //Events
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var lazyLoading: js.UndefOr[Boolean] = js.native
  var nodeDataBound: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var nodeDrop: js.UndefOr[
    js.Function4[/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double, _]
  ] = js.native
  var paramNames: js.UndefOr[TreeParamNames] = js.native
  var primaryKey: js.UndefOr[String] = js.native
  var select: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var selectionType: js.UndefOr[String] = js.native
  var textField: js.UndefOr[String] = js.native
  var uiLibrary: js.UndefOr[String] = js.native
  var unselect: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, _]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TreeSettings {
  @scala.inline
  def apply(): TreeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSettings]
  }
  @scala.inline
  implicit class TreeSettingsOps[Self <: TreeSettings] (val x: Self) extends AnyVal {
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
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    @scala.inline
    def setBorder(value: Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setCascadeCheck(value: Boolean): Self = this.set("cascadeCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascadeCheck: Self = this.set("cascadeCheck", js.undefined)
    @scala.inline
    def setCascadeSelection(value: Boolean): Self = this.set("cascadeSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascadeSelection: Self = this.set("cascadeSelection", js.undefined)
    @scala.inline
    def setCheckboxChange(value: (/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String) => _): Self = this.set("checkboxChange", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCheckboxChange: Self = this.set("checkboxChange", js.undefined)
    @scala.inline
    def setCheckboxes(value: Boolean): Self = this.set("checkboxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxes: Self = this.set("checkboxes", js.undefined)
    @scala.inline
    def setCheckedField(value: String): Self = this.set("checkedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedField: Self = this.set("checkedField", js.undefined)
    @scala.inline
    def setChildrenField(value: String): Self = this.set("childrenField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenField: Self = this.set("childrenField", js.undefined)
    @scala.inline
    def setCollapse(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = this.set("collapse", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setDataBinding(value: /* e */ js.Any => _): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ js.Any => _): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDestroying(value: /* e */ js.Any => _): Self = this.set("destroying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroying: Self = this.set("destroying", js.undefined)
    @scala.inline
    def setDisable(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = this.set("disable", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setDisabledField(value: String): Self = this.set("disabledField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledField: Self = this.set("disabledField", js.undefined)
    @scala.inline
    def setDragAndDrop(value: Boolean): Self = this.set("dragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAndDrop: Self = this.set("dragAndDrop", js.undefined)
    @scala.inline
    def setEnable(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = this.set("enable", js.Any.fromFunction3(value))
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setExpand(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = this.set("expand", js.Any.fromFunction3(value))
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setHasChildrenField(value: String): Self = this.set("hasChildrenField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasChildrenField: Self = this.set("hasChildrenField", js.undefined)
    @scala.inline
    def setIcons(value: TreeIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setIconsLibrary(value: String): Self = this.set("iconsLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconsLibrary: Self = this.set("iconsLibrary", js.undefined)
    @scala.inline
    def setImageCssClassField(value: String): Self = this.set("imageCssClassField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageCssClassField: Self = this.set("imageCssClassField", js.undefined)
    @scala.inline
    def setImageHtmlField(value: String): Self = this.set("imageHtmlField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageHtmlField: Self = this.set("imageHtmlField", js.undefined)
    @scala.inline
    def setImageUrlField(value: String): Self = this.set("imageUrlField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrlField: Self = this.set("imageUrlField", js.undefined)
    @scala.inline
    def setInitialized(value: /* e */ js.Any => _): Self = this.set("initialized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitialized: Self = this.set("initialized", js.undefined)
    @scala.inline
    def setLazyLoading(value: Boolean): Self = this.set("lazyLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoading: Self = this.set("lazyLoading", js.undefined)
    @scala.inline
    def setNodeDataBound(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = this.set("nodeDataBound", js.Any.fromFunction3(value))
    @scala.inline
    def deleteNodeDataBound: Self = this.set("nodeDataBound", js.undefined)
    @scala.inline
    def setNodeDrop(value: (/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double) => _): Self = this.set("nodeDrop", js.Any.fromFunction4(value))
    @scala.inline
    def deleteNodeDrop: Self = this.set("nodeDrop", js.undefined)
    @scala.inline
    def setParamNames(value: TreeParamNames): Self = this.set("paramNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamNames: Self = this.set("paramNames", js.undefined)
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setSelect(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = this.set("select", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectionType(value: String): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
    @scala.inline
    def setTextField(value: String): Self = this.set("textField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextField: Self = this.set("textField", js.undefined)
    @scala.inline
    def setUiLibrary(value: String): Self = this.set("uiLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUiLibrary: Self = this.set("uiLibrary", js.undefined)
    @scala.inline
    def setUnselect(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => _): Self = this.set("unselect", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUnselect: Self = this.set("unselect", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

