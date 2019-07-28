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
    val __obj = js.Dynamic.literal(Created = Created, Id = Id, Labels = Labels, ParentId = ParentId, RepoTags = RepoTags, Size = Size, VirtualSize = VirtualSize)
    if (RepoDigests != null) __obj.updateDynamic("RepoDigests")(RepoDigests)
    __obj.asInstanceOf[ImageInfo]
  }
}

