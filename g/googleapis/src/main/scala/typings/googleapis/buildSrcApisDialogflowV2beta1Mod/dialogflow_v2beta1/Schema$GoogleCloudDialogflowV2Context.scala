package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a context.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2Context extends js.Object {
  /**
    * Optional. The number of conversational query requests after which the
    * context expires. If set to `0` (the default) the context expires
    * immediately. Contexts expire automatically after 20 minutes if there are
    * no matching queries.
    */
  var lifespanCount: js.UndefOr[Double] = js.native
  /**
    * Required. The unique identifier of the context. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session
    * ID&gt;/contexts/&lt;Context ID&gt;`.  The `Context ID` is always
    * converted to lowercase, may only contain characters in [a-zA-Z0-9_-%] and
    * may be at most 250 bytes long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of parameters associated with this context.
    * Refer to [this
    * doc](https://cloud.google.com/dialogflow-enterprise/docs/intents-actions-parameters)
    * for syntax.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$GoogleCloudDialogflowV2Context {
  @scala.inline
  def apply(
    lifespanCount: Int | Double = null,
    name: String = null,
    parameters: StringDictionary[js.Any] = null
  ): Schema$GoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    if (lifespanCount != null) __obj.updateDynamic("lifespanCount")(lifespanCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2Context]
  }
}

