package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueMapValEntry extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[MapValue] = js.undefined
}

object ValueMapValEntry {
  @scala.inline
  def apply(key: String = null, value: MapValue = null): ValueMapValEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueMapValEntry]
  }
}

