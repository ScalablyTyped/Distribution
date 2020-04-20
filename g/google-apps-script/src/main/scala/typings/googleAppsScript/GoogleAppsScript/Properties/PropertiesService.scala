package typings.googleAppsScript.GoogleAppsScript.Properties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait PropertiesService extends js.Object {
  def getDocumentProperties(): typings.googleAppsScript.GoogleAppsScript.Properties.Properties
  def getScriptProperties(): typings.googleAppsScript.GoogleAppsScript.Properties.Properties
  def getUserProperties(): typings.googleAppsScript.GoogleAppsScript.Properties.Properties
}

object PropertiesService {
  @scala.inline
  def apply(
    getDocumentProperties: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties,
    getScriptProperties: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties,
    getUserProperties: () => typings.googleAppsScript.GoogleAppsScript.Properties.Properties
  ): PropertiesService = {
    val __obj = js.Dynamic.literal(getDocumentProperties = js.Any.fromFunction0(getDocumentProperties), getScriptProperties = js.Any.fromFunction0(getScriptProperties), getUserProperties = js.Any.fromFunction0(getUserProperties))
    __obj.asInstanceOf[PropertiesService]
  }
}

