package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An image built by the pipeline.
  */
@js.native
trait Schema$BuiltImage extends js.Object {
  /**
    * Docker Registry 2.0 digest.
    */
  var digest: js.UndefOr[String] = js.native
  /**
    * Name used to push the container image to Google Container Registry, as
    * presented to `docker push`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Stores timing information for pushing the specified image.
    */
  var pushTiming: js.UndefOr[Schema$TimeSpan] = js.native
}

object Schema$BuiltImage {
  @scala.inline
  def apply(digest: String = null, name: String = null, pushTiming: Schema$TimeSpan = null): Schema$BuiltImage = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pushTiming != null) __obj.updateDynamic("pushTiming")(pushTiming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuiltImage]
  }
}

