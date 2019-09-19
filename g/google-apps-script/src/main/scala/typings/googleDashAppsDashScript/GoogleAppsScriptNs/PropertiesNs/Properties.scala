package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PropertiesNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
  def deleteAllProperties(): Properties = js.native
  def deleteProperty(key: String): Properties = js.native
  def getKeys(): js.Array[String] = js.native
  def getProperties(): StringDictionary[String] = js.native
  def getProperty(key: String): String | Null = js.native
  def setProperties(properties: StringDictionary[String]): Properties = js.native
  def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): Properties = js.native
  def setProperty(key: String, value: String): Properties = js.native
}

