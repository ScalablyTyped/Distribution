package typings.dockerode.dockerodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  var Created: Double
  var Id: String
  var Labels: StringDictionary[String]
  var ParentId: String
  var RepoDigests: js.UndefOr[js.Array[String]] = js.undefined
  var RepoTags: js.Array[String]
  var Size: Double
  var VirtualSize: Double
}

object ImageInfo {
  @scala.inline
  def apply(
    Created: Double,
    Id: String,
    Labels: StringDictionary[String],
    ParentId: String,
    RepoTags: js.Array[String],
    Size: Double,
    VirtualSize: Double,
    RepoDigests: js.Array[String] = null
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], ParentId = ParentId.asInstanceOf[js.Any], RepoTags = RepoTags.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], VirtualSize = VirtualSize.asInstanceOf[js.Any])
    if (RepoDigests != null) __obj.updateDynamic("RepoDigests")(RepoDigests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
}

