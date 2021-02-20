package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangePartitioningRange extends StObject {
  
  var end: js.UndefOr[String] = js.native
  
  var interval: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[String] = js.native
}
object RangePartitioningRange {
  
  @scala.inline
  def apply(): RangePartitioningRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePartitioningRange]
  }
  
  @scala.inline
  implicit class RangePartitioningRangeMutableBuilder[Self <: RangePartitioningRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
