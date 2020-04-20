package typings.diagnosticChannelPublishers.bunyanPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBunyanData extends js.Object {
  var level: Double
  var result: String
}

object IBunyanData {
  @scala.inline
  def apply(level: Double, result: String): IBunyanData = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBunyanData]
  }
}

