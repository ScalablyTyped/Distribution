package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentObjectType extends js.Object {
  /** The HTML-formatted content, suitable for display. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The object type of this comment. Possible values are:
    * - "comment" - A comment in reply to an activity.
    */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The content (text) as provided by the author, stored without any HTML formatting. When creating or updating a comment, this value must be supplied as
    * plain text in the request.
    */
  var originalContent: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContentObjectType {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    objectType: java.lang.String = null,
    originalContent: java.lang.String = null
  ): Anon_ContentObjectType = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent)
    __obj.asInstanceOf[Anon_ContentObjectType]
  }
}

