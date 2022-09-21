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
    js.Function4[/* e */ Any, /* node */ Any, /* record */ Any, /* state */ String, Any]
  ] = js.undefined
  
  var checkboxes: js.UndefOr[Boolean] = js.undefined
  
  var checkedField: js.UndefOr[String] = js.undefined
  
  var childrenField: js.UndefOr[String] = js.undefined
  
  var collapse: js.UndefOr[js.Function3[/* e */ Any, /* node */ Any, /* id */ String, Any]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var dataSource: js.UndefOr[Any] = js.undefined
  
  var destroying: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var disable: js.UndefOr[js.Function3[/* e */ Any, /* node */ Any, /* id */ String, Any]] = js.undefined
  
  var disabledField: js.UndefOr[String] = js.undefined
  
  var dragAndDrop: js.UndefOr[Boolean] = js.undefined
  
  var enable: js.UndefOr[js.Function3[/* e */ Any, /* node */ Any, /* id */ String, Any]] = js.undefined
  
  var expand: js.UndefOr[js.Function3[/* e */ Any, /* node */ Any, /* id */ String, Any]] = js.undefined
  
  var hasChildrenField: js.UndefOr[String] = js.undefined
  
  var icons: js.UndefOr[TreeIcons] = js.undefined
  
  var iconsLibrary: js.UndefOr[String] = js.undefined
  
  var imageCssClassField: js.UndefOr[String] = js.undefined
  
  var imageHtmlField: js.UndefOr[String] = js.undefined
  
  var imageUrlField: js.UndefOr[String] = js.undefined
  
  //Events
  var initialized: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var lazyLoading: js.UndefOr[Boolean] = js.undefined
  
  var nodeDataBound: js.UndefOr[js.Function3[/* e */ Any, /* node */ Any, /* id */ String, Any]] = js.undefined
  
  var nodeDrop: js.UndefOr[
    js.Function4[/* e */ Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double, Any]
  ] = js.undefined
  
  var paramNames: js.UndefOr[TreeParamNames] = js.undefined
  
  var primaryKey: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function3[/* e */ Any, /* node */ Any, /* id */ String, Any]] = js.undefined
  
  var selectionType: js.UndefOr[String] = js.undefined
  
  var textField: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var unselect: js.UndefOr[js.Function3[/* e */ Any, /* node */ Any, /* id */ String, Any]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TreeSettings {
  
  inline def apply(): TreeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSettings]
  }
  
  extension [Self <: TreeSettings](x: Self) {
    
    inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCascadeCheck(value: Boolean): Self = StObject.set(x, "cascadeCheck", value.asInstanceOf[js.Any])
    
    inline def setCascadeCheckUndefined: Self = StObject.set(x, "cascadeCheck", js.undefined)
    
    inline def setCascadeSelection(value: Boolean): Self = StObject.set(x, "cascadeSelection", value.asInstanceOf[js.Any])
    
    inline def setCascadeSelectionUndefined: Self = StObject.set(x, "cascadeSelection", js.undefined)
    
    inline def setCheckboxChange(value: (/* e */ Any, /* node */ Any, /* record */ Any, /* state */ String) => Any): Self = StObject.set(x, "checkboxChange", js.Any.fromFunction4(value))
    
    inline def setCheckboxChangeUndefined: Self = StObject.set(x, "checkboxChange", js.undefined)
    
    inline def setCheckboxes(value: Boolean): Self = StObject.set(x, "checkboxes", value.asInstanceOf[js.Any])
    
    inline def setCheckboxesUndefined: Self = StObject.set(x, "checkboxes", js.undefined)
    
    inline def setCheckedField(value: String): Self = StObject.set(x, "checkedField", value.asInstanceOf[js.Any])
    
    inline def setCheckedFieldUndefined: Self = StObject.set(x, "checkedField", js.undefined)
    
    inline def setChildrenField(value: String): Self = StObject.set(x, "childrenField", value.asInstanceOf[js.Any])
    
    inline def setChildrenFieldUndefined: Self = StObject.set(x, "childrenField", js.undefined)
    
    inline def setCollapse(value: (/* e */ Any, /* node */ Any, /* id */ String) => Any): Self = StObject.set(x, "collapse", js.Any.fromFunction3(value))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setDataBinding(value: /* e */ Any => Any): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ Any => Any): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDestroying(value: /* e */ Any => Any): Self = StObject.set(x, "destroying", js.Any.fromFunction1(value))
    
    inline def setDestroyingUndefined: Self = StObject.set(x, "destroying", js.undefined)
    
    inline def setDisable(value: (/* e */ Any, /* node */ Any, /* id */ String) => Any): Self = StObject.set(x, "disable", js.Any.fromFunction3(value))
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDisabledField(value: String): Self = StObject.set(x, "disabledField", value.asInstanceOf[js.Any])
    
    inline def setDisabledFieldUndefined: Self = StObject.set(x, "disabledField", js.undefined)
    
    inline def setDragAndDrop(value: Boolean): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
    
    inline def setDragAndDropUndefined: Self = StObject.set(x, "dragAndDrop", js.undefined)
    
    inline def setEnable(value: (/* e */ Any, /* node */ Any, /* id */ String) => Any): Self = StObject.set(x, "enable", js.Any.fromFunction3(value))
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setExpand(value: (/* e */ Any, /* node */ Any, /* id */ String) => Any): Self = StObject.set(x, "expand", js.Any.fromFunction3(value))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setHasChildrenField(value: String): Self = StObject.set(x, "hasChildrenField", value.asInstanceOf[js.Any])
    
    inline def setHasChildrenFieldUndefined: Self = StObject.set(x, "hasChildrenField", js.undefined)
    
    inline def setIcons(value: TreeIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    inline def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setImageCssClassField(value: String): Self = StObject.set(x, "imageCssClassField", value.asInstanceOf[js.Any])
    
    inline def setImageCssClassFieldUndefined: Self = StObject.set(x, "imageCssClassField", js.undefined)
    
    inline def setImageHtmlField(value: String): Self = StObject.set(x, "imageHtmlField", value.asInstanceOf[js.Any])
    
    inline def setImageHtmlFieldUndefined: Self = StObject.set(x, "imageHtmlField", js.undefined)
    
    inline def setImageUrlField(value: String): Self = StObject.set(x, "imageUrlField", value.asInstanceOf[js.Any])
    
    inline def setImageUrlFieldUndefined: Self = StObject.set(x, "imageUrlField", js.undefined)
    
    inline def setInitialized(value: /* e */ Any => Any): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
    
    inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
    
    inline def setLazyLoading(value: Boolean): Self = StObject.set(x, "lazyLoading", value.asInstanceOf[js.Any])
    
    inline def setLazyLoadingUndefined: Self = StObject.set(x, "lazyLoading", js.undefined)
    
    inline def setNodeDataBound(value: (/* e */ Any, /* node */ Any, /* id */ String) => Any): Self = StObject.set(x, "nodeDataBound", js.Any.fromFunction3(value))
    
    inline def setNodeDataBoundUndefined: Self = StObject.set(x, "nodeDataBound", js.undefined)
    
    inline def setNodeDrop(value: (/* e */ Any, /* id */ String, /* parentId */ String, /* orderNumber */ Double) => Any): Self = StObject.set(x, "nodeDrop", js.Any.fromFunction4(value))
    
    inline def setNodeDropUndefined: Self = StObject.set(x, "nodeDrop", js.undefined)
    
    inline def setParamNames(value: TreeParamNames): Self = StObject.set(x, "paramNames", value.asInstanceOf[js.Any])
    
    inline def setParamNamesUndefined: Self = StObject.set(x, "paramNames", js.undefined)
    
    inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setSelect(value: (/* e */ Any, /* node */ Any, /* id */ String) => Any): Self = StObject.set(x, "select", js.Any.fromFunction3(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectionType(value: String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
    
    inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
    
    inline def setTextField(value: String): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
    
    inline def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
    
    inline def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    inline def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    inline def setUnselect(value: (/* e */ Any, /* node */ Any, /* id */ String) => Any): Self = StObject.set(x, "unselect", js.Any.fromFunction3(value))
    
    inline def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
