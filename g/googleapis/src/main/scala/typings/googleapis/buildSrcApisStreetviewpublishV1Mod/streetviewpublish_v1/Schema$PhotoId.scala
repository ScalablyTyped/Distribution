package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifier for a Photo.
  */
@js.native
trait Schema$PhotoId extends js.Object {
  /**
    * Required. A unique identifier for a photo.
    */
  var id: js.UndefOr[String] = js.native
}

object Schema$PhotoId {
  @scala.inline
  def apply(id: String = null): Schema$PhotoId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PhotoId]
  }
}

