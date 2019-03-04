package typings
package forgeDashApisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Derivatives extends js.Object {
  var derivatives: Anon_Data
  var item: js.Any
  var refs: js.Any
  var storage: Anon_DataAnonIdType
  var thumbnail: js.Any
}

object Anon_Derivatives {
  @scala.inline
  def apply(
    derivatives: Anon_Data,
    item: js.Any,
    refs: js.Any,
    storage: Anon_DataAnonIdType,
    thumbnail: js.Any
  ): Anon_Derivatives = {
    val __obj = js.Dynamic.literal(derivatives = derivatives, item = item, refs = refs, storage = storage, thumbnail = thumbnail)
  
    __obj.asInstanceOf[Anon_Derivatives]
  }
}

