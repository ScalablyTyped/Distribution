package typings.gapiDotClientDotTranslate.gapiNs.clientNs

import typings.gapiDotClientDotTranslate.gapiDotClientDotTranslateStrings.translate
import typings.gapiDotClientDotTranslate.gapiDotClientDotTranslateStrings.v2
import typings.gapiDotClientDotTranslate.gapiNs.clientNs.translateNs.DetectionsResource
import typings.gapiDotClientDotTranslate.gapiNs.clientNs.translateNs.LanguagesResource
import typings.gapiDotClientDotTranslate.gapiNs.clientNs.translateNs.TranslationsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val detections: DetectionsResource = js.native
  val languages: LanguagesResource = js.native
  val translations: TranslationsResource = js.native
  /** Load Google Cloud Translation API v2 */
  def load(name: translate, version: v2): js.Thenable[Unit] = js.native
  def load(name: translate, version: v2, callback: js.Function0[_]): Unit = js.native
}

