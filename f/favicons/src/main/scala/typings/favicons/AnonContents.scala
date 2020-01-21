package typings.favicons

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContents extends js.Object {
  var contents: Buffer
  var name: String
}

object AnonContents {
  @scala.inline
  def apply(contents: Buffer, name: String): AnonContents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContents]
  }
}

