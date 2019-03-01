package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seriesmembership extends js.Object {
  /** Resorce type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var member: js.UndefOr[js.Array[Volume]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object Seriesmembership {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    member: js.Array[Volume] = null,
    nextPageToken: java.lang.String = null
  ): Seriesmembership = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (member != null) __obj.updateDynamic("member")(member)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Seriesmembership]
  }
}

