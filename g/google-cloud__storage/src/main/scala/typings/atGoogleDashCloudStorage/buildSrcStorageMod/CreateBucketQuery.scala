package typings.atGoogleDashCloudStorage.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketQuery extends js.Object {
  var project: String
  var userProject: String
}

object CreateBucketQuery {
  @scala.inline
  def apply(project: String, userProject: String): CreateBucketQuery = {
    val __obj = js.Dynamic.literal(project = project, userProject = userProject)
  
    __obj.asInstanceOf[CreateBucketQuery]
  }
}

