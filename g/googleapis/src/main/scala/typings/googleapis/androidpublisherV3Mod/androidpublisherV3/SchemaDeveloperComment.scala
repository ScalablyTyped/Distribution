package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeveloperComment extends js.Object {
  /**
    * The last time at which this comment was updated.
    */
  var lastModified: js.UndefOr[SchemaTimestamp] = js.native
  /**
    * The content of the comment, i.e. reply body.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaDeveloperComment {
  @scala.inline
  def apply(lastModified: SchemaTimestamp = null, text: String = null): SchemaDeveloperComment = {
    val __obj = js.Dynamic.literal()
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeveloperComment]
  }
}

