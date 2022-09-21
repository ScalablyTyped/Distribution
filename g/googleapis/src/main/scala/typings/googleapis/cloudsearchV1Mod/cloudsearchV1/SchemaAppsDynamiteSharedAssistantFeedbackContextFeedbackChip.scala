package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedAssistantFeedbackContextFeedbackChip extends StObject {
  
  /**
    * What type of chip to display
    */
  var feedbackChipType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the chip has been selected
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedAssistantFeedbackContextFeedbackChip {
  
  inline def apply(): SchemaAppsDynamiteSharedAssistantFeedbackContextFeedbackChip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedAssistantFeedbackContextFeedbackChip]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedAssistantFeedbackContextFeedbackChip](x: Self) {
    
    inline def setFeedbackChipType(value: String): Self = StObject.set(x, "feedbackChipType", value.asInstanceOf[js.Any])
    
    inline def setFeedbackChipTypeNull: Self = StObject.set(x, "feedbackChipType", null)
    
    inline def setFeedbackChipTypeUndefined: Self = StObject.set(x, "feedbackChipType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
