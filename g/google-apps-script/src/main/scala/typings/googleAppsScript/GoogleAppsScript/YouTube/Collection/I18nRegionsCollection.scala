package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.I18nRegionListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nRegionsCollection extends js.Object {
  
  // Returns a list of content regions that the YouTube website supports.
  def list(part: String): I18nRegionListResponse = js.native
  // Returns a list of content regions that the YouTube website supports.
  def list(part: String, optionalArgs: js.Object): I18nRegionListResponse = js.native
}
