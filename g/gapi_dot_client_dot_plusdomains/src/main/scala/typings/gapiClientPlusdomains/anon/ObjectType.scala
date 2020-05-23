package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectType extends js.Object {
  /** The HTML-formatted content, suitable for display. */
  var content: js.UndefOr[String] = js.undefined
  /**
    * The object type of this comment. Possible values are:
    * - "comment" - A comment in reply to an activity.
    */
  var objectType: js.UndefOr[String] = js.undefined
  /**
    * The content (text) as provided by the author, stored without any HTML formatting. When creating or updating a comment, this value must be supplied as
    * plain text in the request.
    */
  var originalContent: js.UndefOr[String] = js.undefined
}

object ObjectType {
  @scala.inline
  def apply(content: String = null, objectType: String = null, originalContent: String = null): ObjectType = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectType]
  }
}

