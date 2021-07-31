package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single entry in the confusion matrix.
  */
trait SchemaEntry extends StObject {
  
  /**
    * Number of items being predicted as this label.
    */
  var itemCount: js.UndefOr[String] = js.undefined
  
  /**
    * The predicted label. For confidence_threshold &gt; 0, we will also add an
    * entry indicating the number of items under the confidence threshold.
    */
  var predictedLabel: js.UndefOr[String] = js.undefined
}
object SchemaEntry {
  
  @scala.inline
  def apply(): SchemaEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntry]
  }
  
  @scala.inline
  implicit class SchemaEntryMutableBuilder[Self <: SchemaEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    @scala.inline
    def setPredictedLabel(value: String): Self = StObject.set(x, "predictedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictedLabelUndefined: Self = StObject.set(x, "predictedLabel", js.undefined)
  }
}
