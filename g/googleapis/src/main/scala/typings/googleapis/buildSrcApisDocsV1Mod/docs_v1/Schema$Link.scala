package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to another portion of a document or an external URL resource.
  */
@js.native
trait Schema$Link extends js.Object {
  /**
    * The ID of a bookmark in this document.
    */
  var bookmarkId: js.UndefOr[String] = js.native
  /**
    * The ID of a heading in this document.
    */
  var headingId: js.UndefOr[String] = js.native
  /**
    * An external URL.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$Link {
  @scala.inline
  def apply(bookmarkId: String = null, headingId: String = null, url: String = null): Schema$Link = {
    val __obj = js.Dynamic.literal()
    if (bookmarkId != null) __obj.updateDynamic("bookmarkId")(bookmarkId.asInstanceOf[js.Any])
    if (headingId != null) __obj.updateDynamic("headingId")(headingId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Link]
  }
}

