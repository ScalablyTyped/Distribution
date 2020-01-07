package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a top-level property within the object that should be
  * displayed in search results. The values of the chosen properties will be
  * displayed in the search results along with the dislpay label for that
  * property if one is specified. If a display label is not specified, only the
  * values will be shown.
  */
@js.native
trait Schema$DisplayedProperty extends js.Object {
  /**
    * The name of the top-level property as defined in a property definition
    * for the object. If the name is not a defined property in the schema, an
    * error will be given when attempting to update the schema.
    */
  var propertyName: js.UndefOr[String] = js.native
}

object Schema$DisplayedProperty {
  @scala.inline
  def apply(propertyName: String = null): Schema$DisplayedProperty = {
    val __obj = js.Dynamic.literal()
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DisplayedProperty]
  }
}

