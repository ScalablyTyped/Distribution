package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.CollectionNs.PresentationsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesCollection extends js.Object {
  // Gets the latest version of the specified page in the presentation.
  def get(presentationId: String, pageObjectId: String): typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Page = js.native
  // Generates a thumbnail of the latest version of the specified page in the
  // presentation and returns a URL to the thumbnail image.
  // This request counts as an [expensive read request](/slides/limits) for
  // quota purposes.
  def getThumbnail(presentationId: String, pageObjectId: String): Thumbnail = js.native
  // Generates a thumbnail of the latest version of the specified page in the
  // presentation and returns a URL to the thumbnail image.
  // This request counts as an [expensive read request](/slides/limits) for
  // quota purposes.
  def getThumbnail(presentationId: String, pageObjectId: String, optionalArgs: js.Object): Thumbnail = js.native
}

