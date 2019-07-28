package typings.flatDashCache.flatDashCacheMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def all(): StringDictionary[js.Any] = js.native
  def destroy(): Unit = js.native
  def getKey(key: String): js.Any = js.native
  def keys(): js.Array[String] = js.native
  def load(cacheId: String): Unit = js.native
  def load(cacheId: String, cacheDir: String): Unit = js.native
  def loadFile(pathToFile: String): Unit = js.native
  def removeCacheFile(): Boolean = js.native
  def removeKey(key: String): Unit = js.native
  def save(): Unit = js.native
  def save(noPrune: Boolean): Unit = js.native
  def setKey(key: String, value: js.Any): Unit = js.native
}

