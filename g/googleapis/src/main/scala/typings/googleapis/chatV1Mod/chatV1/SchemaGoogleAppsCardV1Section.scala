package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1Section extends StObject {
  
  /**
    * Indicates whether this section is collapsible. If a section is collapsible, the description must be given.
    */
  var collapsible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The header of the section. Formatted text is supported.
    */
  var header: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of uncollapsible widgets. For example, when a section contains five widgets and the `uncollapsibleWidgetsCount` is set to `2`, the first two widgets are always shown and the last three are collapsed as default. The `uncollapsibleWidgetsCount` is taken into account only when `collapsible` is `true`.
    */
  var uncollapsibleWidgetsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A section must contain at least 1 widget.
    */
  var widgets: js.UndefOr[js.Array[SchemaGoogleAppsCardV1Widget]] = js.undefined
}
object SchemaGoogleAppsCardV1Section {
  
  inline def apply(): SchemaGoogleAppsCardV1Section = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1Section]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1Section](x: Self) {
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleNull: Self = StObject.set(x, "collapsible", null)
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setUncollapsibleWidgetsCount(value: Double): Self = StObject.set(x, "uncollapsibleWidgetsCount", value.asInstanceOf[js.Any])
    
    inline def setUncollapsibleWidgetsCountNull: Self = StObject.set(x, "uncollapsibleWidgetsCount", null)
    
    inline def setUncollapsibleWidgetsCountUndefined: Self = StObject.set(x, "uncollapsibleWidgetsCount", js.undefined)
    
    inline def setWidgets(value: js.Array[SchemaGoogleAppsCardV1Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: SchemaGoogleAppsCardV1Widget*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
