package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A section contains a collection of widgets that are rendered (vertically)
  * in the order that they are specified. Across all platforms, cards have a
  * narrow fixed width, so there is currently no need for layout properties
  * (e.g. float).
  */
trait SchemaSection extends StObject {
  
  /**
    * The header of the section, text formatted supported.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * A section must contain at least 1 widget.
    */
  var widgets: js.UndefOr[js.Array[SchemaWidgetMarkup]] = js.undefined
}
object SchemaSection {
  
  inline def apply(): SchemaSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSection]
  }
  
  extension [Self <: SchemaSection](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setWidgets(value: js.Array[SchemaWidgetMarkup]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: SchemaWidgetMarkup*): Self = StObject.set(x, "widgets", js.Array(value :_*))
  }
}
