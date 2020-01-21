package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localSimpleDbMod {
  type IterateCallback[KeyType, ValueType] = js.Function3[
    /* key */ KeyType, 
    /* value */ ValueType, 
    /* control */ typings.firebaseFirestore.localSimpleDbMod.IterationController, 
    scala.Unit | typings.firebaseFirestore.localPersistencePromiseMod.PersistencePromise[scala.Unit]
  ]
}
