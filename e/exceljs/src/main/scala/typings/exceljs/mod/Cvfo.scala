package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cvfo extends js.Object {
  var `type`: CfvoTypes
  var value: js.UndefOr[Double] = js.undefined
}

object Cvfo {
  @scala.inline
  def apply(`type`: CfvoTypes, value: js.UndefOr[Double] = js.undefined): Cvfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cvfo]
  }
}

