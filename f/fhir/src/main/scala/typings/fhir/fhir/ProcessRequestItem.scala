package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Items to re-adjudicate
  */
@js.native
trait ProcessRequestItem extends BackboneElement {
  
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.native
  
  /**
    * Service instance
    */
  var sequenceLinkId: integer = js.native
}
object ProcessRequestItem {
  
  @scala.inline
  def apply(sequenceLinkId: integer): ProcessRequestItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRequestItem]
  }
  
  @scala.inline
  implicit class ProcessRequestItemMutableBuilder[Self <: ProcessRequestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSequenceLinkId(value: integer): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceLinkId(value: Element): Self = StObject.set(x, "_sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceLinkIdUndefined: Self = StObject.set(x, "_sequenceLinkId", js.undefined)
  }
}
