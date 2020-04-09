package typings.firebaseFirestore

import typings.firebaseFirestore.coreFirestoreClientMod.PersistenceSettings
import typings.firebaseFirestore.firebaseFirestoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurable
  extends PersistenceSettings
     with typings.firebaseFirestore.firestoreClientMod.PersistenceSettings {
  val durable: `false`
}

object AnonDurable {
  @scala.inline
  def apply(durable: `false`): AnonDurable = {
    val __obj = js.Dynamic.literal(durable = durable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDurable]
  }
}

