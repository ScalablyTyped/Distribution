package typings
package forgeDashApisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Anon_Id
  var meta: Anon_Link
}

object Anon_Data {
  @scala.inline
  def apply(data: Anon_Id, meta: Anon_Link): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[Anon_Data]
  }
}

