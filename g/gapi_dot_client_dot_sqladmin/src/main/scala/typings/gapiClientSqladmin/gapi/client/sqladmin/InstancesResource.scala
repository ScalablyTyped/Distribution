package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonAltFields
import typings.gapiClientSqladmin.AnonAltFieldsFilter
import typings.gapiClientSqladmin.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Creates a Cloud SQL instance as a clone of the source instance. The API is not ready for Second Generation instances yet. */
  def clone(request: AnonAltFields): Request_[Operation]
  /** Deletes a Cloud SQL instance. */
  def delete(request: AnonAltFields): Request_[Operation]
  /** Exports data from a Cloud SQL instance to a Google Cloud Storage bucket as a MySQL dump file. */
  def export(request: AnonAltFields): Request_[Operation]
  /** Failover the instance to its failover replica instance. */
  def failover(request: AnonAltFields): Request_[Operation]
  /** Retrieves a resource containing information about a Cloud SQL instance. */
  def get(request: AnonAltFields): Request_[DatabaseInstance]
  /** Imports data into a Cloud SQL instance from a MySQL dump file in Google Cloud Storage. */
  def `import`(request: AnonAltFields): Request_[Operation]
  /** Creates a new Cloud SQL instance. */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Lists instances under a given project in the alphabetical order of the instance name. */
  def list(request: AnonAltFieldsFilter): Request_[InstancesListResponse]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.. This method supports patch semantics.
    */
  def patch(request: AnonAltFields): Request_[Operation]
  /** Promotes the read replica instance to be a stand-alone Cloud SQL instance. */
  def promoteReplica(request: AnonAltFields): Request_[Operation]
  /**
    * Deletes all client certificates and generates a new server SSL certificate for the instance. The changes will not take effect until the instance is
    * restarted. Existing instances without a server certificate will need to call this once to set a server certificate.
    */
  def resetSslConfig(request: AnonAltFields): Request_[Operation]
  /** Restarts a Cloud SQL instance. */
  def restart(request: AnonAltFields): Request_[Operation]
  /** Restores a backup of a Cloud SQL instance. */
  def restoreBackup(request: AnonAltFields): Request_[Operation]
  /** Starts the replication in the read replica instance. */
  def startReplica(request: AnonAltFields): Request_[Operation]
  /** Stops the replication in the read replica instance. */
  def stopReplica(request: AnonAltFields): Request_[Operation]
  /** Truncate MySQL general and slow query log tables */
  def truncateLog(request: AnonAltFields): Request_[Operation]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.
    */
  def update(request: AnonAltFields): Request_[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    clone: AnonAltFields => Request_[Operation],
    delete: AnonAltFields => Request_[Operation],
    export: AnonAltFields => Request_[Operation],
    failover: AnonAltFields => Request_[Operation],
    get: AnonAltFields => Request_[DatabaseInstance],
    `import`: AnonAltFields => Request_[Operation],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[InstancesListResponse],
    patch: AnonAltFields => Request_[Operation],
    promoteReplica: AnonAltFields => Request_[Operation],
    resetSslConfig: AnonAltFields => Request_[Operation],
    restart: AnonAltFields => Request_[Operation],
    restoreBackup: AnonAltFields => Request_[Operation],
    startReplica: AnonAltFields => Request_[Operation],
    stopReplica: AnonAltFields => Request_[Operation],
    truncateLog: AnonAltFields => Request_[Operation],
    update: AnonAltFields => Request_[Operation]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), failover = js.Any.fromFunction1(failover), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), promoteReplica = js.Any.fromFunction1(promoteReplica), resetSslConfig = js.Any.fromFunction1(resetSslConfig), restart = js.Any.fromFunction1(restart), restoreBackup = js.Any.fromFunction1(restoreBackup), startReplica = js.Any.fromFunction1(startReplica), stopReplica = js.Any.fromFunction1(stopReplica), truncateLog = js.Any.fromFunction1(truncateLog), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[InstancesResource]
  }
}

