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
    delete: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Page]
    ],
    insert: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsIsDraft, 
      gapiDotClientLib.gapiNs.clientNs.Request[Page]
    ],
    list: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFetchBodies, 
      gapiDotClientLib.gapiNs.clientNs.Request[PageList]
    ],
    patch: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPageId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Page]
    ],
    publish: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Page]
    ],
    revert: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Page]
    ],
    update: js.Function1[
      gapiDotClientDotBloggerLib.Anon_AltBlogIdFieldsKeyOauthtokenPageId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Page]
    ]
  ): PagesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, publish = publish, revert = revert, update = update)
  
    __obj.asInstanceOf[PagesResource]
  }
}

