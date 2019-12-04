package typings.atFirebaseRemoteDashConfig.distSrcStorageStorageMod

import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.FetchResponse
import typings.atFirebaseRemoteDashConfig.distSrcClientRemoteUnderscoreConfigUnderscoreFetchUnderscoreClientMod.FirebaseRemoteConfigObject
import typings.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.FetchStatus
import typings.std.IDBDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/storage/storage", "Storage")
@js.native
class Storage protected () extends js.Object {
  /**
    * @param appId enables storage segmentation by app (ID + name).
    * @param appName enables storage segmentation by app (ID + name).
    * @param namespace enables storage segmentation by namespace.
    */
  def this(appId: String, appName: String, namespace: String) = this()
  def this(appId: String, appName: String, namespace: String, openDbPromise: js.Promise[IDBDatabase]) = this()
  val appId: js.Any = js.native
  val appName: js.Any = js.native
  val namespace: js.Any = js.native
  val openDbPromise: js.Any = js.native
  def createCompositeKey(key: ProjectNamespaceKeyFieldValue): String = js.native
  def delete(key: ProjectNamespaceKeyFieldValue): js.Promise[Unit] = js.native
  def deleteThrottleMetadata(): js.Promise[Unit] = js.native
  def get[T](key: ProjectNamespaceKeyFieldValue): js.Promise[js.UndefOr[T]] = js.native
  def getActiveConfig(): js.Promise[js.UndefOr[FirebaseRemoteConfigObject]] = js.native
  def getActiveConfigEtag(): js.Promise[js.UndefOr[String]] = js.native
  def getLastFetchStatus(): js.Promise[js.UndefOr[FetchStatus]] = js.native
  def getLastSuccessfulFetchResponse(): js.Promise[js.UndefOr[FetchResponse]] = js.native
  def getLastSuccessfulFetchTimestampMillis(): js.Promise[js.UndefOr[Double]] = js.native
  def getThrottleMetadata(): js.Promise[js.UndefOr[ThrottleMetadata]] = js.native
  def set[T](key: ProjectNamespaceKeyFieldValue, value: T): js.Promise[Unit] = js.native
  def setActiveConfig(config: FirebaseRemoteConfigObject): js.Promise[Unit] = js.native
  def setActiveConfigEtag(etag: String): js.Promise[Unit] = js.native
  def setLastFetchStatus(status: FetchStatus): js.Promise[Unit] = js.native
  def setLastSuccessfulFetchResponse(response: FetchResponse): js.Promise[Unit] = js.native
  def setLastSuccessfulFetchTimestampMillis(timestamp: Double): js.Promise[Unit] = js.native
  def setThrottleMetadata(metadata: ThrottleMetadata): js.Promise[Unit] = js.native
}

