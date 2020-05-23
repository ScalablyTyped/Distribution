package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.BlogId
import typings.gapiClientBlogger.anon.FetchUserInfo
import typings.gapiClientBlogger.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: BlogId): Request[Blog]
  /** Retrieve a Blog by URL. */
  def getByUrl(request: Fields): Request[Blog]
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: FetchUserInfo): Request[BlogList]
}

object BlogsResource {
  @scala.inline
  def apply(
    get: BlogId => Request[Blog],
    getByUrl: Fields => Request[Blog],
    listByUser: FetchUserInfo => Request[BlogList]
  ): BlogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByUrl = js.Any.fromFunction1(getByUrl), listByUser = js.Any.fromFunction1(listByUser))
    __obj.asInstanceOf[BlogsResource]
  }
}

