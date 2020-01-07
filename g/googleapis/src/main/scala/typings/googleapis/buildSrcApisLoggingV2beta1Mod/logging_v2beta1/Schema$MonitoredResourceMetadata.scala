package typings.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Auxiliary metadata for a MonitoredResource object. MonitoredResource
  * objects contain the minimum set of information to uniquely identify a
  * monitored resource instance. There is some other useful auxiliary metadata.
  * Monitoring and Logging use an ingestion pipeline to extract metadata for
  * cloud resources of all types, and store the metadata in this message.
  */
@js.native
trait Schema$MonitoredResourceMetadata extends js.Object {
  /**
    * Output only. Values for predefined system metadata labels. System labels
    * are a kind of metadata extracted by Google, including
    * &quot;machine_image&quot;, &quot;vpc&quot;, &quot;subnet_id&quot;,
    * &quot;security_group&quot;, &quot;name&quot;, etc. System label values
    * can be only strings, Boolean values, or a list of strings. For example: {
    * &quot;name&quot;: &quot;my-test-instance&quot;,
    * &quot;security_group&quot;: [&quot;a&quot;, &quot;b&quot;,
    * &quot;c&quot;],   &quot;spot_instance&quot;: false }
    */
  var systemLabels: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. A map of user-defined metadata labels.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$MonitoredResourceMetadata {
  @scala.inline
  def apply(systemLabels: StringDictionary[js.Any] = null, userLabels: StringDictionary[String] = null): Schema$MonitoredResourceMetadata = {
    val __obj = js.Dynamic.literal()
    if (systemLabels != null) __obj.updateDynamic("systemLabels")(systemLabels.asInstanceOf[js.Any])
    if (userLabels != null) __obj.updateDynamic("userLabels")(userLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MonitoredResourceMetadata]
  }
}

