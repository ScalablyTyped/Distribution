package typings.firebaseFirestore.specsSpecTestRunnerMod

import org.scalablytyped.runtime.NumberDictionary
import typings.firebaseFirestore.AnonAcknowledgedDocs
import typings.firebaseFirestore.AnonResumeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateExpectation extends js.Object {
  /**
    * Current expected active targets. Verified in each step until overwritten.
    */
  var activeTargets: js.UndefOr[NumberDictionary[AnonResumeToken]] = js.undefined
  /**
    * Whether the instance holds the primary lease. Used in multi-client tests.
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /** Whether the client is shutdown. */
  var isShutdown: js.UndefOr[Boolean] = js.undefined
  /** Current documents in limbo. Verified in each step until overwritten. */
  var limboDocs: js.UndefOr[js.Array[String]] = js.undefined
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
    activeTargets: NumberDictionary[AnonResumeToken] = null,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    isShutdown: js.UndefOr[Boolean] = js.undefined,
    limboDocs: js.Array[String] = null,
    numActiveClients: Int | Double = null,
    numOutstandingWrites: Int | Double = null,
    userCallbacks: AnonAcknowledgedDocs = null,
    watchStreamRequestCount: Int | Double = null,
    writeStreamRequestCount: Int | Double = null
  ): StateExpectation = {
    val __obj = js.Dynamic.literal()
    if (activeTargets != null) __obj.updateDynamic("activeTargets")(activeTargets.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.asInstanceOf[js.Any])
    if (!js.isUndefined(isShutdown)) __obj.updateDynamic("isShutdown")(isShutdown.asInstanceOf[js.Any])
    if (limboDocs != null) __obj.updateDynamic("limboDocs")(limboDocs.asInstanceOf[js.Any])
    if (numActiveClients != null) __obj.updateDynamic("numActiveClients")(numActiveClients.asInstanceOf[js.Any])
    if (numOutstandingWrites != null) __obj.updateDynamic("numOutstandingWrites")(numOutstandingWrites.asInstanceOf[js.Any])
    if (userCallbacks != null) __obj.updateDynamic("userCallbacks")(userCallbacks.asInstanceOf[js.Any])
    if (watchStreamRequestCount != null) __obj.updateDynamic("watchStreamRequestCount")(watchStreamRequestCount.asInstanceOf[js.Any])
    if (writeStreamRequestCount != null) __obj.updateDynamic("writeStreamRequestCount")(writeStreamRequestCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateExpectation]
  }
}

