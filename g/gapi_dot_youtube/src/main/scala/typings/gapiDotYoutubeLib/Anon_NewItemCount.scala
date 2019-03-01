package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewItemCount extends js.Object {
  /**
    *
    */
  var newItemCount: scala.Double
  /**
    *
    */
  var totalItemCount: scala.Double
}

object Anon_NewItemCount {
  @scala.inline
  def apply(newItemCount: scala.Double, totalItemCount: scala.Double): Anon_NewItemCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newItemCount")(newItemCount)
    __obj.updateDynamic("totalItemCount")(totalItemCount)
    __obj.asInstanceOf[Anon_NewItemCount]
  }
}

