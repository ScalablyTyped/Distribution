package typings.googleapis.buildSrcApisCloudresourcemanagerV2beta1Mod.cloudresourcemanager_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for searching folders.
  */
@js.native
trait Schema$SearchFoldersRequest extends js.Object {
  /**
    * The maximum number of folders to return in the response. This field is
    * optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to `SearchFolders` that
    * indicates from where search should continue. This field is optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Search criteria used to select the Folders to return. If no search
    * criteria is specified then all accessible folders will be returned. Query
    * expressions can be used to restrict results based upon displayName,
    * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
    * can be used along with the suffix wildcard symbol `*`.  The displayName
    * field in a query expression should use escaped quotes for values that
    * include whitespace to prevent unexpected behavior.  Some example queries
    * are:  |Query | Description| |----- | -----------| |displayName=Test* |
    * Folders whose display name starts with &quot;Test&quot;.|
    * |lifecycleState=ACTIVE | Folders whose lifecycleState is ACTIVE.|
    * |parent=folders/123 | Folders whose parent is &quot;folders/123&quot;.|
    * |parent=folders/123 AND lifecycleState=ACTIVE | Active folders whose
    * parent is &quot;folders/123&quot;.| |displayName=\\&quot;Test
    * String\\&quot;|Folders whose display name includes both &quot;Test&quot;
    * and &quot;String&quot;.|
    */
  var query: js.UndefOr[String] = js.native
}

object Schema$SearchFoldersRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null, query: String = null): Schema$SearchFoldersRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchFoldersRequest]
  }
}

