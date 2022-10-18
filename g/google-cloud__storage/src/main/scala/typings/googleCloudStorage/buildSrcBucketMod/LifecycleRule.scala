package typings.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.anon.StorageClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleRule extends StObject {
  
  var action: StorageClass | String
  
  var condition: StringDictionary[Boolean | js.Date | Double | String | js.Array[String]]
  
  var storageClass: js.UndefOr[String] = js.undefined
}
object LifecycleRule {
  
  inline def apply(
    action: StorageClass | String,
    condition: StringDictionary[Boolean | js.Date | Double | String | js.Array[String]]
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  extension [Self <: LifecycleRule](x: Self) {
    
    inline def setAction(value: StorageClass | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: StringDictionary[Boolean | js.Date | Double | String | js.Array[String]]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
  }
}
