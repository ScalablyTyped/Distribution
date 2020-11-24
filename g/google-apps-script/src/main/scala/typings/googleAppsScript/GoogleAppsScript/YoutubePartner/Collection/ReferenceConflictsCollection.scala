package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ReferenceConflict
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ReferenceConflictListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceConflictsCollection extends js.Object {
  
  // Retrieves information about the specified reference conflict.
  def get(referenceConflictId: String): ReferenceConflict = js.native
  // Retrieves information about the specified reference conflict.
  def get(referenceConflictId: String, optionalArgs: js.Object): ReferenceConflict = js.native
  
  // Retrieves a list of unresolved reference conflicts.
  def list(): ReferenceConflictListResponse = js.native
  // Retrieves a list of unresolved reference conflicts.
  def list(optionalArgs: js.Object): ReferenceConflictListResponse = js.native
}
