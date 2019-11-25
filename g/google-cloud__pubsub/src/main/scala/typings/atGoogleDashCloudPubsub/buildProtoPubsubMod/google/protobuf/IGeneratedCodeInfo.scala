package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GeneratedCodeInfo. */
trait IGeneratedCodeInfo extends js.Object {
  /** GeneratedCodeInfo annotation */
  var annotation: js.UndefOr[js.Array[IAnnotation] | Null] = js.undefined
}

object IGeneratedCodeInfo {
  @scala.inline
  def apply(annotation: js.Array[IAnnotation] = null): IGeneratedCodeInfo = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeneratedCodeInfo]
  }
}

