package typings
package dexieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[Key] extends js.Object {
  var key: dexieLib.dexieMod.IndexableType
  var primaryKey: Key
}

object Anon_Key {
  @scala.inline
  def apply[Key](key: dexieLib.dexieMod.IndexableType, primaryKey: Key): Anon_Key[Key] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key[Key]]
  }
}

