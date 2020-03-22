package typings.findUnusedSassVariables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  /** he sum of all variables in the files (unused and used ones) */
  val total: Double
  /** the array of unused variables */
  val unused: js.Array[String]
}

object Results {
  @scala.inline
  def apply(total: Double, unused: js.Array[String]): Results = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Results]
  }
}

