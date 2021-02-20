package typings.extjs.Ext.chart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICategoryAxis
  extends typings.extjs.Ext.chart.axis.IAxis {
  
  /** [Config Option] (Boolean) */
  var calculateCategoryCount: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var categoryNames: js.UndefOr[String] = js.native
}
object ICategoryAxis {
  
  @scala.inline
  def apply(): ICategoryAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICategoryAxis]
  }
  
  @scala.inline
  implicit class ICategoryAxisMutableBuilder[Self <: ICategoryAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculateCategoryCount(value: Boolean): Self = StObject.set(x, "calculateCategoryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculateCategoryCountUndefined: Self = StObject.set(x, "calculateCategoryCount", js.undefined)
    
    @scala.inline
    def setCategoryNames(value: String): Self = StObject.set(x, "categoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryNamesUndefined: Self = StObject.set(x, "categoryNames", js.undefined)
  }
}
