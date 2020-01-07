package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Localized versions of certain video properties (e.g. title).
  */
@js.native
trait Schema$VideoLocalization extends js.Object {
  /**
    * Localized version of the video&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Localized version of the video&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$VideoLocalization {
  @scala.inline
  def apply(description: String = null, title: String = null): Schema$VideoLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoLocalization]
  }
}

