package typings.gapiDotClientDotLanguage.gapiNs.clientNs

import typings.gapiDotClientDotLanguage.gapiDotClientDotLanguageStrings.language
import typings.gapiDotClientDotLanguage.gapiDotClientDotLanguageStrings.v1
import typings.gapiDotClientDotLanguage.gapiNs.clientNs.languageNs.DocumentsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val documents: DocumentsResource = js.native
  /** Load Google Cloud Natural Language API v1 */
  def load(name: language, version: v1): js.Thenable[Unit] = js.native
  def load(name: language, version: v1, callback: js.Function0[_]): Unit = js.native
}

