package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the properties and count of a groupBy request.
  */
@js.native
trait Schema$GroupResult extends js.Object {
  /**
    * Total count of resources for the given properties.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Properties matching the groupBy fields in the request.
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$GroupResult {
  @scala.inline
  def apply(count: String = null, properties: StringDictionary[js.Any] = null): Schema$GroupResult = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupResult]
  }
}

