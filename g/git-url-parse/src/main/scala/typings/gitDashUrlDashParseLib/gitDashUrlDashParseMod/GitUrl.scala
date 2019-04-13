package typings
package gitDashUrlDashParseLib.gitDashUrlDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitUrl extends js.Object {
  /** A filepath relative to the repository root. */
  var filepath: java.lang.String = js.native
  /** The type of filepath in the url ("blob" or "tree"). */
  var filepathtype: java.lang.String = js.native
  /** The owner and name values in the `owner/name` format. */
  var full_name: java.lang.String = js.native
  /** Whether to add the `.git` suffix or not. */
  var git_suffix: js.UndefOr[scala.Boolean] = js.native
  var hash: java.lang.String = js.native
  var href: java.lang.String = js.native
  /** The repository name. */
  var name: java.lang.String = js.native
  /** The organization the owner belongs to. This is CloudForge specific. */
  var organization: java.lang.String = js.native
  /** The repository owner. */
  var owner: java.lang.String = js.native
  var pathname: java.lang.String = js.native
  var port: scala.Double | scala.Null = js.native
  var protocol: java.lang.String = js.native
  /** An array with the url protocols (usually it has one element). */
  var protocols: js.Array[java.lang.String] = js.native
  /** The repository ref (e.g., "master" or "dev"). */
  var ref: java.lang.String = js.native
  /** The url domain (including subdomains). */
  var resource: java.lang.String = js.native
  var search: java.lang.String = js.native
  /** The Git provider (e.g. `"github.com"`). */
  var source: java.lang.String = js.native
  /** The oauth token (could appear in the https urls). */
  var token: java.lang.String = js.native
  /** The authentication user (usually for ssh urls). */
  var user: java.lang.String = js.native
  def toString(`type`: java.lang.String): java.lang.String = js.native
}

