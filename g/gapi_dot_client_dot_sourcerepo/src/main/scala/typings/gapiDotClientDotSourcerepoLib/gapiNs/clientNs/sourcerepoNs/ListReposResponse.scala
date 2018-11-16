package typings
package gapiDotClientDotSourcerepoLib.gapiNs.clientNs.sourcerepoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListReposResponse extends js.Object {
  /**
               * If non-empty, additional repositories exist within the project. These
               * can be retrieved by including this value in the next ListReposRequest's
               * page_token field.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The listed repos. */
  var repos: js.UndefOr[js.Array[Repo]] = js.undefined
}

