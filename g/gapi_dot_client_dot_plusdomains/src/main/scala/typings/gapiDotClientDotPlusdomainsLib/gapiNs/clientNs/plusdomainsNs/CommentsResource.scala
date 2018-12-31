package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** Create a new comment in reply to an activity. */
  def insert(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Comment]
  /** List all of the comments for an activity. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[CommentFeed]
}

