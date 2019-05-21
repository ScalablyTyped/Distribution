package typings
package fluentDashReactLib.fluentDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var l10n: ReactLocalization
  var parseMarkup: MarkupParser
}

object Context {
  @scala.inline
  def apply(l10n: ReactLocalization, parseMarkup: MarkupParser): Context = {
    val __obj = js.Dynamic.literal(l10n = l10n, parseMarkup = parseMarkup)
  
    __obj.asInstanceOf[Context]
  }
}

