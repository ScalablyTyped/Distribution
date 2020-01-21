package typings.goodStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  var session: Storage = js.native
  def clear(): Unit = js.native
  def forEach(callback: js.Function0[Unit]): Unit = js.native
  def get(key: String): js.Any = js.native
  def get(key: String, `def`: js.Any): js.Any = js.native
  def getAll(): js.Any = js.native
  def has(key: String): Boolean = js.native
  def remove(key: String): Unit = js.native
  def set(key: String): js.Any = js.native
  def set(key: String, `val`: js.Any): js.Any = js.native
}

