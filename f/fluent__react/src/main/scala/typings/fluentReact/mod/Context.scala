package typings.fluentReact.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var l10n: ReactLocalization
  var parseMarkup: MarkupParser
}

object Context {
  @scala.inline
  def apply(l10n: ReactLocalization, parseMarkup: /* str */ String => js.Array[Node]): Context = {
    val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any], parseMarkup = js.Any.fromFunction1(parseMarkup))
  
    __obj.asInstanceOf[Context]
  }
}

