package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exemplars are example points that may be used to annotate aggregated
  * distribution values. They are metadata that gives information about a
  * particular value added to a Distribution bucket, such as a trace ID that
  * was active when a value was added. They may contain further information,
  * such as a example values and timestamps, origin, etc.
  */
@js.native
trait Schema$Exemplar extends js.Object {
  /**
    * Contextual information about the example value. Examples are:Trace:
    * type.googleapis.com/google.monitoring.v3.SpanContextLiteral string:
    * type.googleapis.com/google.protobuf.StringValueLabels dropped during
    * aggregation:  type.googleapis.com/google.monitoring.v3.DroppedLabelsThere
    * may be only a single attachment of any given message type in a single
    * exemplar, and this is enforced by the system.
    */
  var attachments: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * The observation (sampling) time of the above value.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Value of the exemplar point. This value determines to which bucket the
    * exemplar belongs.
    */
  var value: js.UndefOr[Double] = js.native
}

object Schema$Exemplar {
  @scala.inline
  def apply(
    attachments: js.Array[StringDictionary[_]] = null,
    timestamp: String = null,
    value: Int | Double = null
  ): Schema$Exemplar = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Exemplar]
  }
}

