package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PropertiesNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProperties extends js.Object {
  def deleteAllProperties(): UserProperties = js.native
  def deleteProperty(key: String): UserProperties = js.native
  def getKeys(): js.Array[String] = js.native
  def getProperties(): StringDictionary[String] = js.native
  def getProperty(key: String): String | Null = js.native
  def setProperties(properties: StringDictionary[String]): UserProperties = js.native
  def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): UserProperties = js.native
  def setProperty(key: String, value: String): UserProperties = js.native
}

