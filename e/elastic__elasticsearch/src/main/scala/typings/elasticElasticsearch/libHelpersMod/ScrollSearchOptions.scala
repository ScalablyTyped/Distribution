package typings.elasticElasticsearch.libHelpersMod

import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollSearchOptions
  extends StObject
     with TransportRequestOptions {
  
  @JSName("wait")
  var wait_FScrollSearchOptions: js.UndefOr[Double] = js.undefined
}
object ScrollSearchOptions {
  
  inline def apply(): ScrollSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSearchOptions]
  }
  
  extension [Self <: ScrollSearchOptions](x: Self) {
    
    inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
