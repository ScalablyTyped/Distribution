package typings.divaJs

import typings.divaJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnchorPage extends js.Object {
  var anchorPage: Double
  var offset: Offset
}

object AnonAnchorPage {
  @scala.inline
  def apply(anchorPage: Double, offset: Offset): AnonAnchorPage = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchorPage]
  }
}

