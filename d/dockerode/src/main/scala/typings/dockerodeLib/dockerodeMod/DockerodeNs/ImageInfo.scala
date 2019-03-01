package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  var Created: scala.Double
  var Id: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var ParentId: java.lang.String
  var RepoDigests: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var RepoTags: js.Array[java.lang.String]
  var Size: scala.Double
  var VirtualSize: scala.Double
}

object ImageInfo {
  @scala.inline
  def apply(
    Created: scala.Double,
    Id: java.lang.String,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ParentId: java.lang.String,
    RepoTags: js.Array[java.lang.String],
    Size: scala.Double,
    VirtualSize: scala.Double,
    RepoDigests: js.Array[java.lang.String] = null
  ): ImageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Created")(Created)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Labels")(Labels)
    __obj.updateDynamic("ParentId")(ParentId)
    __obj.updateDynamic("RepoTags")(RepoTags)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("VirtualSize")(VirtualSize)
    if (RepoDigests != null) __obj.updateDynamic("RepoDigests")(RepoDigests)
    __obj.asInstanceOf[ImageInfo]
  }
}

