package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeason extends StObject {
  
  /**
    * Inclusive end date of the recurrence period.
    */
  var end: js.UndefOr[SchemaMonthDay] = js.undefined
  
  /**
    * Optionally present list of prorations for the season. Each proration is a
    * one-off discounted entry into a subscription. Each proration contains the
    * first date on which the discount is available and the new pricing
    * information.
    */
  var prorations: js.UndefOr[js.Array[SchemaProrate]] = js.undefined
  
  /**
    * Inclusive start date of the recurrence period.
    */
  var start: js.UndefOr[SchemaMonthDay] = js.undefined
}
object SchemaSeason {
  
  @scala.inline
  def apply(): SchemaSeason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeason]
  }
  
  @scala.inline
  implicit class SchemaSeasonMutableBuilder[Self <: SchemaSeason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: SchemaMonthDay): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setProrations(value: js.Array[SchemaProrate]): Self = StObject.set(x, "prorations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProrationsUndefined: Self = StObject.set(x, "prorations", js.undefined)
    
    @scala.inline
    def setProrationsVarargs(value: SchemaProrate*): Self = StObject.set(x, "prorations", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: SchemaMonthDay): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
