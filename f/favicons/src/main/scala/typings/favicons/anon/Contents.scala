package typings.favicons.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents extends js.Object {
  var contents: Buffer
  var name: String
}

object Contents {
  @scala.inline
  def apply(contents: Buffer, name: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
}

