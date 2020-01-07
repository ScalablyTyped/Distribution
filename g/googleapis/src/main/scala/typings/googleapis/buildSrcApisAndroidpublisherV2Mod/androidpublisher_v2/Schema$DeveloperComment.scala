package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DeveloperComment extends js.Object {
  /**
    * The last time at which this comment was updated.
    */
  var lastModified: js.UndefOr[Schema$Timestamp] = js.native
  /**
    * The content of the comment, i.e. reply body.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$DeveloperComment {
  @scala.inline
  def apply(lastModified: Schema$Timestamp = null, text: String = null): Schema$DeveloperComment = {
    val __obj = js.Dynamic.literal()
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeveloperComment]
  }
}

