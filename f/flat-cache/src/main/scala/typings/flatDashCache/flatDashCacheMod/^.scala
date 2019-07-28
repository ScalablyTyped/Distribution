package typings.flatDashCache.flatDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flat-cache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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

