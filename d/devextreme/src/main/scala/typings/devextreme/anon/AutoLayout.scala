package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.layered
import typings.devextreme.devextremeStrings.off
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoLayout extends StObject {
  
  var autoLayout: js.UndefOr[auto | off | tree | layered | Orientation] = js.undefined
  
  var autoSizeEnabled: js.UndefOr[Boolean] = js.undefined
  
  var containerChildrenExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var containerKeyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var customDataExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var dataSource: js.UndefOr[
    js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.undefined
  
  var heightExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var imageUrlExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var itemsExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var keyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var leftExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var lockedExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var parentKeyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var styleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var textExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var textStyleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var topExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var typeExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var widthExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
  
  var zIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Any])] = js.undefined
}
object AutoLayout {
  
  inline def apply(): AutoLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLayout]
  }
  
  extension [Self <: AutoLayout](x: Self) {
    
    inline def setAutoLayout(value: auto | off | tree | layered | Orientation): Self = StObject.set(x, "autoLayout", value.asInstanceOf[js.Any])
    
    inline def setAutoLayoutUndefined: Self = StObject.set(x, "autoLayout", js.undefined)
    
    inline def setAutoSizeEnabled(value: Boolean): Self = StObject.set(x, "autoSizeEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeEnabledUndefined: Self = StObject.set(x, "autoSizeEnabled", js.undefined)
    
    inline def setContainerChildrenExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "containerChildrenExpr", value.asInstanceOf[js.Any])
    
    inline def setContainerChildrenExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "containerChildrenExpr", js.Any.fromFunction1(value))
    
    inline def setContainerChildrenExprUndefined: Self = StObject.set(x, "containerChildrenExpr", js.undefined)
    
    inline def setContainerKeyExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "containerKeyExpr", value.asInstanceOf[js.Any])
    
    inline def setContainerKeyExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "containerKeyExpr", js.Any.fromFunction1(value))
    
    inline def setContainerKeyExprUndefined: Self = StObject.set(x, "containerKeyExpr", js.undefined)
    
    inline def setCustomDataExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "customDataExpr", value.asInstanceOf[js.Any])
    
    inline def setCustomDataExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "customDataExpr", js.Any.fromFunction1(value))
    
    inline def setCustomDataExprUndefined: Self = StObject.set(x, "customDataExpr", js.undefined)
    
    inline def setDataSource(value: js.Array[js.Any] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setHeightExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "heightExpr", value.asInstanceOf[js.Any])
    
    inline def setHeightExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "heightExpr", js.Any.fromFunction1(value))
    
    inline def setHeightExprUndefined: Self = StObject.set(x, "heightExpr", js.undefined)
    
    inline def setImageUrlExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "imageUrlExpr", value.asInstanceOf[js.Any])
    
    inline def setImageUrlExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "imageUrlExpr", js.Any.fromFunction1(value))
    
    inline def setImageUrlExprUndefined: Self = StObject.set(x, "imageUrlExpr", js.undefined)
    
    inline def setItemsExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "itemsExpr", value.asInstanceOf[js.Any])
    
    inline def setItemsExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "itemsExpr", js.Any.fromFunction1(value))
    
    inline def setItemsExprUndefined: Self = StObject.set(x, "itemsExpr", js.undefined)
    
    inline def setKeyExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "keyExpr", js.Any.fromFunction1(value))
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setLeftExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "leftExpr", value.asInstanceOf[js.Any])
    
    inline def setLeftExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "leftExpr", js.Any.fromFunction1(value))
    
    inline def setLeftExprUndefined: Self = StObject.set(x, "leftExpr", js.undefined)
    
    inline def setLockedExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "lockedExpr", value.asInstanceOf[js.Any])
    
    inline def setLockedExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "lockedExpr", js.Any.fromFunction1(value))
    
    inline def setLockedExprUndefined: Self = StObject.set(x, "lockedExpr", js.undefined)
    
    inline def setParentKeyExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "parentKeyExpr", value.asInstanceOf[js.Any])
    
    inline def setParentKeyExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "parentKeyExpr", js.Any.fromFunction1(value))
    
    inline def setParentKeyExprUndefined: Self = StObject.set(x, "parentKeyExpr", js.undefined)
    
    inline def setStyleExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "styleExpr", value.asInstanceOf[js.Any])
    
    inline def setStyleExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "styleExpr", js.Any.fromFunction1(value))
    
    inline def setStyleExprUndefined: Self = StObject.set(x, "styleExpr", js.undefined)
    
    inline def setTextExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "textExpr", value.asInstanceOf[js.Any])
    
    inline def setTextExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "textExpr", js.Any.fromFunction1(value))
    
    inline def setTextExprUndefined: Self = StObject.set(x, "textExpr", js.undefined)
    
    inline def setTextStyleExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "textStyleExpr", value.asInstanceOf[js.Any])
    
    inline def setTextStyleExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "textStyleExpr", js.Any.fromFunction1(value))
    
    inline def setTextStyleExprUndefined: Self = StObject.set(x, "textStyleExpr", js.undefined)
    
    inline def setTopExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "topExpr", value.asInstanceOf[js.Any])
    
    inline def setTopExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "topExpr", js.Any.fromFunction1(value))
    
    inline def setTopExprUndefined: Self = StObject.set(x, "topExpr", js.undefined)
    
    inline def setTypeExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "typeExpr", value.asInstanceOf[js.Any])
    
    inline def setTypeExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "typeExpr", js.Any.fromFunction1(value))
    
    inline def setTypeExprUndefined: Self = StObject.set(x, "typeExpr", js.undefined)
    
    inline def setWidthExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "widthExpr", value.asInstanceOf[js.Any])
    
    inline def setWidthExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "widthExpr", js.Any.fromFunction1(value))
    
    inline def setWidthExprUndefined: Self = StObject.set(x, "widthExpr", js.undefined)
    
    inline def setZIndexExpr(value: String | (js.Function1[/* data */ js.Any, js.Any])): Self = StObject.set(x, "zIndexExpr", value.asInstanceOf[js.Any])
    
    inline def setZIndexExprFunction1(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "zIndexExpr", js.Any.fromFunction1(value))
    
    inline def setZIndexExprUndefined: Self = StObject.set(x, "zIndexExpr", js.undefined)
  }
}
