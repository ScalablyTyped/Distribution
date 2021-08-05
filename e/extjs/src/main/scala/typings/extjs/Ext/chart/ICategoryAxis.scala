package typings.extjs.Ext.chart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICategoryAxis
  extends StObject
     with typings.extjs.Ext.chart.axis.IAxis {
  
  /** [Config Option] (Boolean) */
  var calculateCategoryCount: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var categoryNames: js.UndefOr[String] = js.undefined
}
object ICategoryAxis {
  
  inline def apply(): ICategoryAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICategoryAxis]
  }
  
  extension [Self <: ICategoryAxis](x: Self) {
    
    inline def setCalculateCategoryCount(value: Boolean): Self = StObject.set(x, "calculateCategoryCount", value.asInstanceOf[js.Any])
    
    inline def setCalculateCategoryCountUndefined: Self = StObject.set(x, "calculateCategoryCount", js.undefined)
    
    inline def setCategoryNames(value: String): Self = StObject.set(x, "categoryNames", value.asInstanceOf[js.Any])
    
    inline def setCategoryNamesUndefined: Self = StObject.set(x, "categoryNames", js.undefined)
  }
}
