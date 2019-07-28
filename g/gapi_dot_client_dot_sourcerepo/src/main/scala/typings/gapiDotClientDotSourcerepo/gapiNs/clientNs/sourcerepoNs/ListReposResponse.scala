package typings.gapiDotClientDotSourcerepo.gapiNs.clientNs.sourcerepoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReposResponse extends js.Object {
  /**
    * If non-empty, additional repositories exist within the project. These
    * can be retrieved by including this value in the next ListReposRequest's
    * page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The listed repos. */
  var repos: js.UndefOr[js.Array[Repo]] = js.undefined
}

object ListReposResponse {
  @scala.inline
  def apply(nextPageToken: String = null, repos: js.Array[Repo] = null): ListReposResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (repos != null) __obj.updateDynamic("repos")(repos)
    __obj.asInstanceOf[ListReposResponse]
  }
}

