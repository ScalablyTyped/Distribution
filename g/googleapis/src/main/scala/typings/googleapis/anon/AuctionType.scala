package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuctionType extends StObject {
  
  var auctionType: js.UndefOr[js.Array[String]] = js.undefined
  
  var contextType: js.UndefOr[String] = js.undefined
  
  var geoCriteriaId: js.UndefOr[js.Array[Double]] = js.undefined
  
  var platform: js.UndefOr[js.Array[String]] = js.undefined
}
object AuctionType {
  
  inline def apply(): AuctionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuctionType]
  }
  
  extension [Self <: AuctionType](x: Self) {
    
    inline def setAuctionType(value: js.Array[String]): Self = StObject.set(x, "auctionType", value.asInstanceOf[js.Any])
    
    inline def setAuctionTypeUndefined: Self = StObject.set(x, "auctionType", js.undefined)
    
    inline def setAuctionTypeVarargs(value: String*): Self = StObject.set(x, "auctionType", js.Array(value*))
    
    inline def setContextType(value: String): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    
    inline def setGeoCriteriaId(value: js.Array[Double]): Self = StObject.set(x, "geoCriteriaId", value.asInstanceOf[js.Any])
    
    inline def setGeoCriteriaIdUndefined: Self = StObject.set(x, "geoCriteriaId", js.undefined)
    
    inline def setGeoCriteriaIdVarargs(value: Double*): Self = StObject.set(x, "geoCriteriaId", js.Array(value*))
    
    inline def setPlatform(value: js.Array[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPlatformVarargs(value: String*): Self = StObject.set(x, "platform", js.Array(value*))
  }
}
