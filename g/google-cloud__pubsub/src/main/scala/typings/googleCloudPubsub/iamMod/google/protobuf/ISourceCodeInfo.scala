package typings.googleCloudPubsub.iamMod.google.protobuf

import typings.googleCloudPubsub.iamMod.google.protobuf.SourceCodeInfo.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SourceCodeInfo. */
trait ISourceCodeInfo extends js.Object {
  /** SourceCodeInfo location */
  var location: js.UndefOr[js.Array[ILocation] | Null] = js.undefined
}

object ISourceCodeInfo {
  @scala.inline
  def apply(location: js.Array[ILocation] = null): ISourceCodeInfo = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceCodeInfo]
  }
}

