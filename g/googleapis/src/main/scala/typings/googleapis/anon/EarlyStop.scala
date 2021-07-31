package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EarlyStop extends StObject {
  
  var earlyStop: js.UndefOr[Boolean] = js.undefined
  
  var l1Reg: js.UndefOr[Double] = js.undefined
  
  var l2Reg: js.UndefOr[Double] = js.undefined
  
  var learnRate: js.UndefOr[Double] = js.undefined
  
  var learnRateStrategy: js.UndefOr[String] = js.undefined
  
  var lineSearchInitLearnRate: js.UndefOr[Double] = js.undefined
  
  var maxIteration: js.UndefOr[String] = js.undefined
  
  var minRelProgress: js.UndefOr[Double] = js.undefined
  
  var warmStart: js.UndefOr[Boolean] = js.undefined
}
object EarlyStop {
  
  @scala.inline
  def apply(): EarlyStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EarlyStop]
  }
  
  @scala.inline
  implicit class EarlyStopMutableBuilder[Self <: EarlyStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarlyStop(value: Boolean): Self = StObject.set(x, "earlyStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyStopUndefined: Self = StObject.set(x, "earlyStop", js.undefined)
    
    @scala.inline
    def setL1Reg(value: Double): Self = StObject.set(x, "l1Reg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL1RegUndefined: Self = StObject.set(x, "l1Reg", js.undefined)
    
    @scala.inline
    def setL2Reg(value: Double): Self = StObject.set(x, "l2Reg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL2RegUndefined: Self = StObject.set(x, "l2Reg", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateStrategy(value: String): Self = StObject.set(x, "learnRateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateStrategyUndefined: Self = StObject.set(x, "learnRateStrategy", js.undefined)
    
    @scala.inline
    def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    @scala.inline
    def setLineSearchInitLearnRate(value: Double): Self = StObject.set(x, "lineSearchInitLearnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSearchInitLearnRateUndefined: Self = StObject.set(x, "lineSearchInitLearnRate", js.undefined)
    
    @scala.inline
    def setMaxIteration(value: String): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
    
    @scala.inline
    def setMinRelProgress(value: Double): Self = StObject.set(x, "minRelProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRelProgressUndefined: Self = StObject.set(x, "minRelProgress", js.undefined)
    
    @scala.inline
    def setWarmStart(value: Boolean): Self = StObject.set(x, "warmStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmStartUndefined: Self = StObject.set(x, "warmStart", js.undefined)
  }
}
