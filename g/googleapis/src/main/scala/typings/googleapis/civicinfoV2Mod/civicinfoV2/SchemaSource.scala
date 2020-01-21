package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about the data source for the element containing it.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * The name of the data source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether this data comes from an official government source.
    */
  var official: js.UndefOr[Boolean] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(name: String = null, official: js.UndefOr[Boolean] = js.undefined): SchemaSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(official)) __obj.updateDynamic("official")(official.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSource]
  }
}

