package typings.fhirJsClient.FHIR.SMART

import typings.fhirJsClient.anon.DictpropName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonQueryFilters extends StObject {
  
  /**
    * Number of return records requested. The server is not bound to return the number requested, but cannot return more
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * Addition filters to be applied on the history query. The object will be converted into query string parameters.
    */
  var params: js.UndefOr[DictpropName] = js.native
  
  /**
    * Only include resource versions that were created at or after the given instant in time
    *
    * Type: instant An instant in time - known at least to the second and always includes a time zone.
    * Note: This is intended for precisely observed times (typically system logs etc.), and not human-reported times - for them,
    * use date and dateTime. instant is a more constrained dateTime xs:dateTime A JSON string - an xs:dateTime
    * Note: This type is for system times, not human times (see date and dateTime below).
    */
  var since: js.UndefOr[String] = js.native
}
object CommonQueryFilters {
  
  @scala.inline
  def apply(): CommonQueryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonQueryFilters]
  }
  
  @scala.inline
  implicit class CommonQueryFiltersMutableBuilder[Self <: CommonQueryFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setParams(value: DictpropName): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
