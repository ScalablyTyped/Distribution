package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one blog page by ID. */
  def get(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Add a page. */
  def insert(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsIsDraft): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodies): gapiDotClientLib.gapiNs.clientNs.Request[PageList]
  /** Update a page. This method supports patch semantics. */
  def patch(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPageId): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Publishes a draft page. */
  def publish(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Revert a published or scheduled page to draft state. */
  def revert(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Update a page. */
  def update(request: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPageId): gapiDotClientLib.gapiNs.clientNs.Request[Page]
}

object PagesResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Page],
    insert: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsIsDraft => gapiDotClientLib.gapiNs.clientNs.Request[Page],
    list: gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodies => gapiDotClientLib.gapiNs.clientNs.Request[PageList],
    patch: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPageId => gapiDotClientLib.gapiNs.clientNs.Request[Page],
    publish: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Page],
    revert: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Page],
    update: gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPageId => gapiDotClientLib.gapiNs.clientNs.Request[Page]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), publish = js.Any.fromFunction1(publish), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PagesResource]
  }
}

