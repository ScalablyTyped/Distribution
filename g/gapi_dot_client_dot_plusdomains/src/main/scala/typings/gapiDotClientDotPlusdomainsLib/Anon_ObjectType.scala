package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectType extends js.Object {
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

