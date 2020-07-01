package typings.firebaseFirestore.anon

import typings.firebaseFirestore.firebaseFirestoreBooleans.`true`
import typings.firebaseFirestore.firestoreClientMod.PersistenceSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheSizeBytes extends PersistenceSettings {
  val cacheSizeBytes: Double
  val durable: `true`
  val forceOwningTab: Boolean
  val synchronizeTabs: Boolean
}

object CacheSizeBytes {
  @scala.inline
  def apply(cacheSizeBytes: Double, durable: `true`, forceOwningTab: Boolean, synchronizeTabs: Boolean): CacheSizeBytes = {
    val __obj = js.Dynamic.literal(cacheSizeBytes = cacheSizeBytes.asInstanceOf[js.Any], durable = durable.asInstanceOf[js.Any], forceOwningTab = forceOwningTab.asInstanceOf[js.Any], synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheSizeBytes]
  }
}

