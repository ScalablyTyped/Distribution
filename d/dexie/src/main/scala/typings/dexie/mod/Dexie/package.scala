package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Dexie {
  
  // Because all samples have been Dexie.Table<...>
  // The "Dexie.Collection" interface. Same as named exported interface Collection.
  type Collection[T, Key] = typings.dexie.mod._Collection[T, Key]
  
  // The "Dexie.Promise" type.
  type Promise[T] = typings.dexie.mod.PromiseExtended[T]
  
  // Because many samples have been Dexie.Promise.
  // The "Dexie.Table" interface. Same as named exported interface Table.
  type Table[T, Key] = typings.dexie.mod._Table[T, Key]
}
