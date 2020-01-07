package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that represents Google Cloud Platform location.
  */
@js.native
trait Schema$Location extends js.Object {
  /**
    * The friendly name for this location, typically a nearby city name. For
    * example, &quot;Tokyo&quot;.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Cross-service attributes for the location. For example
    * {&quot;cloud.googleapis.com/region&quot;: &quot;us-east1&quot;}
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The canonical id for this location. For example: `&quot;us-east1&quot;`.
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Service-specific metadata. For example the available capacity at the
    * given location.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Resource name for the location, which may vary between implementations.
    * For example: `&quot;projects/example-project/locations/us-east1&quot;`
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Location {
  @scala.inline
  def apply(
    displayName: String = null,
    labels: StringDictionary[String] = null,
    locationId: String = null,
    metadata: StringDictionary[js.Any] = null,
    name: String = null
  ): Schema$Location = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Location]
  }
}

