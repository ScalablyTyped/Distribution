package typings.googleDashAppsDashScript.GoogleAppsScript.Cache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CacheService allows you to access a cache for short term storage of data.
  *
  * This class lets you get a specific cache instance. Public caches are for things that are not
  * dependent on which user is accessing your script. Private caches are for things which are
  * user-specific, like settings or recent activity.
  *
  * The data you write to the cache is not guaranteed to persist until its expiration time. You
  * must be prepared to get back null from all reads.
  */
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

