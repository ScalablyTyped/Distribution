package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location information about a resource.
  */
@js.native
trait Schema$ResourceLocation extends js.Object {
  /**
    * The locations of a resource after the execution of the operation.
    * Requests to create or delete a location based resource must populate the
    * &#39;current_locations&#39; field and not the
    * &#39;original_locations&#39; field. For example:
    * &quot;europe-west1-a&quot;     &quot;us-east1&quot;     &quot;nam3&quot;
    */
  var currentLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The locations of a resource prior to the execution of the operation.
    * Requests that mutate the resource&#39;s location must populate both the
    * &#39;original_locations&#39; as well as the &#39;current_locations&#39;
    * fields. For example:      &quot;europe-west1-a&quot; &quot;us-east1&quot;
    * &quot;nam3&quot;
    */
  var originalLocations: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ResourceLocation {
  @scala.inline
  def apply(currentLocations: js.Array[String] = null, originalLocations: js.Array[String] = null): Schema$ResourceLocation = {
    val __obj = js.Dynamic.literal()
    if (currentLocations != null) __obj.updateDynamic("currentLocations")(currentLocations.asInstanceOf[js.Any])
    if (originalLocations != null) __obj.updateDynamic("originalLocations")(originalLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceLocation]
  }
}

