package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document resource.  Note: resource
  * `projects.agent.knowledgeBases.documents` is deprecated, please use
  * `projects.knowledgeBases.documents` instead.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1Document extends js.Object {
  /**
    * The raw content of the document. This field is only permitted for
    * EXTRACTIVE_QA and FAQ knowledge types. Note: This field is in the process
    * of being deprecated, please use raw_content instead.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The URI where the file content is located.  For documents stored in
    * Google Cloud Storage, these URIs must have the form
    * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.  NOTE: External URLs must
    * correspond to public webpages, i.e., they must be indexed by Google
    * Search. In particular, URLs for showing documents in Google Cloud Storage
    * (i.e. the URL in your browser) are not supported. Instead use the `gs://`
    * format URI described above.
    */
  var contentUri: js.UndefOr[String] = js.native
  /**
    * Required. The display name of the document. The name must be 1024 bytes
    * or less; otherwise, the creation request fails.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Required. The knowledge type of document content.
    */
  var knowledgeTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The MIME type of this document.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The document resource name. The name must be empty when creating a
    * document. Format: `projects/&lt;Project
    * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document
    * ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The raw content of the document. This field is only permitted for
    * EXTRACTIVE_QA and FAQ knowledge types.
    */
  var rawContent: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1Document {
  @scala.inline
  def apply(
    content: String = null,
    contentUri: String = null,
    displayName: String = null,
    knowledgeTypes: js.Array[String] = null,
    mimeType: String = null,
    name: String = null,
    rawContent: String = null
  ): Schema$GoogleCloudDialogflowV2beta1Document = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentUri != null) __obj.updateDynamic("contentUri")(contentUri.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (knowledgeTypes != null) __obj.updateDynamic("knowledgeTypes")(knowledgeTypes.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rawContent != null) __obj.updateDynamic("rawContent")(rawContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1Document]
  }
}

