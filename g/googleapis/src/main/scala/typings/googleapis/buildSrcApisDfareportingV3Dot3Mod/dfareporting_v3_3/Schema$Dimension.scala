package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a dimension.
  */
@js.native
trait Schema$Dimension extends js.Object {
  /**
    * The kind of resource this is, in this case dfareporting#dimension.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The dimension name, e.g. dfa:advertiser
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Dimension {
  @scala.inline
  def apply(kind: String = null, name: String = null): Schema$Dimension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Dimension]
  }
}

