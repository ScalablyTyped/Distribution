package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Webproperties
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.Webproperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpropertiesCollection extends js.Object {
  
  // Gets a web property to which the user has access.
  def get(accountId: String, webPropertyId: String): Webproperty = js.native
  
  // Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at least one profile.
  def insert(resource: Webproperty, accountId: String): Webproperty = js.native
  
  // Lists web properties to which the user has access.
  def list(accountId: String): Webproperties = js.native
  // Lists web properties to which the user has access.
  def list(accountId: String, optionalArgs: js.Object): Webproperties = js.native
  
  // Updates an existing web property. This method supports patch semantics.
  def patch(resource: Webproperty, accountId: String, webPropertyId: String): Webproperty = js.native
  
  // Updates an existing web property.
  def update(resource: Webproperty, accountId: String, webPropertyId: String): Webproperty = js.native
}
