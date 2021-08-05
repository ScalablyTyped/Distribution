package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Items to re-adjudicate
  */
trait ProcessRequestItem
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  
  /**
    * Service instance
    */
  var sequenceLinkId: integer
}
object ProcessRequestItem {
  
  inline def apply(sequenceLinkId: integer): ProcessRequestItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRequestItem]
  }
  
  extension [Self <: ProcessRequestItem](x: Self) {
    
    inline def setSequenceLinkId(value: integer): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def set_sequenceLinkId(value: Element): Self = StObject.set(x, "_sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def set_sequenceLinkIdUndefined: Self = StObject.set(x, "_sequenceLinkId", js.undefined)
  }
}
