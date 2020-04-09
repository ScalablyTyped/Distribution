package typings.firebaseFirestore

import typings.firebaseFirestore.coreFirestoreClientMod.PersistenceSettings
import typings.firebaseFirestore.firebaseFirestoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheSizeBytes
  extends PersistenceSettings
     with typings.firebaseFirestore.firestoreClientMod.PersistenceSettings {
  val cacheSizeBytes: Double
  val durable: `true`
  val synchronizeTabs: Boolean
}

object AnonCacheSizeBytes {
  @scala.inline
  def apply(cacheSizeBytes: Double, durable: `true`, synchronizeTabs: Boolean): AnonCacheSizeBytes = {
    val __obj = js.Dynamic.literal(cacheSizeBytes = cacheSizeBytes.asInstanceOf[js.Any], durable = durable.asInstanceOf[js.Any], synchronizeTabs = synchronizeTabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCacheSizeBytes]
  }
}

