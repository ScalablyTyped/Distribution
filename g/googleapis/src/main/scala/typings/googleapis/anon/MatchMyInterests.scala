package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchMyInterests extends StObject {
  
  var matchMyInterests: js.UndefOr[Optedstate] = js.native
  
  var moreFromAuthors: js.UndefOr[Optedstate] = js.native
  
  var moreFromSeries: js.UndefOr[Optedstate] = js.native
  
  var priceDrop: js.UndefOr[Optedstate] = js.native
  
  var rewardExpirations: js.UndefOr[Optedstate] = js.native
}
object MatchMyInterests {
  
  @scala.inline
  def apply(): MatchMyInterests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchMyInterests]
  }
  
  @scala.inline
  implicit class MatchMyInterestsMutableBuilder[Self <: MatchMyInterests] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchMyInterests(value: Optedstate): Self = StObject.set(x, "matchMyInterests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchMyInterestsUndefined: Self = StObject.set(x, "matchMyInterests", js.undefined)
    
    @scala.inline
    def setMoreFromAuthors(value: Optedstate): Self = StObject.set(x, "moreFromAuthors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreFromAuthorsUndefined: Self = StObject.set(x, "moreFromAuthors", js.undefined)
    
    @scala.inline
    def setMoreFromSeries(value: Optedstate): Self = StObject.set(x, "moreFromSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreFromSeriesUndefined: Self = StObject.set(x, "moreFromSeries", js.undefined)
    
    @scala.inline
    def setPriceDrop(value: Optedstate): Self = StObject.set(x, "priceDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceDropUndefined: Self = StObject.set(x, "priceDrop", js.undefined)
    
    @scala.inline
    def setRewardExpirations(value: Optedstate): Self = StObject.set(x, "rewardExpirations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewardExpirationsUndefined: Self = StObject.set(x, "rewardExpirations", js.undefined)
  }
}
