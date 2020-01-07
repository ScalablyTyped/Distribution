package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the contents of the original request that was passed to the
  * `[Streaming]DetectIntent` call.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest extends js.Object {
  /**
    * Optional. This field is set to the value of the `QueryParameters.payload`
    * field passed in the request. Some integrations that query a Dialogflow
    * agent may provide additional information in the payload.  In particular
    * for the Telephony Gateway this field has the form: &lt;pre&gt;{
    * &quot;telephony&quot;: {    &quot;caller_id&quot;:
    * &quot;+18558363987&quot;  } }&lt;/pre&gt; Note: The caller ID field
    * (`caller_id`) will be redacted for Standard Edition agents and populated
    * with the caller ID in [E.164 format](https://en.wikipedia.org/wiki/E.164)
    * for Enterprise Edition agents.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The source of this request, e.g., `google`, `facebook`, `slack`. It is
    * set by Dialogflow-owned servers.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Optional. The version of the protocol used for this request. This field
    * is AoG-specific.
    */
  var version: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest {
  @scala.inline
  def apply(payload: StringDictionary[js.Any] = null, source: String = null, version: String = null): Schema$GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest]
  }
}

