package typings.favicons

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contents extends js.Object {
  var contents: Buffer
  var name: String
}

object Anon_Contents {
  @scala.inline
  def apply(contents: Buffer, name: String): Anon_Contents = {
    val __obj = js.Dynamic.literal(contents = contents, name = name)
  
    __obj.asInstanceOf[Anon_Contents]
  }
}

