package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  /** The category name. */
  var category: js.UndefOr[String] = js.undefined
  /** Experience points earned in this category. */
  var experiencePoints: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#category. */
  var kind: js.UndefOr[String] = js.undefined
}

object Category {
  @scala.inline
  def apply(category: String = null, experiencePoints: String = null, kind: String = null): Category = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (experiencePoints != null) __obj.updateDynamic("experiencePoints")(experiencePoints.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

