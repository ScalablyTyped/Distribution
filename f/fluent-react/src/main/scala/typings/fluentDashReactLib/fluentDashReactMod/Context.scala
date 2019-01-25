package typings
package fluentDashReactLib.fluentDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var l10n: ReactLocalization = js.native
  @JSName("parseMarkup")
  var parseMarkup_Original: MarkupParser = js.native
  def parseMarkup(str: java.lang.String): js.Array[Node] = js.native
}

