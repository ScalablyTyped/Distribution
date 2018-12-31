package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseInstance extends js.Object {
  /**
    * FIRST_GEN: Basic Cloud SQL instance that runs in a Google-managed container.
    * SECOND_GEN: A newer Cloud SQL backend that runs in a Compute Engine VM.
    * EXTERNAL: A MySQL server that is not managed by Google.
    */
  var backendType: js.UndefOr[java.lang.String] = js.undefined
  /** Connection name of the Cloud SQL instance used in connection strings. */
  var connectionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current disk usage of the instance in bytes. This property has been deprecated. Users should use the
    * "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see
    * https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ for details.
    */
  var currentDiskSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The database engine type and version. The databaseVersion field can not be changed after instance creation. MySQL Second Generation instances:
    * MYSQL_5_7 (default) or MYSQL_5_6. PostgreSQL instances: POSTGRES_9_6 MySQL First Generation instances: MYSQL_5_6 (default) or MYSQL_5_5
    */
  var databaseVersion: js.UndefOr[java.lang.String] = js.undefined
  /** HTTP 1.1 Entity tag for the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The name and status of the failover replica. This property is applicable only to Second Generation instances. */
  var failoverReplica: js.UndefOr[gapiDotClientDotSqladminLib.Anon_Available] = js.undefined
  /**
    * The GCE zone that the instance is serving from. In case when the instance is failed over to standby zone, this value may be different with what user
    * specified in the settings.
    */
  var gceZone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The instance type. This can be one of the following.
    * CLOUD_SQL_INSTANCE: A Cloud SQL instance that is not replicating from a master.
    * ON_PREMISES_INSTANCE: An instance running on the customer's premises.
    * READ_REPLICA_INSTANCE: A Cloud SQL instance configured as a read-replica.
    */
  var instanceType: js.UndefOr[java.lang.String] = js.undefined
  /** The assigned IP addresses for the instance. */
  var ipAddresses: js.UndefOr[js.Array[IpMapping]] = js.undefined
  /** The IPv6 address assigned to the instance. This property is applicable only to First Generation instances. */
  var ipv6Address: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#instance. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the instance which will act as master in the replication setup. */
  var masterInstanceName: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum disk size of the instance in bytes. */
  var maxDiskSize: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the Cloud SQL instance. This does not include the project ID. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration specific to on-premises instances. */
  var onPremisesConfiguration: js.UndefOr[OnPremisesConfiguration] = js.undefined
  /** The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable. */
  var project: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The geographical region. Can be us-central (FIRST_GEN instances only), us-central1 (SECOND_GEN instances only), asia-east1 or europe-west1. Defaults to
    * us-central or us-central1 depending on the instance type (First Generation or Second Generation). The region can not be changed after instance
    * creation.
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration specific to read-replicas replicating from on-premises masters. */
  var replicaConfiguration: js.UndefOr[ReplicaConfiguration] = js.undefined
  /** The replicas of the instance. */
  var replicaNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The URI of this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** SSL configuration. */
  var serverCaCert: js.UndefOr[SslCert] = js.undefined
  /** The service account email address assigned to the instance. This property is applicable only to Second Generation instances. */
  var serviceAccountEmailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The user settings. */
  var settings: js.UndefOr[Settings] = js.undefined
  /**
    * The current serving state of the Cloud SQL instance. This can be one of the following.
    * RUNNABLE: The instance is running, or is ready to run when accessed.
    * SUSPENDED: The instance is not available, for example due to problems with billing.
    * PENDING_CREATE: The instance is being created.
    * MAINTENANCE: The instance is down for maintenance.
    * FAILED: The instance creation failed.
    * UNKNOWN_STATE: The state of the instance is unknown.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** If the instance state is SUSPENDED, the reason for the suspension. */
  var suspensionReason: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

