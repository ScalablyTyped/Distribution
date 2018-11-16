package typings
package gapiDotClientDotBloggerLib.gapiNs.clientNs.bloggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PagesResource extends js.Object {
  /** Delete a page by ID. */
  def delete(request: gapiDotClientDotBloggerLib.Anon_PrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one blog page by ID. */
  def get(request: gapiDotClientDotBloggerLib.Anon_PrettyPrintQuotaUserKeyPageIdUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Add a page. */
  def insert(request: gapiDotClientDotBloggerLib.Anon_PrettyPrintIsDraftQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Retrieves the pages for a blog, optionally including non-LIVE statuses. */
  def list(request: gapiDotClientDotBloggerLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[PageList]
  /** Update a page. This method supports patch semantics. */
  def patch(request: gapiDotClientDotBloggerLib.Anon_PrettyPrintQuotaUserKeyPublish): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Publishes a draft page. */
  def publish(request: gapiDotClientDotBloggerLib.Anon_PrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Revert a published or scheduled page to draft state. */
  def revert(request: gapiDotClientDotBloggerLib.Anon_PrettyPrintQuotaUserKeyPageId): gapiDotClientLib.gapiNs.clientNs.Request[Page]
  /** Update a page. */
  def update(request: gapiDotClientDotBloggerLib.Anon_PrettyPrintQuotaUserKeyPublish): gapiDotClientLib.gapiNs.clientNs.Request[Page]
}

