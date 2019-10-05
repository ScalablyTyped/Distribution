package typings.flatDashCache

import org.scalablytyped.runtime.StringDictionary
import typings.flatDashCache.flatDashCacheMod.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flat-cache", JSImport.Namespace)
@js.native
object flatDashCacheMod extends js.Object {
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
  
  def clearAll(): Boolean = js.native
  def clearAll(cacheDir: String): Boolean = js.native
  def clearCacheById(cacheId: String): Boolean = js.native
  def clearCacheById(cacheId: String, cacheDir: String): Boolean = js.native
  def create(cacheId: String): Cache = js.native
  def create(cacheId: String, cacheDir: String): Cache = js.native
  def createFromFile(filePath: String): Cache = js.native
  def load(cacheId: String): Cache = js.native
  def load(cacheId: String, cacheDir: String): Cache = js.native
}

