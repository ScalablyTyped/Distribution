package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheService extends js.Object {
  def getDocumentCache(): Cache | Null
  def getScriptCache(): Cache | Null
  def getUserCache(): Cache | Null
}

object CacheService {
  @scala.inline
  def apply(
    getDocumentCache: () => Cache | Null,
    getScriptCache: () => Cache | Null,
    getUserCache: () => Cache | Null
  ): CacheService = {
    val __obj = js.Dynamic.literal(getDocumentCache = js.Any.fromFunction0(getDocumentCache), getScriptCache = js.Any.fromFunction0(getScriptCache), getUserCache = js.Any.fromFunction0(getUserCache))
  
    __obj.asInstanceOf[CacheService]
  }
}

