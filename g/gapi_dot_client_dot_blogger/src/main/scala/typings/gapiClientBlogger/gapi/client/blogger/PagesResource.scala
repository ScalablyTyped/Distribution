package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBlogger.anon.IsDraft
import typings.gapiClientBlogger.anon.MaxResults
import typings.gapiClientBlogger.anon.PageId
import typings.gapiClientBlogger.anon.PrettyPrint
import typings.gapiClientBlogger.anon.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: PageId): Request[Unit]
  /** Gets one blog page by ID. */
  def get(request: PrettyPrint): Request[Page]
  /** Add a page. */
  def insert(request: IsDraft): Request[Page]
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: MaxResults): Request[PageList]
  /** Update a page. This method supports patch semantics. */
  def patch(request: Publish): Request[Page]
  /** Publishes a draft page. */
  def publish(request: PageId): Request[Page]
  /** Revert a published or scheduled page to draft state. */
  def revert(request: PageId): Request[Page]
  /** Update a page. */
  def update(request: Publish): Request[Page]
}

object PagesResource {
  @scala.inline
  def apply(
    delete: PageId => Request[Unit],
    get: PrettyPrint => Request[Page],
    insert: IsDraft => Request[Page],
    list: MaxResults => Request[PageList],
    patch: Publish => Request[Page],
    publish: PageId => Request[Page],
    revert: PageId => Request[Page],
    update: Publish => Request[Page]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PagesResource]
  }
}

