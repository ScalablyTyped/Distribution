package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewItemCount extends js.Object {
  /**
    *
    */
  var newItemCount: Double
  /**
    *
    */
  var totalItemCount: Double
}

object Anon_NewItemCount {
  @scala.inline
  def apply(newItemCount: Double, totalItemCount: Double): Anon_NewItemCount = {
    val __obj = js.Dynamic.literal(newItemCount = newItemCount, totalItemCount = totalItemCount)
  
    __obj.asInstanceOf[Anon_NewItemCount]
  }
}

