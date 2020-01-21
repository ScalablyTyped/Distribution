package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSeriesmembership extends js.Object {
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String] = js.native
  var member: js.UndefOr[js.Array[SchemaVolume]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaSeriesmembership {
  @scala.inline
  def apply(kind: String = null, member: js.Array[SchemaVolume] = null, nextPageToken: String = null): SchemaSeriesmembership = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSeriesmembership]
  }
}

