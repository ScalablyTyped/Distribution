package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.LogicalAxes
import typings.devtoolsProtocol.mod.Protocol.DOM.PhysicalAxes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSContainerQuery extends StObject {
  
  /**
    * Optional logical axes queried for the container.
    */
  var logicalAxes: js.UndefOr[LogicalAxes] = js.undefined
  
  /**
    * Optional name for the container.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional physical axes queried for the container.
    */
  var physicalAxes: js.UndefOr[PhysicalAxes] = js.undefined
  
  /**
    * The associated rule header range in the enclosing stylesheet (if
    * available).
    */
  var range: js.UndefOr[SourceRange] = js.undefined
  
  /**
    * Identifier of the stylesheet containing this object (if exists).
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.undefined
  
  /**
    * Container query text.
    */
  var text: String
}
object CSSContainerQuery {
  
  inline def apply(text: String): CSSContainerQuery = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSContainerQuery]
  }
  
  extension [Self <: CSSContainerQuery](x: Self) {
    
    inline def setLogicalAxes(value: LogicalAxes): Self = StObject.set(x, "logicalAxes", value.asInstanceOf[js.Any])
    
    inline def setLogicalAxesUndefined: Self = StObject.set(x, "logicalAxes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhysicalAxes(value: PhysicalAxes): Self = StObject.set(x, "physicalAxes", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAxesUndefined: Self = StObject.set(x, "physicalAxes", js.undefined)
    
    inline def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
