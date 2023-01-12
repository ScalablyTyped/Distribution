package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessRequestItem
  extends StObject
     with BackboneElement {
  
  /**
    * A service line number.
    */
  var sequenceLinkId: Double
}
object ProcessRequestItem {
  
  inline def apply(sequenceLinkId: Double): ProcessRequestItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRequestItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessRequestItem] (val x: Self) extends AnyVal {
    
    inline def setSequenceLinkId(value: Double): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
  }
}
