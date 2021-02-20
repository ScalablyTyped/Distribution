package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuctionType extends StObject {
  
  var auctionType: js.UndefOr[js.Array[String]] = js.native
  
  var contextType: js.UndefOr[String] = js.native
  
  var geoCriteriaId: js.UndefOr[js.Array[Double]] = js.native
  
  var platform: js.UndefOr[js.Array[String]] = js.native
}
object AuctionType {
  
  @scala.inline
  def apply(): AuctionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuctionType]
  }
  
  @scala.inline
  implicit class AuctionTypeMutableBuilder[Self <: AuctionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuctionType(value: js.Array[String]): Self = StObject.set(x, "auctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuctionTypeUndefined: Self = StObject.set(x, "auctionType", js.undefined)
    
    @scala.inline
    def setAuctionTypeVarargs(value: String*): Self = StObject.set(x, "auctionType", js.Array(value :_*))
    
    @scala.inline
    def setContextType(value: String): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    
    @scala.inline
    def setGeoCriteriaId(value: js.Array[Double]): Self = StObject.set(x, "geoCriteriaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoCriteriaIdUndefined: Self = StObject.set(x, "geoCriteriaId", js.undefined)
    
    @scala.inline
    def setGeoCriteriaIdVarargs(value: Double*): Self = StObject.set(x, "geoCriteriaId", js.Array(value :_*))
    
    @scala.inline
    def setPlatform(value: js.Array[String]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setPlatformVarargs(value: String*): Self = StObject.set(x, "platform", js.Array(value :_*))
  }
}
