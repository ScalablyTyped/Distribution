package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Creates a Cloud SQL instance as a clone of the source instance. The API is not ready for Second Generation instances yet. */
  def clone(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Deletes a Cloud SQL instance. */
  def delete(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Exports data from a Cloud SQL instance to a Google Cloud Storage bucket as a MySQL dump file. */
  def export(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Failover the instance to its failover replica instance. */
  def failover(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a resource containing information about a Cloud SQL instance. */
  def get(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DatabaseInstance]
  /** Imports data into a Cloud SQL instance from a MySQL dump file in Google Cloud Storage. */
  def `import`(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Creates a new Cloud SQL instance. */
  def insert(request: gapiDotClientDotSqladminLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists instances under a given project in the alphabetical order of the instance name. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[InstancesListResponse]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.. This method supports patch semantics.
    */
  def patch(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Promotes the read replica instance to be a stand-alone Cloud SQL instance. */
  def promoteReplica(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Deletes all client certificates and generates a new server SSL certificate for the instance. The changes will not take effect until the instance is
    * restarted. Existing instances without a server certificate will need to call this once to set a server certificate.
    */
  def resetSslConfig(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Restarts a Cloud SQL instance. */
  def restart(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Restores a backup of a Cloud SQL instance. */
  def restoreBackup(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Starts the replication in the read replica instance. */
  def startReplica(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Stops the replication in the read replica instance. */
  def stopReplica(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Truncate MySQL general and slow query log tables */
  def truncateLog(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.
    */
  def update(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    clone: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    export: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    failover: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DatabaseInstance]
    ],
    `import`: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    insert: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[InstancesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    promoteReplica: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    resetSslConfig: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    restart: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    restoreBackup: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    startReplica: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    stopReplica: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    truncateLog: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    update: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(clone = clone, delete = delete, export = export, failover = failover, get = get, insert = insert, list = list, patch = patch, promoteReplica = promoteReplica, resetSslConfig = resetSslConfig, restart = restart, restoreBackup = restoreBackup, startReplica = startReplica, stopReplica = stopReplica, truncateLog = truncateLog, update = update)
    __obj.updateDynamic("import")(`import`)
    __obj.asInstanceOf[InstancesResource]
  }
}

