package typings.googleAppsScript.GoogleAppsScript.Cache

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
@js.native
trait CacheService extends js.Object {
  def getDocumentCache(): typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null = js.native
  def getScriptCache(): typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null = js.native
  def getUserCache(): typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null = js.native
}

object CacheService {
  @scala.inline
  def apply(
    getDocumentCache: () => typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null,
    getScriptCache: () => typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null,
    getUserCache: () => typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null
  ): CacheService = {
    val __obj = js.Dynamic.literal(getDocumentCache = js.Any.fromFunction0(getDocumentCache), getScriptCache = js.Any.fromFunction0(getScriptCache), getUserCache = js.Any.fromFunction0(getUserCache))
    __obj.asInstanceOf[CacheService]
  }
  @scala.inline
  implicit class CacheServiceOps[Self <: CacheService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDocumentCache(value: () => typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = this.set("getDocumentCache", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScriptCache(value: () => typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = this.set("getScriptCache", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserCache(value: () => typings.googleAppsScript.GoogleAppsScript.Cache.Cache | Null): Self = this.set("getUserCache", js.Any.fromFunction0(value))
  }
  
}

