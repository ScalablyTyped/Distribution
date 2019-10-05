package typings.gapiDotClientDotBlogger.gapi.client.blogger

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFetchBodies
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFieldsIsDraft
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFieldsKey
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFieldsKeyOauthtoken
import typings.gapiDotClientDotBlogger.Anon_AltBlogIdFieldsKeyOauthtokenPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: Anon_AltBlogIdFieldsKey): Request[Unit]
  /** Gets one blog page by ID. */
  def get(request: Anon_AltBlogIdFieldsKeyOauthtoken): Request[Page]
  /** Add a page. */
  def insert(request: Anon_AltBlogIdFieldsIsDraft): Request[Page]
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: Anon_AltBlogIdFetchBodies): Request[PageList]
  /** Update a page. This method supports patch semantics. */
  def patch(request: Anon_AltBlogIdFieldsKeyOauthtokenPageId): Request[Page]
  /** Publishes a draft page. */
  def publish(request: Anon_AltBlogIdFieldsKey): Request[Page]
  /** Revert a published or scheduled page to draft state. */
  def revert(request: Anon_AltBlogIdFieldsKey): Request[Page]
  /** Update a page. */
  def update(request: Anon_AltBlogIdFieldsKeyOauthtokenPageId): Request[Page]
}

object PagesResource {
  @scala.inline
  def apply(
    delete: Anon_AltBlogIdFieldsKey => Request[Unit],
    get: Anon_AltBlogIdFieldsKeyOauthtoken => Request[Page],
    insert: Anon_AltBlogIdFieldsIsDraft => Request[Page],
    list: Anon_AltBlogIdFetchBodies => Request[PageList],
    patch: Anon_AltBlogIdFieldsKeyOauthtokenPageId => Request[Page],
    publish: Anon_AltBlogIdFieldsKey => Request[Page],
    revert: Anon_AltBlogIdFieldsKey => Request[Page],
    update: Anon_AltBlogIdFieldsKeyOauthtokenPageId => Request[Page]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PagesResource]
  }
}

