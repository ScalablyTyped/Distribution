package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Display Fields for Search Results
  */
@js.native
trait Schema$ResultDisplayField extends js.Object {
  /**
    * The display label for the property.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The operator name of the property.
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * The name value pair for the property.
    */
  var property: js.UndefOr[Schema$NamedProperty] = js.native
}

object Schema$ResultDisplayField {
  @scala.inline
  def apply(label: String = null, operatorName: String = null, property: Schema$NamedProperty = null): Schema$ResultDisplayField = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResultDisplayField]
  }
}

