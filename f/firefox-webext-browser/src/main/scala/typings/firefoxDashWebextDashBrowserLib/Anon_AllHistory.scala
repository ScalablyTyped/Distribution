package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllHistory extends js.Object {
  /** True if all history was removed. If true, then urls will be empty. */
  var allHistory: scala.Boolean
  var urls: js.Array[java.lang.String]
}

object Anon_AllHistory {
  @scala.inline
  def apply(allHistory: scala.Boolean, urls: js.Array[java.lang.String]): Anon_AllHistory = {
    val __obj = js.Dynamic.literal(allHistory = allHistory, urls = urls)
  
    __obj.asInstanceOf[Anon_AllHistory]
  }
}

