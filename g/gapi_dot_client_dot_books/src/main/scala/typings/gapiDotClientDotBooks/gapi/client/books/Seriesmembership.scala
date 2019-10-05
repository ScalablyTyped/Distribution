package typings.gapiDotClientDotBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seriesmembership extends js.Object {
  /** Resorce type. */
  var kind: js.UndefOr[String] = js.undefined
  var member: js.UndefOr[js.Array[Volume]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Seriesmembership {
  @scala.inline
  def apply(kind: String = null, member: js.Array[Volume] = null, nextPageToken: String = null): Seriesmembership = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (member != null) __obj.updateDynamic("member")(member)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Seriesmembership]
  }
}

