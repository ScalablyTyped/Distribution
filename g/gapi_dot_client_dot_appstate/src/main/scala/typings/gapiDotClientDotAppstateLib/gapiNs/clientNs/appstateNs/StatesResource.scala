package typings
package gapiDotClientDotAppstateLib.gapiNs.clientNs.appstateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatesResource extends js.Object {
  /**
    * Clears (sets to empty) the data for the passed key if and only if the passed version matches the currently stored version. This method results in a
    * conflict error on version mismatch.
    */
  def clear(request: gapiDotClientDotAppstateLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[WriteResult]
  /**
    * Deletes a key and the data associated with it. The key is removed and no longer counts against the key quota. Note that since this method is not safe
    * in the face of concurrent modifications, it should only be used for development and testing purposes. Invoking this method in shipping code can result
    * in data loss and data corruption.
    */
  def delete(request: gapiDotClientDotAppstateLib.Anon_PrettyPrintStateKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the data corresponding to the passed key. If the key does not exist on the server, an HTTP 404 will be returned. */
  def get(request: gapiDotClientDotAppstateLib.Anon_PrettyPrintStateKey): gapiDotClientLib.gapiNs.clientNs.Request[GetResponse]
  /** Lists all the states keys, and optionally the state data. */
  def list(request: gapiDotClientDotAppstateLib.Anon_PrettyPrintIncludeData): gapiDotClientLib.gapiNs.clientNs.Request[ListResponse]
  /**
    * Update the data associated with the input key if and only if the passed version matches the currently stored version. This method is safe in the face
    * of concurrent writes. Maximum per-key size is 128KB.
    */
  def update(request: gapiDotClientDotAppstateLib.Anon_PrettyPrintStateKeyQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[WriteResult]
}

