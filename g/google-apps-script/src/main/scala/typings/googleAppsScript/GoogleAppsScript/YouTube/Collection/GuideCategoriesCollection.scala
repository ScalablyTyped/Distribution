package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.GuideCategoryListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuideCategoriesCollection extends js.Object {
  
  // Returns a list of categories that can be associated with YouTube channels.
  def list(part: String): GuideCategoryListResponse = js.native
  // Returns a list of categories that can be associated with YouTube channels.
  def list(part: String, optionalArgs: js.Object): GuideCategoryListResponse = js.native
}
