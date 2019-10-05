package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSqladmin.Anon_AltFields
import typings.gapiDotClientDotSqladmin.Anon_AltFieldsFilter
import typings.gapiDotClientDotSqladmin.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Creates a Cloud SQL instance as a clone of the source instance. The API is not ready for Second Generation instances yet. */
  def clone(request: Anon_AltFields): Request[Operation]
  /** Deletes a Cloud SQL instance. */
  def delete(request: Anon_AltFields): Request[Operation]
  /** Exports data from a Cloud SQL instance to a Google Cloud Storage bucket as a MySQL dump file. */
  def export(request: Anon_AltFields): Request[Operation]
  /** Failover the instance to its failover replica instance. */
  def failover(request: Anon_AltFields): Request[Operation]
  /** Retrieves a resource containing information about a Cloud SQL instance. */
  def get(request: Anon_AltFields): Request[DatabaseInstance]
  /** Imports data into a Cloud SQL instance from a MySQL dump file in Google Cloud Storage. */
  def `import`(request: Anon_AltFields): Request[Operation]
  /** Creates a new Cloud SQL instance. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Lists instances under a given project in the alphabetical order of the instance name. */
  def list(request: Anon_AltFieldsFilter): Request[InstancesListResponse]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.. This method supports patch semantics.
    */
  def patch(request: Anon_AltFields): Request[Operation]
  /** Promotes the read replica instance to be a stand-alone Cloud SQL instance. */
  def promoteReplica(request: Anon_AltFields): Request[Operation]
  /**
    * Deletes all client certificates and generates a new server SSL certificate for the instance. The changes will not take effect until the instance is
    * restarted. Existing instances without a server certificate will need to call this once to set a server certificate.
    */
  def resetSslConfig(request: Anon_AltFields): Request[Operation]
  /** Restarts a Cloud SQL instance. */
  def restart(request: Anon_AltFields): Request[Operation]
  /** Restores a backup of a Cloud SQL instance. */
  def restoreBackup(request: Anon_AltFields): Request[Operation]
  /** Starts the replication in the read replica instance. */
  def startReplica(request: Anon_AltFields): Request[Operation]
  /** Stops the replication in the read replica instance. */
  def stopReplica(request: Anon_AltFields): Request[Operation]
  /** Truncate MySQL general and slow query log tables */
  def truncateLog(request: Anon_AltFields): Request[Operation]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.
    */
  def update(request: Anon_AltFields): Request[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    clone: Anon_AltFields => Request[Operation],
    delete: Anon_AltFields => Request[Operation],
    export: Anon_AltFields => Request[Operation],
    failover: Anon_AltFields => Request[Operation],
    get: Anon_AltFields => Request[DatabaseInstance],
    `import`: Anon_AltFields => Request[Operation],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[InstancesListResponse],
    patch: Anon_AltFields => Request[Operation],
    promoteReplica: Anon_AltFields => Request[Operation],
    resetSslConfig: Anon_AltFields => Request[Operation],
    restart: Anon_AltFields => Request[Operation],
    restoreBackup: Anon_AltFields => Request[Operation],
    startReplica: Anon_AltFields => Request[Operation],
    stopReplica: Anon_AltFields => Request[Operation],
    truncateLog: Anon_AltFields => Request[Operation],
    update: Anon_AltFields => Request[Operation]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), failover = js.Any.fromFunction1(failover), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), promoteReplica = js.Any.fromFunction1(promoteReplica), resetSslConfig = js.Any.fromFunction1(resetSslConfig), restart = js.Any.fromFunction1(restart), restoreBackup = js.Any.fromFunction1(restoreBackup), startReplica = js.Any.fromFunction1(startReplica), stopReplica = js.Any.fromFunction1(stopReplica), truncateLog = js.Any.fromFunction1(truncateLog), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[InstancesResource]
  }
}

