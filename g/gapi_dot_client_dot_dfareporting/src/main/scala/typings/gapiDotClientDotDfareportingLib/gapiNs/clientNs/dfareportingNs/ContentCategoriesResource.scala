package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContentCategoriesResource extends js.Object {
  /** Deletes an existing content category. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one content category by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ContentCategory]
  /** Inserts a new content category. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[ContentCategory]
  /** Retrieves a list of content categories, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdSortFieldMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ContentCategoriesListResponse]
  /** Updates an existing content category. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ContentCategory]
  /** Updates an existing content category. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[ContentCategory]
}

