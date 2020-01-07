package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListRepos.  The size is not set in the returned repositories.
  */
@js.native
trait Schema$ListReposResponse extends js.Object {
  /**
    * If non-empty, additional repositories exist within the project. These can
    * be retrieved by including this value in the next ListReposRequest&#39;s
    * page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The listed repos.
    */
  var repos: js.UndefOr[js.Array[Schema$Repo]] = js.native
}

object Schema$ListReposResponse {
  @scala.inline
  def apply(nextPageToken: String = null, repos: js.Array[Schema$Repo] = null): Schema$ListReposResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (repos != null) __obj.updateDynamic("repos")(repos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListReposResponse]
  }
}

