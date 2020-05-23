package typings.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexString extends js.Object {
  var index: String
}

object IndexString {
  @scala.inline
  def apply(index: String): IndexString = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexString]
  }
}

