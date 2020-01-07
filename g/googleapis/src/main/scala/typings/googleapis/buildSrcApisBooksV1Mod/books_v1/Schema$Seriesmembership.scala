package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Seriesmembership extends js.Object {
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String] = js.native
  var member: js.UndefOr[js.Array[Schema$Volume]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$Seriesmembership {
  @scala.inline
  def apply(kind: String = null, member: js.Array[Schema$Volume] = null, nextPageToken: String = null): Schema$Seriesmembership = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Seriesmembership]
  }
}

