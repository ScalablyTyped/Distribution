package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BqmlTrainingRunTrainingOptions extends StObject {
  
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
object BqmlTrainingRunTrainingOptions {
  
  inline def apply(): BqmlTrainingRunTrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlTrainingRunTrainingOptions]
  }
  
  extension [Self <: BqmlTrainingRunTrainingOptions](x: Self) {
    
    inline def setEarlyStop(value: Boolean): Self = StObject.set(x, "earlyStop", value.asInstanceOf[js.Any])
    
    inline def setEarlyStopUndefined: Self = StObject.set(x, "earlyStop", js.undefined)
    
    inline def setL1Reg(value: Double): Self = StObject.set(x, "l1Reg", value.asInstanceOf[js.Any])
    
    inline def setL1RegUndefined: Self = StObject.set(x, "l1Reg", js.undefined)
    
    inline def setL2Reg(value: Double): Self = StObject.set(x, "l2Reg", value.asInstanceOf[js.Any])
    
    inline def setL2RegUndefined: Self = StObject.set(x, "l2Reg", js.undefined)
    
    inline def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    inline def setLearnRateStrategy(value: String): Self = StObject.set(x, "learnRateStrategy", value.asInstanceOf[js.Any])
    
    inline def setLearnRateStrategyUndefined: Self = StObject.set(x, "learnRateStrategy", js.undefined)
    
    inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    inline def setLineSearchInitLearnRate(value: Double): Self = StObject.set(x, "lineSearchInitLearnRate", value.asInstanceOf[js.Any])
    
    inline def setLineSearchInitLearnRateUndefined: Self = StObject.set(x, "lineSearchInitLearnRate", js.undefined)
    
    inline def setMaxIteration(value: String): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
    
    inline def setMinRelProgress(value: Double): Self = StObject.set(x, "minRelProgress", value.asInstanceOf[js.Any])
    
    inline def setMinRelProgressUndefined: Self = StObject.set(x, "minRelProgress", js.undefined)
    
    inline def setWarmStart(value: Boolean): Self = StObject.set(x, "warmStart", value.asInstanceOf[js.Any])
    
    inline def setWarmStartUndefined: Self = StObject.set(x, "warmStart", js.undefined)
  }
}
