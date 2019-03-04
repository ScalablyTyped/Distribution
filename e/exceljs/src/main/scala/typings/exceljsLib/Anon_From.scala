package typings
package exceljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: java.lang.String | Anon_Column
  var to: java.lang.String | Anon_Column
}

object Anon_From {
  @scala.inline
  def apply(from: java.lang.String | Anon_Column, to: java.lang.String | Anon_Column): Anon_From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_From]
  }
}

