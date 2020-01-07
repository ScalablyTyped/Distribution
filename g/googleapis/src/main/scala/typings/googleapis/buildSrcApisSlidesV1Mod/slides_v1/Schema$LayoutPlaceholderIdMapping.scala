package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user-specified ID mapping for a placeholder that will be created on a
  * slide from a specified layout.
  */
@js.native
trait Schema$LayoutPlaceholderIdMapping extends js.Object {
  /**
    * The placeholder on a layout that will be applied to a slide. Only type
    * and index are needed. For example, a predefined `TITLE_AND_BODY` layout
    * may usually have a TITLE placeholder with index 0 and a BODY placeholder
    * with index 0.
    */
  var layoutPlaceholder: js.UndefOr[Schema$Placeholder] = js.native
  /**
    * The object ID of the placeholder on a layout that will be applied to a
    * slide.
    */
  var layoutPlaceholderObjectId: js.UndefOr[String] = js.native
  /**
    * A user-supplied object ID for the placeholder identified above that to be
    * created onto a slide.  If you specify an ID, it must be unique among all
    * pages and page elements in the presentation. The ID must start with an
    * alphanumeric character or an underscore (matches regex `[a-zA-Z0-9_]`);
    * remaining characters may include those as well as a hyphen or colon
    * (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less
    * than 5 or greater than 50.  If you don&#39;t specify an ID, a unique one
    * is generated.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$LayoutPlaceholderIdMapping {
  @scala.inline
  def apply(
    layoutPlaceholder: Schema$Placeholder = null,
    layoutPlaceholderObjectId: String = null,
    objectId: String = null
  ): Schema$LayoutPlaceholderIdMapping = {
    val __obj = js.Dynamic.literal()
    if (layoutPlaceholder != null) __obj.updateDynamic("layoutPlaceholder")(layoutPlaceholder.asInstanceOf[js.Any])
    if (layoutPlaceholderObjectId != null) __obj.updateDynamic("layoutPlaceholderObjectId")(layoutPlaceholderObjectId.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LayoutPlaceholderIdMapping]
  }
}

