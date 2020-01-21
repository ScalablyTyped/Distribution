package typings.googleAppsScript.GoogleAppsScript.Properties

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Deprecated. This class is deprecated and should not be used in new scripts.
  * User Properties are key-value pairs unique to a user. User Properties are scoped per user; any
  * script running under the identity of a user can access User Properties for that user only.
  */
@js.native
trait UserProperties extends js.Object {
  /** @deprecated DO NOT USE */ def deleteAllProperties(): UserProperties = js.native
  /** @deprecated DO NOT USE */ def deleteProperty(key: String): UserProperties = js.native
  /** @deprecated DO NOT USE */ def getKeys(): js.Array[String] = js.native
  /** @deprecated DO NOT USE */ def getProperties(): StringDictionary[String] = js.native
  /** @deprecated DO NOT USE */ def getProperty(key: String): String | Null = js.native
  /** @deprecated DO NOT USE */ def setProperties(properties: StringDictionary[String]): UserProperties = js.native
  /** @deprecated DO NOT USE */ def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): UserProperties = js.native
  /** @deprecated DO NOT USE */ def setProperty(key: String, value: String): UserProperties = js.native
}

