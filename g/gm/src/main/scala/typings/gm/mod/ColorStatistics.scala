package typings.gm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStatistics extends StObject {
  
  var Maximum: String
  
  var Mean: String
  
  var Minimum: String
  
  var `Standard Deviation`: String
}
object ColorStatistics {
  
  inline def apply(Maximum: String, Mean: String, Minimum: String, `Standard Deviation`: String): ColorStatistics = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Mean = Mean.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any])
    __obj.updateDynamic("Standard Deviation")((`Standard Deviation`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStatistics]
  }
  
  extension [Self <: ColorStatistics](x: Self) {
    
    inline def setMaximum(value: String): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMean(value: String): Self = StObject.set(x, "Mean", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: String): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    inline def `setStandard Deviation`(value: String): Self = StObject.set(x, "Standard Deviation", value.asInstanceOf[js.Any])
  }
}
