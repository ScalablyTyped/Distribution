package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Fields
import typings.gapiClientSqladmin.anon.Filter
import typings.gapiClientSqladmin.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesResource extends js.Object {
  /** Creates a Cloud SQL instance as a clone of the source instance. The API is not ready for Second Generation instances yet. */
  def clone(request: Fields): Request[Operation] = js.native
  /** Deletes a Cloud SQL instance. */
  def delete(request: Fields): Request[Operation] = js.native
  /** Exports data from a Cloud SQL instance to a Google Cloud Storage bucket as a MySQL dump file. */
  def export(request: Fields): Request[Operation] = js.native
  /** Failover the instance to its failover replica instance. */
  def failover(request: Fields): Request[Operation] = js.native
  /** Retrieves a resource containing information about a Cloud SQL instance. */
  def get(request: Fields): Request[DatabaseInstance] = js.native
  /** Imports data into a Cloud SQL instance from a MySQL dump file in Google Cloud Storage. */
  def `import`(request: Fields): Request[Operation] = js.native
  /** Creates a new Cloud SQL instance. */
  def insert(request: Key): Request[Operation] = js.native
  /** Lists instances under a given project in the alphabetical order of the instance name. */
  def list(request: Filter): Request[InstancesListResponse] = js.native
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.. This method supports patch semantics.
    */
  def patch(request: Fields): Request[Operation] = js.native
  /** Promotes the read replica instance to be a stand-alone Cloud SQL instance. */
  def promoteReplica(request: Fields): Request[Operation] = js.native
  /**
    * Deletes all client certificates and generates a new server SSL certificate for the instance. The changes will not take effect until the instance is
    * restarted. Existing instances without a server certificate will need to call this once to set a server certificate.
    */
  def resetSslConfig(request: Fields): Request[Operation] = js.native
  /** Restarts a Cloud SQL instance. */
  def restart(request: Fields): Request[Operation] = js.native
  /** Restores a backup of a Cloud SQL instance. */
  def restoreBackup(request: Fields): Request[Operation] = js.native
  /** Starts the replication in the read replica instance. */
  def startReplica(request: Fields): Request[Operation] = js.native
  /** Stops the replication in the read replica instance. */
  def stopReplica(request: Fields): Request[Operation] = js.native
  /** Truncate MySQL general and slow query log tables */
  def truncateLog(request: Fields): Request[Operation] = js.native
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.
    */
  def update(request: Fields): Request[Operation] = js.native
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
  @scala.inline
  implicit class InstancesResourceOps[Self <: InstancesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: Fields => Request[Operation]): Self = this.set("clone", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setExport(value: Fields => Request[Operation]): Self = this.set("export", js.Any.fromFunction1(value))
    @scala.inline
    def setFailover(value: Fields => Request[Operation]): Self = this.set("failover", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[DatabaseInstance]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setImport(value: Fields => Request[Operation]): Self = this.set("import", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[InstancesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setPromoteReplica(value: Fields => Request[Operation]): Self = this.set("promoteReplica", js.Any.fromFunction1(value))
    @scala.inline
    def setResetSslConfig(value: Fields => Request[Operation]): Self = this.set("resetSslConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setRestart(value: Fields => Request[Operation]): Self = this.set("restart", js.Any.fromFunction1(value))
    @scala.inline
    def setRestoreBackup(value: Fields => Request[Operation]): Self = this.set("restoreBackup", js.Any.fromFunction1(value))
    @scala.inline
    def setStartReplica(value: Fields => Request[Operation]): Self = this.set("startReplica", js.Any.fromFunction1(value))
    @scala.inline
    def setStopReplica(value: Fields => Request[Operation]): Self = this.set("stopReplica", js.Any.fromFunction1(value))
    @scala.inline
    def setTruncateLog(value: Fields => Request[Operation]): Self = this.set("truncateLog", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fields => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

