package typings.dexie.anon

import typings.dexie.mod.IndexableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryKey[Key] extends js.Object {
  var key: IndexableType
  var primaryKey: Key
}

object PrimaryKey {
  @scala.inline
  def apply[Key](key: IndexableType, primaryKey: Key): PrimaryKey[Key] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryKey[Key]]
  }
}

