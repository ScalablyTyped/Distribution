package typings.gapiClientTranslate

import typings.gapiClientTranslate.gapi.client.translate.DetectionsResource
import typings.gapiClientTranslate.gapi.client.translate.LanguagesResource
import typings.gapiClientTranslate.gapi.client.translate.TranslationsResource
import typings.gapiClientTranslate.gapiClientTranslateStrings.translate
import typings.gapiClientTranslate.gapiClientTranslateStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val detections: DetectionsResource = js.native
      val languages: LanguagesResource = js.native
      val translations: TranslationsResource = js.native
      /** Load Google Cloud Translation API v2 */
      def load(name: translate, version: v2): js.Thenable[Unit] = js.native
      def load(name: translate, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

