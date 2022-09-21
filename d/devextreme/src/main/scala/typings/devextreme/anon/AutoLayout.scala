package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramDataLayoutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoLayout extends StObject {
  
  /**
    * Specifies an auto-layout algorithm that the UI component uses to build a diagram.
    */
  var autoLayout: js.UndefOr[DiagramDataLayoutType | Orientation] = js.undefined
  
  /**
    * Specifies whether or not a shape size is automatically changed to fit the text when the UI component is bound to a data source.
    */
  var autoSizeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a container&apos;s nested items.
    */
  var containerChildrenExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a key of a node&apos;s parent container node.
    */
  var containerKeyExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a node&apos;s custom data.
    */
  var customDataExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Binds the nodes collection to the specified data. For more information, see the Data Binding section.
    */
  var dataSource: js.UndefOr[(DataSourceLike[Any, Any]) | Null] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a node&apos;s height.
    */
  var heightExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns an image URL or Base64 encoded image for a node.
    */
  var imageUrlExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a node&apos;s child items.
    */
  var itemsExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns node keys.
    */
  var keyExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns the x-coordinate of a node&apos;s left border.
    */
  var leftExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression whose values indicate whether a node is locked.
    */
  var lockedExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a parent node key for a node.
    */
  var parentKeyExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a node style.
    */
  var styleExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns node texts.
    */
  var textExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a node&apos;s text style.
    */
  var textStyleExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns the y-coordinate of a node&apos;s top border.
    */
  var topExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns the shape type for a node.
    */
  var typeExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a node&apos;s width.
    */
  var widthExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
  
  /**
    * Specifies the name of a data source field or an expression that returns a node&apos;s z-index.
    */
  var zIndexExpr: js.UndefOr[String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])] = js.undefined
}
object AutoLayout {
  
  inline def apply(): AutoLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLayout]
  }
  
  extension [Self <: AutoLayout](x: Self) {
    
    inline def setAutoLayout(value: DiagramDataLayoutType | Orientation): Self = StObject.set(x, "autoLayout", value.asInstanceOf[js.Any])
    
    inline def setAutoLayoutUndefined: Self = StObject.set(x, "autoLayout", js.undefined)
    
    inline def setAutoSizeEnabled(value: Boolean): Self = StObject.set(x, "autoSizeEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeEnabledUndefined: Self = StObject.set(x, "autoSizeEnabled", js.undefined)
    
    inline def setContainerChildrenExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "containerChildrenExpr", value.asInstanceOf[js.Any])
    
    inline def setContainerChildrenExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "containerChildrenExpr", js.Any.fromFunction2(value))
    
    inline def setContainerChildrenExprUndefined: Self = StObject.set(x, "containerChildrenExpr", js.undefined)
    
    inline def setContainerKeyExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "containerKeyExpr", value.asInstanceOf[js.Any])
    
    inline def setContainerKeyExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "containerKeyExpr", js.Any.fromFunction2(value))
    
    inline def setContainerKeyExprUndefined: Self = StObject.set(x, "containerKeyExpr", js.undefined)
    
    inline def setCustomDataExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "customDataExpr", value.asInstanceOf[js.Any])
    
    inline def setCustomDataExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "customDataExpr", js.Any.fromFunction2(value))
    
    inline def setCustomDataExprUndefined: Self = StObject.set(x, "customDataExpr", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setHeightExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "heightExpr", value.asInstanceOf[js.Any])
    
    inline def setHeightExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "heightExpr", js.Any.fromFunction2(value))
    
    inline def setHeightExprUndefined: Self = StObject.set(x, "heightExpr", js.undefined)
    
    inline def setImageUrlExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "imageUrlExpr", value.asInstanceOf[js.Any])
    
    inline def setImageUrlExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "imageUrlExpr", js.Any.fromFunction2(value))
    
    inline def setImageUrlExprUndefined: Self = StObject.set(x, "imageUrlExpr", js.undefined)
    
    inline def setItemsExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "itemsExpr", value.asInstanceOf[js.Any])
    
    inline def setItemsExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "itemsExpr", js.Any.fromFunction2(value))
    
    inline def setItemsExprUndefined: Self = StObject.set(x, "itemsExpr", js.undefined)
    
    inline def setKeyExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "keyExpr", js.Any.fromFunction2(value))
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setLeftExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "leftExpr", value.asInstanceOf[js.Any])
    
    inline def setLeftExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "leftExpr", js.Any.fromFunction2(value))
    
    inline def setLeftExprUndefined: Self = StObject.set(x, "leftExpr", js.undefined)
    
    inline def setLockedExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "lockedExpr", value.asInstanceOf[js.Any])
    
    inline def setLockedExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "lockedExpr", js.Any.fromFunction2(value))
    
    inline def setLockedExprUndefined: Self = StObject.set(x, "lockedExpr", js.undefined)
    
    inline def setParentKeyExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "parentKeyExpr", value.asInstanceOf[js.Any])
    
    inline def setParentKeyExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "parentKeyExpr", js.Any.fromFunction2(value))
    
    inline def setParentKeyExprUndefined: Self = StObject.set(x, "parentKeyExpr", js.undefined)
    
    inline def setStyleExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "styleExpr", value.asInstanceOf[js.Any])
    
    inline def setStyleExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "styleExpr", js.Any.fromFunction2(value))
    
    inline def setStyleExprUndefined: Self = StObject.set(x, "styleExpr", js.undefined)
    
    inline def setTextExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "textExpr", value.asInstanceOf[js.Any])
    
    inline def setTextExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "textExpr", js.Any.fromFunction2(value))
    
    inline def setTextExprUndefined: Self = StObject.set(x, "textExpr", js.undefined)
    
    inline def setTextStyleExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "textStyleExpr", value.asInstanceOf[js.Any])
    
    inline def setTextStyleExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "textStyleExpr", js.Any.fromFunction2(value))
    
    inline def setTextStyleExprUndefined: Self = StObject.set(x, "textStyleExpr", js.undefined)
    
    inline def setTopExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "topExpr", value.asInstanceOf[js.Any])
    
    inline def setTopExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "topExpr", js.Any.fromFunction2(value))
    
    inline def setTopExprUndefined: Self = StObject.set(x, "topExpr", js.undefined)
    
    inline def setTypeExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "typeExpr", value.asInstanceOf[js.Any])
    
    inline def setTypeExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "typeExpr", js.Any.fromFunction2(value))
    
    inline def setTypeExprUndefined: Self = StObject.set(x, "typeExpr", js.undefined)
    
    inline def setWidthExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "widthExpr", value.asInstanceOf[js.Any])
    
    inline def setWidthExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "widthExpr", js.Any.fromFunction2(value))
    
    inline def setWidthExprUndefined: Self = StObject.set(x, "widthExpr", js.undefined)
    
    inline def setZIndexExpr(value: String | (js.Function2[/* data */ Any, /* value */ js.UndefOr[Any], Any])): Self = StObject.set(x, "zIndexExpr", value.asInstanceOf[js.Any])
    
    inline def setZIndexExprFunction2(value: (/* data */ Any, /* value */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "zIndexExpr", js.Any.fromFunction2(value))
    
    inline def setZIndexExprUndefined: Self = StObject.set(x, "zIndexExpr", js.undefined)
  }
}
