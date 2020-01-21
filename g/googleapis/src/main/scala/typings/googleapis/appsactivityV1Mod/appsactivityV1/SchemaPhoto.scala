package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Photo information for a user.
  */
@js.native
trait SchemaPhoto extends js.Object {
  /**
    * The URL of the photo.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaPhoto {
  @scala.inline
  def apply(url: String = null): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPhoto]
  }
}

