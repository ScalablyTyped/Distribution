package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.CollectionNs.PresentationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesCollection extends js.Object {
  // Gets the latest version of the specified page in the presentation.
  def get(presentationId: java.lang.String, pageObjectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs.Page = js.native
  // Generates a thumbnail of the latest version of the specified page in the
  // presentation and returns a URL to the thumbnail image.
  // This request counts as an [expensive read request](/slides/limits) for
  // quota purposes.
  def getThumbnail(presentationId: java.lang.String, pageObjectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs.Thumbnail = js.native
  // Generates a thumbnail of the latest version of the specified page in the
  // presentation and returns a URL to the thumbnail image.
  // This request counts as an [expensive read request](/slides/limits) for
  // quota purposes.
  def getThumbnail(presentationId: java.lang.String, pageObjectId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs.Thumbnail = js.native
}

