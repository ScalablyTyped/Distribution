package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesResource extends js.Object {
  /** Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted. */
  def delete(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes
    * the structure of this table.
    */
  def get(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Table]
  /** Creates a new, empty table in the dataset. */
  def insert(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetId): gapiDotClientLib.gapiNs.clientNs.Request[Table]
  /** Lists all tables in the specified dataset. Requires the READER dataset role. */
  def list(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[TableList]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource. This method supports patch semantics.
    */
  def patch(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Table]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource.
    */
  def update(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Table]
}

