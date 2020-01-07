package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for an object.
  */
@js.native
trait Schema$ObjectOptions extends js.Object {
  /**
    * Options that determine how the object is displayed in the Cloud Search
    * results page.
    */
  var displayOptions: js.UndefOr[Schema$ObjectDisplayOptions] = js.native
  /**
    * The freshness options for an object.
    */
  var freshnessOptions: js.UndefOr[Schema$FreshnessOptions] = js.native
}

object Schema$ObjectOptions {
  @scala.inline
  def apply(
    displayOptions: Schema$ObjectDisplayOptions = null,
    freshnessOptions: Schema$FreshnessOptions = null
  ): Schema$ObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (freshnessOptions != null) __obj.updateDynamic("freshnessOptions")(freshnessOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ObjectOptions]
  }
}

