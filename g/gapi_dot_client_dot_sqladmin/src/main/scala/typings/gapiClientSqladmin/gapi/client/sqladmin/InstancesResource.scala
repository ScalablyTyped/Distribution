package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Fields
import typings.gapiClientSqladmin.anon.Filter
import typings.gapiClientSqladmin.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Creates a Cloud SQL instance as a clone of the source instance. The API is not ready for Second Generation instances yet. */
  def clone(request: Fields): Request[Operation]
  /** Deletes a Cloud SQL instance. */
  def delete(request: Fields): Request[Operation]
  /** Exports data from a Cloud SQL instance to a Google Cloud Storage bucket as a MySQL dump file. */
  def export(request: Fields): Request[Operation]
  /** Failover the instance to its failover replica instance. */
  def failover(request: Fields): Request[Operation]
  /** Retrieves a resource containing information about a Cloud SQL instance. */
  def get(request: Fields): Request[DatabaseInstance]
  /** Imports data into a Cloud SQL instance from a MySQL dump file in Google Cloud Storage. */
  def `import`(request: Fields): Request[Operation]
  /** Creates a new Cloud SQL instance. */
  def insert(request: Key): Request[Operation]
  /** Lists instances under a given project in the alphabetical order of the instance name. */
  def list(request: Filter): Request[InstancesListResponse]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.. This method supports patch semantics.
    */
  def patch(request: Fields): Request[Operation]
  /** Promotes the read replica instance to be a stand-alone Cloud SQL instance. */
  def promoteReplica(request: Fields): Request[Operation]
  /**
    * Deletes all client certificates and generates a new server SSL certificate for the instance. The changes will not take effect until the instance is
    * restarted. Existing instances without a server certificate will need to call this once to set a server certificate.
    */
  def resetSslConfig(request: Fields): Request[Operation]
  /** Restarts a Cloud SQL instance. */
  def restart(request: Fields): Request[Operation]
  /** Restores a backup of a Cloud SQL instance. */
  def restoreBackup(request: Fields): Request[Operation]
  /** Starts the replication in the read replica instance. */
  def startReplica(request: Fields): Request[Operation]
  /** Stops the replication in the read replica instance. */
  def stopReplica(request: Fields): Request[Operation]
  /** Truncate MySQL general and slow query log tables */
  def truncateLog(request: Fields): Request[Operation]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.
    */
  def update(request: Fields): Request[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    clone: Fields => Request[Operation],
    delete: Fields => Request[Operation],
    export: Fields => Request[Operation],
    failover: Fields => Request[Operation],
    get: Fields => Request[DatabaseInstance],
    `import`: Fields => Request[Operation],
    insert: Key => Request[Operation],
    list: Filter => Request[InstancesListResponse],
    patch: Fields => Request[Operation],
    promoteReplica: Fields => Request[Operation],
    resetSslConfig: Fields => Request[Operation],
    restart: Fields => Request[Operation],
    restoreBackup: Fields => Request[Operation],
    startReplica: Fields => Request[Operation],
    stopReplica: Fields => Request[Operation],
    truncateLog: Fields => Request[Operation],
    update: Fields => Request[Operation]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), failover = js.Any.fromFunction1(failover), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), promoteReplica = js.Any.fromFunction1(promoteReplica), resetSslConfig = js.Any.fromFunction1(resetSslConfig), restart = js.Any.fromFunction1(restart), restoreBackup = js.Any.fromFunction1(restoreBackup), startReplica = js.Any.fromFunction1(startReplica), stopReplica = js.Any.fromFunction1(stopReplica), truncateLog = js.Any.fromFunction1(truncateLog), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[InstancesResource]
  }
}

