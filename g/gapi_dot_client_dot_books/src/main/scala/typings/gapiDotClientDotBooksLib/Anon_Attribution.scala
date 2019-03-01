package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribution extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Attribution {
  @scala.inline
  def apply(attribution: java.lang.String = null, url: java.lang.String = null): Anon_Attribution = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Attribution]
  }
}

