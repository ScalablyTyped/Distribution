package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an application category object.
  */
@js.native
trait Schema$ApplicationCategory extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#applicationCategory.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The primary category.
    */
  var primary: js.UndefOr[String] = js.native
  /**
    * The secondary category.
    */
  var secondary: js.UndefOr[String] = js.native
}

object Schema$ApplicationCategory {
  @scala.inline
  def apply(kind: String = null, primary: String = null, secondary: String = null): Schema$ApplicationCategory = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApplicationCategory]
  }
}

