package typings.divaJs.anon

import typings.divaJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorPage extends js.Object {
  var anchorPage: Double
  var offset: Offset
}

object AnchorPage {
  @scala.inline
  def apply(anchorPage: Double, offset: Offset): AnchorPage = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorPage]
  }
}

