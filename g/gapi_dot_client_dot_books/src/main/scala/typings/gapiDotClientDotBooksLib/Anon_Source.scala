package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Source extends js.Object {
  var source: js.UndefOr[Anon_Attribution] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Source {
  @scala.inline
  def apply(source: Anon_Attribution = null, text: java.lang.String = null): Anon_Source = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Source]
  }
}

