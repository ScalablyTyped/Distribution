package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a metadata column.
  */
@js.native
trait Schema$Column extends js.Object {
  /**
    * Map of attribute name and value for this column.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Column id.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics column.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Column {
  @scala.inline
  def apply(attributes: StringDictionary[String] = null, id: String = null, kind: String = null): Schema$Column = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Column]
  }
}

