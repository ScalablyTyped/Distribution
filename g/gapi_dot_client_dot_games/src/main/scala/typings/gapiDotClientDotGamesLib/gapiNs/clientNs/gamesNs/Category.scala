package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /** The category name. */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** Experience points earned in this category. */
  var experiencePoints: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#category. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Category {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    experiencePoints: java.lang.String = null,
    kind: java.lang.String = null
  ): Category = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (experiencePoints != null) __obj.updateDynamic("experiencePoints")(experiencePoints)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Category]
  }
}

