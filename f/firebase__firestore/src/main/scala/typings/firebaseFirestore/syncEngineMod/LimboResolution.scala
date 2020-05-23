package typings.firebaseFirestore.syncEngineMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tracks a limbo resolution. */
trait LimboResolution extends js.Object {
  var key: DocumentKey
  /**
    * Set to true once we've received a document. This is used in
    * getRemoteKeysForTarget() and ultimately used by WatchChangeAggregator to
    * decide whether it needs to manufacture a delete event for the target once
    * the target is CURRENT.
    */
  var receivedDocument: Boolean
}

object LimboResolution {
  @scala.inline
  def apply(key: DocumentKey, receivedDocument: Boolean): LimboResolution = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], receivedDocument = receivedDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimboResolution]
  }
}

