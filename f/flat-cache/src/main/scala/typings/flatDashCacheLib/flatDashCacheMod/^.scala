package typings
package flatDashCacheLib.flatDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flat-cache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearAll(): scala.Boolean = js.native
  def clearAll(cacheDir: java.lang.String): scala.Boolean = js.native
  def clearCacheById(cacheId: java.lang.String): scala.Boolean = js.native
  def clearCacheById(cacheId: java.lang.String, cacheDir: java.lang.String): scala.Boolean = js.native
  def create(cacheId: java.lang.String): Cache = js.native
  def create(cacheId: java.lang.String, cacheDir: java.lang.String): Cache = js.native
  def createFromFile(filePath: java.lang.String): Cache = js.native
  def load(cacheId: java.lang.String): Cache = js.native
  def load(cacheId: java.lang.String, cacheDir: java.lang.String): Cache = js.native
}

