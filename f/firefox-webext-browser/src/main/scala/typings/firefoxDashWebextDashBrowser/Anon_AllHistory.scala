package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllHistory extends js.Object {
  /** True if all history was removed. If true, then urls will be empty. */
  var allHistory: Boolean
  var urls: js.Array[String]
}

object Anon_AllHistory {
  @scala.inline
  def apply(allHistory: Boolean, urls: js.Array[String]): Anon_AllHistory = {
    val __obj = js.Dynamic.literal(allHistory = allHistory, urls = urls)
  
    __obj.asInstanceOf[Anon_AllHistory]
  }
}

