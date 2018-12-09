package typings
package gapiDotClientDotTranslateLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val detections: gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs.DetectionsResource = js.native
  val languages: gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs.LanguagesResource = js.native
  val translations: gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs.TranslationsResource = js.native
  /** Load Google Cloud Translation API v2 */
  def load(
    name: gapiDotClientDotTranslateLib.gapiDotClientDotTranslateLibStrings.translate,
    version: gapiDotClientDotTranslateLib.gapiDotClientDotTranslateLibStrings.v2
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotTranslateLib.gapiDotClientDotTranslateLibStrings.translate,
    version: gapiDotClientDotTranslateLib.gapiDotClientDotTranslateLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

