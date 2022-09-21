package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrid extends StObject {
  
  /**
    * The border style to apply to each grid item.
    */
  var borderStyle: js.UndefOr[SchemaBorderStyle] = js.undefined
  
  /**
    * The items to display in the grid.
    */
  var items: js.UndefOr[js.Array[SchemaGridItem]] = js.undefined
  
  /**
    * The number of columns to display in the grid. Note that a default value will be used if this field is not specified, and that default value will be different depending on where the grid is shown (dialog vs companion).
    */
  var numColumns: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * This callback will be reused by each individual GridItem, but with the item's identifier and index in the items list added to the callback's parameters.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.undefined
  
  /**
    * The text to display in the grid header.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrid {
  
  inline def apply(): SchemaGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrid]
  }
  
  extension [Self <: SchemaGrid](x: Self) {
    
    inline def setBorderStyle(value: SchemaBorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setItems(value: js.Array[SchemaGridItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGridItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    inline def setNumColumnsNull: Self = StObject.set(x, "numColumns", null)
    
    inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    inline def setOnClick(value: SchemaOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
