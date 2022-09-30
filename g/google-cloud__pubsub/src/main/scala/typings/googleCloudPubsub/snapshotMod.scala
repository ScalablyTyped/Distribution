package typings.googleCloudPubsub

import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISeekResponse
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.ISnapshot
import typings.googleCloudPubsub.pubsubMod.EmptyCallback
import typings.googleCloudPubsub.pubsubMod.EmptyResponse
import typings.googleCloudPubsub.pubsubMod.PubSub
import typings.googleCloudPubsub.pubsubMod.RequestCallback
import typings.googleCloudPubsub.pubsubMod.ResourceCallback
import typings.googleCloudPubsub.subscriptionMod.Subscription
import typings.googleGax.gaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotMod {
  
  @JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
  @js.native
  open class Snapshot protected () extends StObject {
    def this(parent: PubSub, name: String) = this()
    def this(parent: Subscription, name: String) = this()
    
    /**
      * Create a snapshot with the given name.
      *
      * **This is only available if you accessed this object through
      * {@link Subscription#snapshot}.**
      *
      * @method Snapshot#create
      * @param {string} name Name of the snapshot.
      * @param {function} [callback] The callback function.
      * @param {?error} callback.err An error from the API call, may be null.
      * @param {Snapshot} callback.snapshot The newly created
      *     snapshot.
      * @param {object} callback.apiResponse The full API response from the
      *     service.
      *
      * @example
      * ```
      * const subscription = pubsub.subscription('my-subscription');
      * const snapshot = subscription.snapshot('my-snapshot');
      *
      * const callback = (err, snapshot, apiResponse) => {
      *   if (!err) {
      *     // The snapshot was created successfully.
      *   }
      * };
      *
      * snapshot.create('my-snapshot', callback);
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * snapshot.create('my-snapshot').then((data) => {
      *   const snapshot = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def create(): js.Promise[CreateSnapshotResponse] = js.native
    def create(callback: CreateSnapshotCallback): Unit = js.native
    def create(gaxOpts: CallOptions): js.Promise[CreateSnapshotResponse] = js.native
    def create(gaxOpts: CallOptions, callback: CreateSnapshotCallback): Unit = js.native
    
    /**
      * Delete the snapshot.
      *
      * @param {function} [callback] The callback function.
      * @param {?error} callback.err An error returned while making this
      *     request.
      * @param {object} callback.apiResponse The full API response from the
      *     service.
      *
      * @example
      * ```
      * snapshot.delete((err, apiResponse) => {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * snapshot.delete().then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def delete(): js.Promise[EmptyResponse] = js.native
    def delete(callback: EmptyCallback): Unit = js.native
    
    var metadata: js.UndefOr[ISnapshot] = js.native
    
    var name: String = js.native
    
    var parent: Subscription | PubSub = js.native
    
    /**
      * Seeks an existing subscription to the snapshot.
      *
      * **This is only available if you accessed this object through
      * {@link Subscription#snapshot}.**
      *
      * @method Snapshot#seek
      * @param {function} callback The callback function.
      * @param {?error} callback.err An error from the API call, may be null.
      * @param {object} callback.apiResponse The full API response from the
      *     service.
      *
      * @example
      * ```
      * const subscription = pubsub.subscription('my-subscription');
      * const snapshot = subscription.snapshot('my-snapshot');
      *
      * snapshot.seek((err, apiResponse) => {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * snapshot.seek().then((data) => {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def seek(): js.Promise[SeekResponse] = js.native
    def seek(callback: SeekCallback): Unit = js.native
    def seek(gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  type CreateSnapshotCallback = ResourceCallback[Snapshot, ISnapshot]
  
  type CreateSnapshotResponse = js.Tuple2[Snapshot, ISnapshot]
  
  type SeekCallback = RequestCallback[ISeekResponse, Unit]
  
  type SeekResponse = js.Array[ISeekResponse]
}
