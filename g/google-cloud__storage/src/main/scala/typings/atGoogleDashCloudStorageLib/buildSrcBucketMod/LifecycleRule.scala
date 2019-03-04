package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRule extends js.Object {
  var action: atGoogleDashCloudStorageLib.Anon_StorageClass | java.lang.String
  var condition: org.scalablytyped.runtime.StringDictionary[scala.Boolean | stdLib.Date | scala.Double | java.lang.String]
  var storageClass: js.UndefOr[java.lang.String] = js.undefined
}

object LifecycleRule {
  @scala.inline
  def apply(
    action: atGoogleDashCloudStorageLib.Anon_StorageClass | java.lang.String,
    condition: org.scalablytyped.runtime.StringDictionary[scala.Boolean | stdLib.Date | scala.Double | java.lang.String],
    storageClass: java.lang.String = null
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[LifecycleRule]
  }
}

