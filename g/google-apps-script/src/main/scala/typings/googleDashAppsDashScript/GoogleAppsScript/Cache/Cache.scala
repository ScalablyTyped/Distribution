package typings.googleDashAppsDashScript.GoogleAppsScript.Cache

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

