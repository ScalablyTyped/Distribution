package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonBlogId
import typings.gapiClientBlogger.AnonFetchUserInfo
import typings.gapiClientBlogger.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: AnonBlogId): Request_[Blog]
  /** Retrieve a Blog by URL. */
  def getByUrl(request: AnonFields): Request_[Blog]
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: AnonFetchUserInfo): Request_[BlogList]
}

object BlogsResource {
  @scala.inline
  def apply(
    get: AnonBlogId => Request_[Blog],
    getByUrl: AnonFields => Request_[Blog],
    listByUser: AnonFetchUserInfo => Request_[BlogList]
  ): BlogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByUrl = js.Any.fromFunction1(getByUrl), listByUser = js.Any.fromFunction1(listByUser))
  
    __obj.asInstanceOf[BlogsResource]
  }
}

