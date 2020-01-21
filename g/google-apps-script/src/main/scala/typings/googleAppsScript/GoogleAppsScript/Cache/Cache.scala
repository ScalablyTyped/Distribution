package typings.googleAppsScript.GoogleAppsScript.Cache

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a particular cache.
  *
  * This class allows you to insert, retrieve, and remove items from a cache. This can be
  * particularly useful when you want frequent access to an expensive or slow resource. For example,
  * say you have an RSS feed at example.com that takes 20 seconds to fetch, but you want to speed up
  * access on an average request.
  *
  *     function getRssFeed() {
  *       var cache = CacheService.getScriptCache();
  *       var cached = cache.get("rss-feed-contents");
  *       if (cached != null) {
  *         return cached;
  *       }
  *       var result = UrlFetchApp.fetch("http://example.com/my-slow-rss-feed.xml"); // takes 20 seconds
  *       var contents = result.getContentText();
  *       cache.put("rss-feed-contents", contents, 1500); // cache for 25 minutes
  *       return contents;
  *     }
  */
@js.native
trait Cache extends js.Object {
  def get(key: String): String | Null = js.native
  def getAll(keys: js.Array[String]): StringDictionary[js.Any] = js.native
  def put(key: String, value: String): Unit = js.native
  def put(key: String, value: String, expirationInSeconds: Integer): Unit = js.native
  def putAll(values: StringDictionary[js.Any]): Unit = js.native
  def putAll(values: StringDictionary[js.Any], expirationInSeconds: Integer): Unit = js.native
  def remove(key: String): Unit = js.native
  def removeAll(keys: js.Array[String]): Unit = js.native
}

