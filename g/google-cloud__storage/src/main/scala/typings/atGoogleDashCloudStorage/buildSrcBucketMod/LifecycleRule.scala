package typings.atGoogleDashCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.atGoogleDashCloudStorage.Anon_StorageClass
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRule extends js.Object {
  var action: Anon_StorageClass | String
  var condition: StringDictionary[Boolean | Date | Double | String]
  var storageClass: js.UndefOr[String] = js.undefined
}

object LifecycleRule {
  @scala.inline
  def apply(
    action: Anon_StorageClass | String,
    condition: StringDictionary[Boolean | Date | Double | String],
    storageClass: String = null
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[LifecycleRule]
  }
}

