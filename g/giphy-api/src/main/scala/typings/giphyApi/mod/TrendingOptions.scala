package typings.giphyApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrendingOptions extends BaseOptions {
  
  var limit: js.UndefOr[Double] = js.native
}
object TrendingOptions {
  
  @scala.inline
  def apply(rating: Rating): TrendingOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendingOptions]
  }
  
  @scala.inline
  implicit class TrendingOptionsMutableBuilder[Self <: TrendingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
