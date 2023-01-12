package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
}
object XpackUsageRequest {
  
  inline def apply(): XpackUsageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackUsageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageRequest] (val x: Self) extends AnyVal {
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
  }
}
