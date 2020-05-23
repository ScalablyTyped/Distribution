package typings.diagnosticChannelPublishers.tediousPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITediousResult extends js.Object {
  var rowCount: Double
  var rows: js.Any
}

object ITediousResult {
  @scala.inline
  def apply(rowCount: Double, rows: js.Any): ITediousResult = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITediousResult]
  }
}

