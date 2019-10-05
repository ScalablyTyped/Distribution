package typings.googleDashAppsDashScript.GoogleAppsScript.Cache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheService extends js.Object {
  def getDocumentCache(): typings.googleDashAppsDashScript.GoogleAppsScript.Cache.Cache | Null
  def getScriptCache(): typings.googleDashAppsDashScript.GoogleAppsScript.Cache.Cache | Null
  def getUserCache(): typings.googleDashAppsDashScript.GoogleAppsScript.Cache.Cache | Null
}

object CacheService {
  @scala.inline
  def apply(
    getDocumentCache: () => typings.googleDashAppsDashScript.GoogleAppsScript.Cache.Cache | Null,
    getScriptCache: () => typings.googleDashAppsDashScript.GoogleAppsScript.Cache.Cache | Null,
    getUserCache: () => typings.googleDashAppsDashScript.GoogleAppsScript.Cache.Cache | Null
  ): CacheService = {
    val __obj = js.Dynamic.literal(getDocumentCache = js.Any.fromFunction0(getDocumentCache), getScriptCache = js.Any.fromFunction0(getScriptCache), getUserCache = js.Any.fromFunction0(getUserCache))
  
    __obj.asInstanceOf[CacheService]
  }
}

