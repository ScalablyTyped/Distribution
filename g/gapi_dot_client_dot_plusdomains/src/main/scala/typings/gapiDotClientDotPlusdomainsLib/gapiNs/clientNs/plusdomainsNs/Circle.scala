package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends js.Object {
  /** The description of this circle. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The circle name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the circle. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this resource as a circle. Value: "plus#circle". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The people in this circle. */
  var people: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_TotalItems] = js.undefined
  /** Link to this circle resource */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object Circle {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    people: gapiDotClientDotPlusdomainsLib.Anon_TotalItems = null,
    selfLink: java.lang.String = null
  ): Circle = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (people != null) __obj.updateDynamic("people")(people)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[Circle]
  }
}

