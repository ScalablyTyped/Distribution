package typings.dexie

import typings.dexie.mod.IndexableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[Key] extends js.Object {
  var key: IndexableType
  var primaryKey: Key
}

object AnonKey {
  @scala.inline
  def apply[Key](key: IndexableType, primaryKey: Key): AnonKey[Key] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey[Key]]
  }
}

