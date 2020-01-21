package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudStorage.AnonStorageClass
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRule extends js.Object {
  var action: AnonStorageClass | String
  var condition: StringDictionary[Boolean | Date | Double | String]
  var storageClass: js.UndefOr[String] = js.undefined
}

object LifecycleRule {
  @scala.inline
  def apply(
    action: AnonStorageClass | String,
    condition: StringDictionary[Boolean | Date | Double | String],
    storageClass: String = null
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
}

