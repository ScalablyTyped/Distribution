package typings
package atGoogleDashCloudStorageLib.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketQuery extends js.Object {
  var project: java.lang.String
  var userProject: java.lang.String
}

object CreateBucketQuery {
  @scala.inline
  def apply(project: java.lang.String, userProject: java.lang.String): CreateBucketQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[CreateBucketQuery]
  }
}

