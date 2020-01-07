package typings.googleapis.buildSrcApisGenomicsV1Mod.genomics_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the worker stops pulling an image.
  */
@js.native
trait Schema$PullStoppedEvent extends js.Object {
  /**
    * The URI of the image that was pulled.
    */
  var imageUri: js.UndefOr[String] = js.native
}

object Schema$PullStoppedEvent {
  @scala.inline
  def apply(imageUri: String = null): Schema$PullStoppedEvent = {
    val __obj = js.Dynamic.literal()
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PullStoppedEvent]
  }
}

