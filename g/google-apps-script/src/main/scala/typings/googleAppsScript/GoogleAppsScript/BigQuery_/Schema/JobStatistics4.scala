package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics4 extends StObject {
  
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.native
  
  var inputBytes: js.UndefOr[String] = js.native
}
object JobStatistics4 {
  
  @scala.inline
  def apply(): JobStatistics4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics4]
  }
  
  @scala.inline
  implicit class JobStatistics4MutableBuilder[Self <: JobStatistics4] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationUriFileCounts(value: js.Array[String]): Self = StObject.set(x, "destinationUriFileCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUriFileCountsUndefined: Self = StObject.set(x, "destinationUriFileCounts", js.undefined)
    
    @scala.inline
    def setDestinationUriFileCountsVarargs(value: String*): Self = StObject.set(x, "destinationUriFileCounts", js.Array(value :_*))
    
    @scala.inline
    def setInputBytes(value: String): Self = StObject.set(x, "inputBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBytesUndefined: Self = StObject.set(x, "inputBytes", js.undefined)
  }
}
