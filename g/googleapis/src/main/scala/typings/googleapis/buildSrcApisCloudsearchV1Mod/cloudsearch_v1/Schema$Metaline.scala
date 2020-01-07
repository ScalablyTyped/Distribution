package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metaline is a list of properties that are displayed along with the search
  * result to provide context.
  */
@js.native
trait Schema$Metaline extends js.Object {
  /**
    * The list of displayed properties for the metaline.
    */
  var properties: js.UndefOr[js.Array[Schema$DisplayedProperty]] = js.native
}

object Schema$Metaline {
  @scala.inline
  def apply(properties: js.Array[Schema$DisplayedProperty] = null): Schema$Metaline = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Metaline]
  }
}

