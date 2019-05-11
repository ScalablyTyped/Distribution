package typings
package googleDashGaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Finish extends js.Object {
  def finish(): js.Array[js.Object]
}

object Anon_Finish {
  @scala.inline
  def apply(finish: () => js.Array[js.Object]): Anon_Finish = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction0(finish))
  
    __obj.asInstanceOf[Anon_Finish]
  }
}

