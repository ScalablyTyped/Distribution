package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents knowledge base resource.  Note: resource
  * `projects.agent.knowledgeBases` is deprecated, please use
  * `projects.knowledgeBases` instead.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1KnowledgeBase extends js.Object {
  /**
    * Required. The display name of the knowledge base. The name must be 1024
    * bytes or less; otherwise, the creation request fails.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The knowledge base resource name. The name must be empty when creating a
    * knowledge base. Format: `projects/&lt;Project
    * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1KnowledgeBase {
  @scala.inline
  def apply(displayName: String = null, name: String = null): Schema$GoogleCloudDialogflowV2beta1KnowledgeBase = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  }
}

