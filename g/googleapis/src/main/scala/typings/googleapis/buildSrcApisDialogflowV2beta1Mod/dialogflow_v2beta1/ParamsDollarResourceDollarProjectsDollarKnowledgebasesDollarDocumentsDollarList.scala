package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The maximum number of items to return in a single page. By
    * default 10 and at most 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. The next_page_token value returned from a previous list
    * request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The knowledge base to list all documents for. Format:
    * `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    */
  var parent: js.UndefOr[String] = js.native
}

