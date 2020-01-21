package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonAltBlogId
import typings.gapiClientBlogger.AnonAltFetchUserInfo
import typings.gapiClientBlogger.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogsResource extends js.Object {
  /** Gets one blog by ID. */
  def get(request: AnonAltBlogId): Request_[Blog]
  /** Retrieve a Blog by URL. */
  def getByUrl(request: AnonAltFields): Request_[Blog]
  /** Retrieves a list of blogs, possibly filtered. */
  def listByUser(request: AnonAltFetchUserInfo): Request_[BlogList]
}

object BlogsResource {
  @scala.inline
  def apply(
    get: AnonAltBlogId => Request_[Blog],
    getByUrl: AnonAltFields => Request_[Blog],
    listByUser: AnonAltFetchUserInfo => Request_[BlogList]
  ): BlogsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByUrl = js.Any.fromFunction1(getByUrl), listByUser = js.Any.fromFunction1(listByUser))
  
    __obj.asInstanceOf[BlogsResource]
  }
}

