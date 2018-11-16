package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrintCreativeFieldIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one creative field value by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrintCreativeFieldIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Inserts a new creative field value. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrintCreativeFieldId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(
    request: gapiDotClientDotDfareportingLib.Anon_ProfileIdSortFieldMaxResultsPrettyPrintCreativeFieldId
  ): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValuesListResponse]
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrintCreativeFieldIdQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Updates an existing creative field value. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrintCreativeFieldId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
}

