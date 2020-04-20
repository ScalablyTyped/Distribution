package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonIsDraft
import typings.gapiClientBlogger.AnonMaxResults
import typings.gapiClientBlogger.AnonPageId
import typings.gapiClientBlogger.AnonPrettyPrint
import typings.gapiClientBlogger.AnonPublish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: AnonPageId): Request_[Unit]
  /** Gets one blog page by ID. */
  def get(request: AnonPrettyPrint): Request_[Page]
  /** Add a page. */
  def insert(request: AnonIsDraft): Request_[Page]
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: AnonMaxResults): Request_[PageList]
  /** Update a page. This method supports patch semantics. */
  def patch(request: AnonPublish): Request_[Page]
  /** Publishes a draft page. */
  def publish(request: AnonPageId): Request_[Page]
  /** Revert a published or scheduled page to draft state. */
  def revert(request: AnonPageId): Request_[Page]
  /** Update a page. */
  def update(request: AnonPublish): Request_[Page]
}

object PagesResource {
  @scala.inline
  def apply(
    delete: AnonPageId => Request_[Unit],
    get: AnonPrettyPrint => Request_[Page],
    insert: AnonIsDraft => Request_[Page],
    list: AnonMaxResults => Request_[PageList],
    patch: AnonPublish => Request_[Page],
    publish: AnonPageId => Request_[Page],
    revert: AnonPageId => Request_[Page],
    update: AnonPublish => Request_[Page]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PagesResource]
  }
}

