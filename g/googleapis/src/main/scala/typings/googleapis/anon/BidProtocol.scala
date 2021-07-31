package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BidProtocol extends StObject {
  
  var bidProtocol: js.UndefOr[String] = js.undefined
  
  var maximumQps: js.UndefOr[Double] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object BidProtocol {
  
  @scala.inline
  def apply(): BidProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BidProtocol]
  }
  
  @scala.inline
  implicit class BidProtocolMutableBuilder[Self <: BidProtocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidProtocol(value: String): Self = StObject.set(x, "bidProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidProtocolUndefined: Self = StObject.set(x, "bidProtocol", js.undefined)
    
    @scala.inline
    def setMaximumQps(value: Double): Self = StObject.set(x, "maximumQps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumQpsUndefined: Self = StObject.set(x, "maximumQps", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
