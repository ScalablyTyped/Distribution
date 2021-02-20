package typings.devextreme.anon

import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.smallValueThreshold
import typings.devextreme.devextremeStrings.topN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupName extends StObject {
  
  var groupName: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[none | smallValueThreshold | topN] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
  
  var topCount: js.UndefOr[Double] = js.native
}
object GroupName {
  
  @scala.inline
  def apply(): GroupName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupName]
  }
  
  @scala.inline
  implicit class GroupNameMutableBuilder[Self <: GroupName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setMode(value: none | smallValueThreshold | topN): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setTopCount(value: Double): Self = StObject.set(x, "topCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopCountUndefined: Self = StObject.set(x, "topCount", js.undefined)
  }
}
