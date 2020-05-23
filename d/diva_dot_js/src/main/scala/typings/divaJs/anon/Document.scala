package typings.divaJs.anon

import typings.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var document: Region
  var page: Region
}

object Document {
  @scala.inline
  def apply(document: Region, page: Region): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

