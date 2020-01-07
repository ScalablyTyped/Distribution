package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structured data object consisting of named properties.
  */
@js.native
trait Schema$StructuredDataObject extends js.Object {
  /**
    * The properties for the object. The maximum number of elements is 1000.
    */
  var properties: js.UndefOr[js.Array[Schema$NamedProperty]] = js.native
}

object Schema$StructuredDataObject {
  @scala.inline
  def apply(properties: js.Array[Schema$NamedProperty] = null): Schema$StructuredDataObject = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StructuredDataObject]
  }
}

