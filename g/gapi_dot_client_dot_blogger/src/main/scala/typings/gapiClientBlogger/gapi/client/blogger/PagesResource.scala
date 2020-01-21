package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonAltBlogIdFetchBodies
import typings.gapiClientBlogger.AnonAltBlogIdFieldsIsDraft
import typings.gapiClientBlogger.AnonAltBlogIdFieldsKey
import typings.gapiClientBlogger.AnonAltBlogIdFieldsKeyOauthtoken
import typings.gapiClientBlogger.AnonAltBlogIdFieldsKeyOauthtokenPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: AnonAltBlogIdFieldsKey): Request_[Unit]
  /** Gets one blog page by ID. */
  def get(request: AnonAltBlogIdFieldsKeyOauthtoken): Request_[Page]
  /** Add a page. */
  def insert(request: AnonAltBlogIdFieldsIsDraft): Request_[Page]
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: AnonAltBlogIdFetchBodies): Request_[PageList]
  /** Update a page. This method supports patch semantics. */
  def patch(request: AnonAltBlogIdFieldsKeyOauthtokenPageId): Request_[Page]
  /** Publishes a draft page. */
  def publish(request: AnonAltBlogIdFieldsKey): Request_[Page]
  /** Revert a published or scheduled page to draft state. */
  def revert(request: AnonAltBlogIdFieldsKey): Request_[Page]
  /** Update a page. */
  def update(request: AnonAltBlogIdFieldsKeyOauthtokenPageId): Request_[Page]
}

object PagesResource {
  @scala.inline
  def apply(
    delete: AnonAltBlogIdFieldsKey => Request_[Unit],
    get: AnonAltBlogIdFieldsKeyOauthtoken => Request_[Page],
    insert: AnonAltBlogIdFieldsIsDraft => Request_[Page],
    list: AnonAltBlogIdFetchBodies => Request_[PageList],
    patch: AnonAltBlogIdFieldsKeyOauthtokenPageId => Request_[Page],
    publish: AnonAltBlogIdFieldsKey => Request_[Page],
    revert: AnonAltBlogIdFieldsKey => Request_[Page],
    update: AnonAltBlogIdFieldsKeyOauthtokenPageId => Request_[Page]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PagesResource]
  }
}

