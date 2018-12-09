package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val documents: gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs.DocumentsResource = js.native
  /** Load Google Cloud Natural Language API v1 */
  def load(
    name: gapiDotClientDotLanguageLib.gapiDotClientDotLanguageLibStrings.language,
    version: gapiDotClientDotLanguageLib.gapiDotClientDotLanguageLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotLanguageLib.gapiDotClientDotLanguageLibStrings.language,
    version: gapiDotClientDotLanguageLib.gapiDotClientDotLanguageLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

