package typings.divaJs

import typings.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocument extends js.Object {
  var document: Region
  var page: Region
}

object AnonDocument {
  @scala.inline
  def apply(document: Region, page: Region): AnonDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocument]
  }
}

