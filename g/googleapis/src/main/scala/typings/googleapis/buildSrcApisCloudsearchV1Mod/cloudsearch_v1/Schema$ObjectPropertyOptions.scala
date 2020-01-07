package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for object properties.
  */
@js.native
trait Schema$ObjectPropertyOptions extends js.Object {
  /**
    * The properties of the sub-object. These properties represent a nested
    * object. For example, if this property represents a postal address, the
    * subobjectProperties might be named *street*, *city*, and *state*. The
    * maximum number of elements is 1000.
    */
  var subobjectProperties: js.UndefOr[js.Array[Schema$PropertyDefinition]] = js.native
}

object Schema$ObjectPropertyOptions {
  @scala.inline
  def apply(subobjectProperties: js.Array[Schema$PropertyDefinition] = null): Schema$ObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (subobjectProperties != null) __obj.updateDynamic("subobjectProperties")(subobjectProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ObjectPropertyOptions]
  }
}

