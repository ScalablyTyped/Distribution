package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actor extends js.Object {
  /**
    * If this activity's object is itself another activity, such as when a person reshares an activity, this property specifies the original activity's
    * actor.
    */
  var actor: js.UndefOr[Anon_ClientSpecificActorInfoDisplayName] = js.undefined
  /** The media objects attached to this activity. */
  var attachments: js.UndefOr[js.Array[Anon_Content]] = js.undefined
  /** The HTML-formatted content, which is suitable for display. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the object. When resharing an activity, this is the ID of the activity that is being reshared. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the object. Possible values include, but are not limited to, the following values:
    * - "note" - Textual content.
    * - "activity" - A Google+ activity.
    */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The content (text) as provided by the author, which is stored without any HTML formatting. When creating or updating an activity, this value must be
    * supplied as plain text in the request.
    */
  var originalContent: js.UndefOr[java.lang.String] = js.undefined
  /** People who +1'd this activity. */
  var plusoners: js.UndefOr[Anon_SelfLink] = js.undefined
  /** Comments in reply to this activity. */
  var replies: js.UndefOr[Anon_SelfLink] = js.undefined
  /** People who reshared this activity. */
  var resharers: js.UndefOr[Anon_SelfLink] = js.undefined
  /** The URL that points to the linked resource. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

