package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.anon.StorageClass
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleRule extends js.Object {
  
  var action: StorageClass | String = js.native
  
  var condition: StringDictionary[Boolean | Date | Double | String] = js.native
  
  var storageClass: js.UndefOr[String] = js.native
}
object LifecycleRule {
  
  @scala.inline
  def apply(action: StorageClass | String, condition: StringDictionary[Boolean | Date | Double | String]): LifecycleRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  @scala.inline
  implicit class LifecycleRuleOps[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    
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
    def setAction(value: StorageClass | String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: StringDictionary[Boolean | Date | Double | String]): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClass(value: String): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
  }
}
