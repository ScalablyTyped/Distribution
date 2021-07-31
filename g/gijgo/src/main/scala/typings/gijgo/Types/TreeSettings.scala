package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeSettings extends StObject {
  
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  
  var border: js.UndefOr[Boolean] = js.undefined
  
  var cascadeCheck: js.UndefOr[Boolean] = js.undefined
  
  var cascadeSelection: js.UndefOr[Boolean] = js.undefined
  
  var checkboxChange: js.UndefOr[
    js.Function4[/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String, js.Any]
  ] = js.undefined
  
  var checkboxes: js.UndefOr[Boolean] = js.undefined
  
  var checkedField: js.UndefOr[String] = js.undefined
  
  var childrenField: js.UndefOr[String] = js.undefined
  
  var collapse: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, js.Any]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var disable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, js.Any]] = js.undefined
  
  var disabledField: js.UndefOr[String] = js.undefined
  
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  
  var enable: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, js.Any]] = js.undefined
  
  var expand: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, js.Any]] = js.undefined
  
  var hasChildrenField: js.UndefOr[String] = js.undefined
  
  var icons: js.UndefOr[TreeIcons] = js.undefined
  
  var iconsLibrary: js.UndefOr[String] = js.undefined
  
  var imageCssClassField: js.UndefOr[String] = js.undefined
  
  var imageHtmlField: js.UndefOr[String] = js.undefined
  
  var imageUrlField: js.UndefOr[String] = js.undefined
  
  //Events
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, js.Any]] = js.undefined
  
  var lazyLoading: js.UndefOr[Boolean] = js.undefined
  
  var nodeDataBound: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, js.Any]] = js.undefined
  
  var nodeDrop: js.UndefOr[
    js.Function4[/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double, js.Any]
  ] = js.undefined
  
  var paramNames: js.UndefOr[TreeParamNames] = js.undefined
  
  var primaryKey: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, js.Any]] = js.undefined
  
  var selectionType: js.UndefOr[String] = js.undefined
  
  var textField: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var unselect: js.UndefOr[js.Function3[/* e */ js.Any, /* node */ js.Any, /* id */ String, js.Any]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TreeSettings {
  
  @scala.inline
  def apply(): TreeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSettings]
  }
  
  @scala.inline
  implicit class TreeSettingsMutableBuilder[Self <: TreeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setCascadeCheck(value: Boolean): Self = StObject.set(x, "cascadeCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeCheckUndefined: Self = StObject.set(x, "cascadeCheck", js.undefined)
    
    @scala.inline
    def setCascadeSelection(value: Boolean): Self = StObject.set(x, "cascadeSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeSelectionUndefined: Self = StObject.set(x, "cascadeSelection", js.undefined)
    
    @scala.inline
    def setCheckboxChange(value: (/* e */ js.Any, /* node */ js.Any, /* record */ js.Any, /* state */ String) => js.Any): Self = StObject.set(x, "checkboxChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCheckboxChangeUndefined: Self = StObject.set(x, "checkboxChange", js.undefined)
    
    @scala.inline
    def setCheckboxes(value: Boolean): Self = StObject.set(x, "checkboxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxesUndefined: Self = StObject.set(x, "checkboxes", js.undefined)
    
    @scala.inline
    def setCheckedField(value: String): Self = StObject.set(x, "checkedField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedFieldUndefined: Self = StObject.set(x, "checkedField", js.undefined)
    
    @scala.inline
    def setChildrenField(value: String): Self = StObject.set(x, "childrenField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFieldUndefined: Self = StObject.set(x, "childrenField", js.undefined)
    
    @scala.inline
    def setCollapse(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => js.Any): Self = StObject.set(x, "collapse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDestroying(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "destroying", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyingUndefined: Self = StObject.set(x, "destroying", js.undefined)
    
    @scala.inline
    def setDisable(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => js.Any): Self = StObject.set(x, "disable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    @scala.inline
    def setDisabledField(value: String): Self = StObject.set(x, "disabledField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledFieldUndefined: Self = StObject.set(x, "disabledField", js.undefined)
    
    @scala.inline
    def setDragAndDrop(value: Boolean): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAndDropUndefined: Self = StObject.set(x, "dragAndDrop", js.undefined)
    
    @scala.inline
    def setEnable(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => js.Any): Self = StObject.set(x, "enable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setExpand(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => js.Any): Self = StObject.set(x, "expand", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setHasChildrenField(value: String): Self = StObject.set(x, "hasChildrenField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChildrenFieldUndefined: Self = StObject.set(x, "hasChildrenField", js.undefined)
    
    @scala.inline
    def setIcons(value: TreeIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setImageCssClassField(value: String): Self = StObject.set(x, "imageCssClassField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageCssClassFieldUndefined: Self = StObject.set(x, "imageCssClassField", js.undefined)
    
    @scala.inline
    def setImageHtmlField(value: String): Self = StObject.set(x, "imageHtmlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHtmlFieldUndefined: Self = StObject.set(x, "imageHtmlField", js.undefined)
    
    @scala.inline
    def setImageUrlField(value: String): Self = StObject.set(x, "imageUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlFieldUndefined: Self = StObject.set(x, "imageUrlField", js.undefined)
    
    @scala.inline
    def setInitialized(value: /* e */ js.Any => js.Any): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
    
    @scala.inline
    def setLazyLoading(value: Boolean): Self = StObject.set(x, "lazyLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyLoadingUndefined: Self = StObject.set(x, "lazyLoading", js.undefined)
    
    @scala.inline
    def setNodeDataBound(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => js.Any): Self = StObject.set(x, "nodeDataBound", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNodeDataBoundUndefined: Self = StObject.set(x, "nodeDataBound", js.undefined)
    
    @scala.inline
    def setNodeDrop(
      value: (/* e */ js.Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double) => js.Any
    ): Self = StObject.set(x, "nodeDrop", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNodeDropUndefined: Self = StObject.set(x, "nodeDrop", js.undefined)
    
    @scala.inline
    def setParamNames(value: TreeParamNames): Self = StObject.set(x, "paramNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNamesUndefined: Self = StObject.set(x, "paramNames", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => js.Any): Self = StObject.set(x, "select", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectionType(value: String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    
    @scala.inline
    def setTextField(value: String): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    @scala.inline
    def setUnselect(value: (/* e */ js.Any, /* node */ js.Any, /* id */ String) => js.Any): Self = StObject.set(x, "unselect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
