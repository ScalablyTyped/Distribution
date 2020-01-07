package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A connection is the link from a source photo to a destination photo.
  */
@js.native
trait Schema$Connection extends js.Object {
  /**
    * Required. The destination of the connection from the containing photo to
    * another photo.
    */
  var target: js.UndefOr[Schema$PhotoId] = js.native
}

object Schema$Connection {
  @scala.inline
  def apply(target: Schema$PhotoId = null): Schema$Connection = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Connection]
  }
}

