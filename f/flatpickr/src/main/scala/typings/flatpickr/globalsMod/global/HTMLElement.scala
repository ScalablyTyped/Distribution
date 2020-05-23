package typings.flatpickr.globalsMod.global

import typings.flatpickr.instanceMod.Instance
import typings.flatpickr.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  var _flatpickr: js.UndefOr[Instance] = js.native
  def flatpickr(): Instance = js.native
  def flatpickr(config: Options): Instance = js.native
}

