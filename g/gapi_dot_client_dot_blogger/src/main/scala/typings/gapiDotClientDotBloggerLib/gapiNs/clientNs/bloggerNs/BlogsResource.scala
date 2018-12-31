package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: gapiDotClientDotBloggerLib.Anon_PrettyPrintMaxPostsQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Blog]
  /** Retrieve a Blog by URL. */
  def getByUrl(request: gapiDotClientDotBloggerLib.Anon_UrlPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Blog]
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: gapiDotClientDotBloggerLib.Anon_Role): gapiDotClientLib.gapiNs.clientNs.Request[BlogList]
}

