package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreTableSchema extends js.Object {
  val indexes: js.Array[DBCoreIndex] = js.native
  val name: String = js.native
  val primaryKey: DBCoreIndex = js.native
  def getIndexByKeyPath(): js.UndefOr[DBCoreIndex] = js.native
  def getIndexByKeyPath(keyPath: String): js.UndefOr[DBCoreIndex] = js.native
  def getIndexByKeyPath(keyPath: js.Array[String]): js.UndefOr[DBCoreIndex] = js.native
}

