package typings.firebaseFirestore.specTestRunnerMod

import typings.firebaseFirestore.AnonAcknowledgedDocs
import typings.firebaseFirestore.specBuilderMod.ActiveTargetMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateExpectation extends js.Object {
  /**
    * Current documents in limbo that have an active target.
    * Verified in each step until overwritten.
    */
  var activeLimboDocs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Current expected active targets. Verified in each step until overwritten.
    */
  var activeTargets: js.UndefOr[ActiveTargetMap] = js.undefined
  /**
    * Current documents in limbo that are enqueued and therefore do not have an
    * active target.
    * Verified in each step until overwritten.
    */
  var enqueuedLimboDocs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether the instance holds the primary lease. Used in multi-client tests.
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /** Whether the client is shutdown. */
  var isShutdown: js.UndefOr[Boolean] = js.undefined
  /** Number of clients currently marked active. Used in multi-client tests. */
  var numActiveClients: js.UndefOr[Double] = js.undefined
  /** Number of outstanding writes in the datastore queue. */
  var numOutstandingWrites: js.UndefOr[Double] = js.undefined
  /**
    * Expected set of callbacks for previously written docs.
    */
  var userCallbacks: js.UndefOr[AnonAcknowledgedDocs] = js.undefined
  /** Number of requests sent to the watch stream. */
  var watchStreamRequestCount: js.UndefOr[Double] = js.undefined
  /** Number of requests sent to the write stream. */
  var writeStreamRequestCount: js.UndefOr[Double] = js.undefined
}

object StateExpectation {
  @scala.inline
  def apply(
    activeLimboDocs: js.Array[String] = null,
    activeTargets: ActiveTargetMap = null,
    enqueuedLimboDocs: js.Array[String] = null,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    isShutdown: js.UndefOr[Boolean] = js.undefined,
    numActiveClients: Int | Double = null,
    numOutstandingWrites: Int | Double = null,
    userCallbacks: AnonAcknowledgedDocs = null,
    watchStreamRequestCount: Int | Double = null,
    writeStreamRequestCount: Int | Double = null
  ): StateExpectation = {
    val __obj = js.Dynamic.literal()
    if (activeLimboDocs != null) __obj.updateDynamic("activeLimboDocs")(activeLimboDocs.asInstanceOf[js.Any])
    if (activeTargets != null) __obj.updateDynamic("activeTargets")(activeTargets.asInstanceOf[js.Any])
    if (enqueuedLimboDocs != null) __obj.updateDynamic("enqueuedLimboDocs")(enqueuedLimboDocs.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.asInstanceOf[js.Any])
    if (!js.isUndefined(isShutdown)) __obj.updateDynamic("isShutdown")(isShutdown.asInstanceOf[js.Any])
    if (numActiveClients != null) __obj.updateDynamic("numActiveClients")(numActiveClients.asInstanceOf[js.Any])
    if (numOutstandingWrites != null) __obj.updateDynamic("numOutstandingWrites")(numOutstandingWrites.asInstanceOf[js.Any])
    if (userCallbacks != null) __obj.updateDynamic("userCallbacks")(userCallbacks.asInstanceOf[js.Any])
    if (watchStreamRequestCount != null) __obj.updateDynamic("watchStreamRequestCount")(watchStreamRequestCount.asInstanceOf[js.Any])
    if (writeStreamRequestCount != null) __obj.updateDynamic("writeStreamRequestCount")(writeStreamRequestCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateExpectation]
  }
}

