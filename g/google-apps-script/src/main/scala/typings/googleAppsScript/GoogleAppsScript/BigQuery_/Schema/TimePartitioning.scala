package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePartitioning extends StObject {
  
  var expirationMs: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var requirePartitionFilter: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object TimePartitioning {
  
  @scala.inline
  def apply(): TimePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePartitioning]
  }
  
  @scala.inline
  implicit class TimePartitioningMutableBuilder[Self <: TimePartitioning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationMs(value: String): Self = StObject.set(x, "expirationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMsUndefined: Self = StObject.set(x, "expirationMs", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
