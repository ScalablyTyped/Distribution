package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.cacheStorageContentUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.cacheStorageListUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.indexedDBContentUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.indexedDBListUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.interestGroupAccessed
import typings.devtoolsProtocol.devtoolsProtocolStrings.sharedStorageAccessed
import typings.devtoolsProtocol.devtoolsProtocolStrings.storageBucketCreatedOrUpdated
import typings.devtoolsProtocol.devtoolsProtocolStrings.storageBucketDeleted
import typings.devtoolsProtocol.mod.Protocol.Storage.CacheStorageContentUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.CacheStorageListUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.ClearCookiesRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.ClearDataForOriginRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.ClearDataForStorageKeyRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.ClearSharedStorageEntriesRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.ClearTrustTokensRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.ClearTrustTokensResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.DeleteSharedStorageEntryRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.DeleteStorageBucketRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetCookiesRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetCookiesResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.GetInterestGroupDetailsRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetInterestGroupDetailsResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.GetSharedStorageEntriesRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetSharedStorageEntriesResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.GetSharedStorageMetadataRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetSharedStorageMetadataResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.GetStorageKeyForFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetStorageKeyForFrameResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.GetTrustTokensResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.IndexedDBContentUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.IndexedDBListUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.InterestGroupAccessedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.OverrideQuotaForOriginRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.ResetSharedStorageBudgetRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.RunBounceTrackingMitigationsResponse
import typings.devtoolsProtocol.mod.Protocol.Storage.SetCookiesRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.SetInterestGroupTrackingRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.SetSharedStorageEntryRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.SetSharedStorageTrackingRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.SetStorageBucketTrackingRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.SharedStorageAccessedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.StorageBucketCreatedOrUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.StorageBucketDeletedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.TrackCacheStorageForOriginRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.TrackCacheStorageForStorageKeyRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.TrackIndexedDBForOriginRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.TrackIndexedDBForStorageKeyRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackCacheStorageForOriginRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackCacheStorageForStorageKeyRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackIndexedDBForOriginRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.UntrackIndexedDBForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageApi extends StObject {
  
  /**
    * Clears cookies.
    */
  def clearCookies(params: ClearCookiesRequest): js.Promise[Unit] = js.native
  
  /**
    * Clears storage for origin.
    */
  def clearDataForOrigin(params: ClearDataForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Clears storage for storage key.
    */
  def clearDataForStorageKey(params: ClearDataForStorageKeyRequest): js.Promise[Unit] = js.native
  
  /**
    * Clears all entries for a given origin's shared storage.
    */
  def clearSharedStorageEntries(params: ClearSharedStorageEntriesRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes all Trust Tokens issued by the provided issuerOrigin.
    * Leaves other stored data, including the issuer's Redemption Records, intact.
    */
  def clearTrustTokens(params: ClearTrustTokensRequest): js.Promise[ClearTrustTokensResponse] = js.native
  
  /**
    * Deletes entry for `key` (if it exists) for a given origin's shared storage.
    */
  def deleteSharedStorageEntry(params: DeleteSharedStorageEntryRequest): js.Promise[Unit] = js.native
  
  /**
    * Deletes the Storage Bucket with the given storage key and bucket name.
    */
  def deleteStorageBucket(params: DeleteStorageBucketRequest): js.Promise[Unit] = js.native
  
  /**
    * Returns all browser cookies.
    */
  def getCookies(params: GetCookiesRequest): js.Promise[GetCookiesResponse] = js.native
  
  /**
    * Gets details for a named interest group.
    */
  def getInterestGroupDetails(params: GetInterestGroupDetailsRequest): js.Promise[GetInterestGroupDetailsResponse] = js.native
  
  /**
    * Gets the entries in an given origin's shared storage.
    */
  def getSharedStorageEntries(params: GetSharedStorageEntriesRequest): js.Promise[GetSharedStorageEntriesResponse] = js.native
  
  /**
    * Gets metadata for an origin's shared storage.
    */
  def getSharedStorageMetadata(params: GetSharedStorageMetadataRequest): js.Promise[GetSharedStorageMetadataResponse] = js.native
  
  /**
    * Returns a storage key given a frame id.
    */
  def getStorageKeyForFrame(params: GetStorageKeyForFrameRequest): js.Promise[GetStorageKeyForFrameResponse] = js.native
  
  /**
    * Returns the number of stored Trust Tokens per issuer for the
    * current browsing context.
    */
  def getTrustTokens(): js.Promise[GetTrustTokensResponse] = js.native
  
  /**
    * Returns usage and quota in bytes.
    */
  def getUsageAndQuota(params: GetUsageAndQuotaRequest): js.Promise[GetUsageAndQuotaResponse] = js.native
  
  /**
    * A cache's contents have been modified.
    */
  @JSName("on")
  def on_cacheStorageContentUpdated(
    event: cacheStorageContentUpdated,
    listener: js.Function1[/* params */ CacheStorageContentUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * A cache has been added/deleted.
    */
  @JSName("on")
  def on_cacheStorageListUpdated(
    event: cacheStorageListUpdated,
    listener: js.Function1[/* params */ CacheStorageListUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * The origin's IndexedDB object store has been modified.
    */
  @JSName("on")
  def on_indexedDBContentUpdated(
    event: indexedDBContentUpdated,
    listener: js.Function1[/* params */ IndexedDBContentUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * The origin's IndexedDB database list has been modified.
    */
  @JSName("on")
  def on_indexedDBListUpdated(event: indexedDBListUpdated, listener: js.Function1[/* params */ IndexedDBListUpdatedEvent, Unit]): Unit = js.native
  /**
    * One of the interest groups was accessed by the associated page.
    */
  @JSName("on")
  def on_interestGroupAccessed(
    event: interestGroupAccessed,
    listener: js.Function1[/* params */ InterestGroupAccessedEvent, Unit]
  ): Unit = js.native
  /**
    * Shared storage was accessed by the associated page.
    * The following parameters are included in all events.
    */
  @JSName("on")
  def on_sharedStorageAccessed(
    event: sharedStorageAccessed,
    listener: js.Function1[/* params */ SharedStorageAccessedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_storageBucketCreatedOrUpdated(
    event: storageBucketCreatedOrUpdated,
    listener: js.Function1[/* params */ StorageBucketCreatedOrUpdatedEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_storageBucketDeleted(event: storageBucketDeleted, listener: js.Function1[/* params */ StorageBucketDeletedEvent, Unit]): Unit = js.native
  
  /**
    * Override quota for the specified origin
    */
  def overrideQuotaForOrigin(params: OverrideQuotaForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Resets the budget for `ownerOrigin` by clearing all budget withdrawals.
    */
  def resetSharedStorageBudget(params: ResetSharedStorageBudgetRequest): js.Promise[Unit] = js.native
  
  /**
    * Deletes state for sites identified as potential bounce trackers, immediately.
    */
  def runBounceTrackingMitigations(): js.Promise[RunBounceTrackingMitigationsResponse] = js.native
  
  /**
    * Sets given cookies.
    */
  def setCookies(params: SetCookiesRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables/Disables issuing of interestGroupAccessed events.
    */
  def setInterestGroupTracking(params: SetInterestGroupTrackingRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets entry with `key` and `value` for a given origin's shared storage.
    */
  def setSharedStorageEntry(params: SetSharedStorageEntryRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables/disables issuing of sharedStorageAccessed events.
    */
  def setSharedStorageTracking(params: SetSharedStorageTrackingRequest): js.Promise[Unit] = js.native
  
  /**
    * Set tracking for a storage key's buckets.
    */
  def setStorageBucketTracking(params: SetStorageBucketTrackingRequest): js.Promise[Unit] = js.native
  
  /**
    * Registers origin to be notified when an update occurs to its cache storage list.
    */
  def trackCacheStorageForOrigin(params: TrackCacheStorageForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Registers storage key to be notified when an update occurs to its cache storage list.
    */
  def trackCacheStorageForStorageKey(params: TrackCacheStorageForStorageKeyRequest): js.Promise[Unit] = js.native
  
  /**
    * Registers origin to be notified when an update occurs to its IndexedDB.
    */
  def trackIndexedDBForOrigin(params: TrackIndexedDBForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Registers storage key to be notified when an update occurs to its IndexedDB.
    */
  def trackIndexedDBForStorageKey(params: TrackIndexedDBForStorageKeyRequest): js.Promise[Unit] = js.native
  
  /**
    * Unregisters origin from receiving notifications for cache storage.
    */
  def untrackCacheStorageForOrigin(params: UntrackCacheStorageForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Unregisters storage key from receiving notifications for cache storage.
    */
  def untrackCacheStorageForStorageKey(params: UntrackCacheStorageForStorageKeyRequest): js.Promise[Unit] = js.native
  
  /**
    * Unregisters origin from receiving notifications for IndexedDB.
    */
  def untrackIndexedDBForOrigin(params: UntrackIndexedDBForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Unregisters storage key from receiving notifications for IndexedDB.
    */
  def untrackIndexedDBForStorageKey(params: UntrackIndexedDBForStorageKeyRequest): js.Promise[Unit] = js.native
}
