package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Properties {
  
  /**
    * The properties object acts as the interface to access user, document, or script properties. The
    * specific property type depends on which of the three methods of PropertiesService the
    * script called: PropertiesService.getDocumentProperties(), PropertiesService.getUserProperties(), or PropertiesService.getScriptProperties().
    * Properties cannot be shared between scripts. For more information about property types, see the
    * guide to the Properties service.
    */
  @js.native
  trait Properties extends StObject {
    
    def deleteAllProperties(): typings.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
    
    def deleteProperty(key: String): typings.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
    
    def getKeys(): js.Array[String] = js.native
    
    def getProperties(): StringDictionary[String] = js.native
    
    def getProperty(key: String): String | Null = js.native
    
    def setProperties(properties: StringDictionary[String]): typings.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
    def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): typings.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
    
    def setProperty(key: String, value: String): typings.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
  }
  
  /**
    * Allows scripts to store simple data in key-value pairs scoped to one script, one user of a
    * script, or one document in which an add-on is used. Properties cannot be shared between scripts.
    * For more information about when to use each type of property, see the guide to the Properties service.
    *
    *     // Sets three properties of different types.
    *     var documentProperties = PropertiesService.getDocumentProperties();
    *     var scriptProperties = PropertiesService.getScriptProperties();
    *     var userProperties = PropertiesService.getUserProperties();
    *
    *     documentProperties.setProperty('DAYS_TO_FETCH', '5');
    *     scriptProperties.setProperty('SERVER_URL', 'http://www.example.com/MyWeatherService/');
    *     userProperties.setProperty('DISPLAY_UNITS', 'metric');
    */
  trait PropertiesService extends StObject {
    
    def getDocumentProperties(): typings.googleAppsScript.GoogleAppsScript.Properties.Properties
    
    def getScriptProperties(): typings.googleAppsScript.GoogleAppsScript.Properties.Properties
    
    def getUserProperties(): typings.googleAppsScript.GoogleAppsScript.Properties.Properties
  }
  object PropertiesService {
    
    inline def apply(
      getDocumentProperties: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties,
      getScriptProperties: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties,
      getUserProperties: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties
    ): PropertiesService = {
      val __obj = js.Dynamic.literal(getDocumentProperties = js.Any.fromFunction0(getDocumentProperties), getScriptProperties = js.Any.fromFunction0(getScriptProperties), getUserProperties = js.Any.fromFunction0(getUserProperties))
      __obj.asInstanceOf[PropertiesService]
    }
    
    extension [Self <: PropertiesService](x: Self) {
      
      inline def setGetDocumentProperties(value: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties): Self = StObject.set(x, "getDocumentProperties", js.Any.fromFunction0(value))
      
      inline def setGetScriptProperties(value: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties): Self = StObject.set(x, "getScriptProperties", js.Any.fromFunction0(value))
      
      inline def setGetUserProperties(value: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties): Self = StObject.set(x, "getUserProperties", js.Any.fromFunction0(value))
    }
  }
  
  /**
    *
    * Deprecated. This class is deprecated and should not be used in new scripts.
    * Script Properties are key-value pairs stored by a script in a persistent store. Script Properties
    * are scoped per script, regardless of which user runs the script.
    */
  @js.native
  trait ScriptProperties extends StObject {
    
    /** @deprecated DO NOT USE */ def deleteAllProperties(): ScriptProperties = js.native
    
    /** @deprecated DO NOT USE */ def deleteProperty(key: String): ScriptProperties = js.native
    
    /** @deprecated DO NOT USE */ def getKeys(): js.Array[String] = js.native
    
    /** @deprecated DO NOT USE */ def getProperties(): StringDictionary[String] = js.native
    
    /** @deprecated DO NOT USE */ def getProperty(key: String): String | Null = js.native
    
    /** @deprecated DO NOT USE */ def setProperties(properties: StringDictionary[String]): ScriptProperties = js.native
    /** @deprecated DO NOT USE */ def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): ScriptProperties = js.native
    
    /** @deprecated DO NOT USE */ def setProperty(key: String, value: String): ScriptProperties = js.native
  }
  
  /**
    *
    * Deprecated. This class is deprecated and should not be used in new scripts.
    * User Properties are key-value pairs unique to a user. User Properties are scoped per user; any
    * script running under the identity of a user can access User Properties for that user only.
    */
  @js.native
  trait UserProperties extends StObject {
    
    /** @deprecated DO NOT USE */ def deleteAllProperties(): UserProperties = js.native
    
    /** @deprecated DO NOT USE */ def deleteProperty(key: String): UserProperties = js.native
    
    /** @deprecated DO NOT USE */ def getKeys(): js.Array[String] = js.native
    
    /** @deprecated DO NOT USE */ def getProperties(): StringDictionary[String] = js.native
    
    /** @deprecated DO NOT USE */ def getProperty(key: String): String | Null = js.native
    
    /** @deprecated DO NOT USE */ def setProperties(properties: StringDictionary[String]): UserProperties = js.native
    /** @deprecated DO NOT USE */ def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): UserProperties = js.native
    
    /** @deprecated DO NOT USE */ def setProperty(key: String, value: String): UserProperties = js.native
  }
}
