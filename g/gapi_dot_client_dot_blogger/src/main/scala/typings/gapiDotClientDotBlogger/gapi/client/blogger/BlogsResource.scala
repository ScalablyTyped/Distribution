package typings.gapiDotClientDotBlogger.gapi.client.blogger

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBlogger.Anon_AltBlogId
import typings.gapiDotClientDotBlogger.Anon_AltFetchUserInfo
import typings.gapiDotClientDotBlogger.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: Anon_AltBlogId): Request[Blog]
  /** Retrieve a Blog by URL. */
  def getByUrl(request: Anon_AltFields): Request[Blog]
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: Anon_AltFetchUserInfo): Request[BlogList]
}

object BlogsResource {
  @scala.inline
  def apply(
    get: Anon_AltBlogId => Request[Blog],
    getByUrl: Anon_AltFields => Request[Blog],
    listByUser: Anon_AltFetchUserInfo => Request[BlogList]
  ): BlogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByUrl = js.Any.fromFunction1(getByUrl), listByUser = js.Any.fromFunction1(listByUser))
  
    __obj.asInstanceOf[BlogsResource]
  }
}

