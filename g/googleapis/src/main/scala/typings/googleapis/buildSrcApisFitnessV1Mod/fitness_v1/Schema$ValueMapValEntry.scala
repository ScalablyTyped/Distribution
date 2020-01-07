package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ValueMapValEntry extends js.Object {
  var key: js.UndefOr[String] = js.native
  var value: js.UndefOr[Schema$MapValue] = js.native
}

object Schema$ValueMapValEntry {
  @scala.inline
  def apply(key: String = null, value: Schema$MapValue = null): Schema$ValueMapValEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ValueMapValEntry]
  }
}

