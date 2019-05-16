package typings
package flatDashCacheLib.flatDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def all(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def destroy(): scala.Unit = js.native
  def getKey(key: java.lang.String): js.Any = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def load(cacheId: java.lang.String): scala.Unit = js.native
  def load(cacheId: java.lang.String, cacheDir: java.lang.String): scala.Unit = js.native
  def loadFile(pathToFile: java.lang.String): scala.Unit = js.native
  def removeCacheFile(): scala.Boolean = js.native
  def removeKey(key: java.lang.String): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def save(noPrune: scala.Boolean): scala.Unit = js.native
  def setKey(key: java.lang.String, value: js.Any): scala.Unit = js.native
}

