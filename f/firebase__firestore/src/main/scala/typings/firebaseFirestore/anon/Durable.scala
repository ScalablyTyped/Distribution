package typings.firebaseFirestore.anon

import typings.firebaseFirestore.firebaseFirestoreBooleans.`false`
import typings.firebaseFirestore.firestoreClientMod.PersistenceSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Durable extends PersistenceSettings {
  val durable: `false`
}

object Durable {
  @scala.inline
  def apply(durable: `false`): Durable = {
    val __obj = js.Dynamic.literal(durable = durable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durable]
  }
}

