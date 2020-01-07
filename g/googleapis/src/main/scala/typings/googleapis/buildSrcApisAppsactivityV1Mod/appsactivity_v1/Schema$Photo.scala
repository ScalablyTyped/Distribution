package typings.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Photo information for a user.
  */
@js.native
trait Schema$Photo extends js.Object {
  /**
    * The URL of the photo.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$Photo {
  @scala.inline
  def apply(url: String = null): Schema$Photo = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Photo]
  }
}

