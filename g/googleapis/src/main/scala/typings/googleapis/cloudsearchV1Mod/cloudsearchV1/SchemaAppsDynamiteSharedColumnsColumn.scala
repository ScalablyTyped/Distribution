package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedColumnsColumn extends StObject {
  
  /**
    * The horizontal alignment of the column.
    */
  var horizontalAlignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies how the column content is sized horizontally.
    */
  var horizontalSizeStyle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The vertical alignment of the column.
    */
  var verticalAlignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * LINT.ThenChange(//google/apps/card/v1/card.proto) Array of widgets included in the column.
    */
  var widgets: js.UndefOr[js.Array[SchemaAppsDynamiteSharedColumnsColumnWidgets]] = js.undefined
}
object SchemaAppsDynamiteSharedColumnsColumn {
  
  inline def apply(): SchemaAppsDynamiteSharedColumnsColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedColumnsColumn]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedColumnsColumn](x: Self) {
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentNull: Self = StObject.set(x, "horizontalAlignment", null)
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setHorizontalSizeStyle(value: String): Self = StObject.set(x, "horizontalSizeStyle", value.asInstanceOf[js.Any])
    
    inline def setHorizontalSizeStyleNull: Self = StObject.set(x, "horizontalSizeStyle", null)
    
    inline def setHorizontalSizeStyleUndefined: Self = StObject.set(x, "horizontalSizeStyle", js.undefined)
    
    inline def setVerticalAlignment(value: String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentNull: Self = StObject.set(x, "verticalAlignment", null)
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWidgets(value: js.Array[SchemaAppsDynamiteSharedColumnsColumnWidgets]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: SchemaAppsDynamiteSharedColumnsColumnWidgets*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
