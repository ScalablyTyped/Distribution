package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDataSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDataSourcesCollection extends js.Object {
  
  // List custom data sources to which the user has access.
  def list(accountId: String, webPropertyId: String): CustomDataSources = js.native
  // List custom data sources to which the user has access.
  def list(accountId: String, webPropertyId: String, optionalArgs: js.Object): CustomDataSources = js.native
}
