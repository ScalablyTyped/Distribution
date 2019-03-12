package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheService extends js.Object {
  def getDocumentCache(): Cache
  def getScriptCache(): Cache
  def getUserCache(): Cache
}

object CacheService {
  @scala.inline
  def apply(getDocumentCache: () => Cache, getScriptCache: () => Cache, getUserCache: () => Cache): CacheService = {
    val __obj = js.Dynamic.literal(getDocumentCache = js.Any.fromFunction0(getDocumentCache), getScriptCache = js.Any.fromFunction0(getScriptCache), getUserCache = js.Any.fromFunction0(getUserCache))
  
    __obj.asInstanceOf[CacheService]
  }
}

