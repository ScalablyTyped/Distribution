package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: gapiDotClientDotBloggerLib.Anon_AltBlogId): gapiDotClientLib.gapiNs.clientNs.Request[Blog]
  /** Retrieve a Blog by URL. */
  def getByUrl(request: gapiDotClientDotBloggerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Blog]
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: gapiDotClientDotBloggerLib.Anon_AltFetchUserInfo): gapiDotClientLib.gapiNs.clientNs.Request[BlogList]
}

object BlogsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotBloggerLib.Anon_AltBlogId => gapiDotClientLib.gapiNs.clientNs.Request[Blog],
    getByUrl: gapiDotClientDotBloggerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Blog],
    listByUser: gapiDotClientDotBloggerLib.Anon_AltFetchUserInfo => gapiDotClientLib.gapiNs.clientNs.Request[BlogList]
  ): BlogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByUrl = js.Any.fromFunction1(getByUrl), listByUser = js.Any.fromFunction1(listByUser))
  
    __obj.asInstanceOf[BlogsResource]
  }
}

