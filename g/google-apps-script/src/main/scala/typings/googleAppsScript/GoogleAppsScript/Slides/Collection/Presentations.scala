package typings.googleAppsScript.GoogleAppsScript.Slides.Collection

import typings.googleAppsScript.GoogleAppsScript.Slides.Schema.Page
import typings.googleAppsScript.GoogleAppsScript.Slides.Schema.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Slides.Collection.Presentations")
@js.native
object Presentations extends js.Object {
  
  @js.native
  trait PagesCollection extends js.Object {
    
    // Gets the latest version of the specified page in the presentation.
    def get(presentationId: String, pageObjectId: String): Page = js.native
    
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
}
