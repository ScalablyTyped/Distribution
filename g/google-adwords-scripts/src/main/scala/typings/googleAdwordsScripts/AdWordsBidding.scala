package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsBidding extends js.Object {
  
  def getStrategy(): BiddingStrategy = js.native
  
  def getStrategySource(): BiddingStrategySource = js.native
  
  def getStrategyType(): String = js.native
}
object AdWordsBidding {
  
  @scala.inline
  def apply(
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => BiddingStrategySource,
    getStrategyType: () => String
  ): AdWordsBidding = {
    val __obj = js.Dynamic.literal(getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType))
    __obj.asInstanceOf[AdWordsBidding]
  }
  
  @scala.inline
  implicit class AdWordsBiddingOps[Self <: AdWordsBidding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetStrategy(value: () => BiddingStrategy): Self = this.set("getStrategy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrategySource(value: () => BiddingStrategySource): Self = this.set("getStrategySource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrategyType(value: () => String): Self = this.set("getStrategyType", js.Any.fromFunction0(value))
  }
}
