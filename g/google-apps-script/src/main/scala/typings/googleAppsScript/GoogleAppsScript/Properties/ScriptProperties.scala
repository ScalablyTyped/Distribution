package typings.googleAppsScript.GoogleAppsScript.Properties

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Deprecated. This class is deprecated and should not be used in new scripts.
  * Script Properties are key-value pairs stored by a script in a persistent store. Script Properties
  * are scoped per script, regardless of which user runs the script.
  */
@js.native
trait ScriptProperties extends js.Object {
  
  /** @deprecated DO NOT USE */ def deleteAllProperties(): ScriptProperties = js.native
  
  /** @deprecated DO NOT USE */ def deleteProperty(key: String): ScriptProperties = js.native
  
  /** @deprecated DO NOT USE */ def getKeys(): js.Array[String] = js.native
  
  /** @deprecated DO NOT USE */ def getProperties(): StringDictionary[String] = js.native
  
  /** @deprecated DO NOT USE */ def getProperty(key: String): String | Null = js.native
  
  /** @deprecated DO NOT USE */ def setProperties(properties: StringDictionary[String]): ScriptProperties = js.native
  /** @deprecated DO NOT USE */ def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): ScriptProperties = js.native
  
  /** @deprecated DO NOT USE */ def setProperty(key: String, value: String): ScriptProperties = js.native
}
