package typings.googleDashAppsDashScript.GoogleAppsScript.Properties

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptProperties extends js.Object {
  def deleteAllProperties(): ScriptProperties = js.native
  def deleteProperty(key: String): ScriptProperties = js.native
  def getKeys(): js.Array[String] = js.native
  def getProperties(): StringDictionary[String] = js.native
  def getProperty(key: String): String | Null = js.native
  def setProperties(properties: StringDictionary[String]): ScriptProperties = js.native
  def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): ScriptProperties = js.native
  def setProperty(key: String, value: String): ScriptProperties = js.native
}

