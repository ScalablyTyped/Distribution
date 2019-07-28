package typings.gfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contents extends js.Object {
  var contents: js.UndefOr[String] = js.undefined
  var path: String
}

object Anon_Contents {
  @scala.inline
  def apply(path: String, contents: String = null): Anon_Contents = {
    val __obj = js.Dynamic.literal(path = path)
    if (contents != null) __obj.updateDynamic("contents")(contents)
    __obj.asInstanceOf[Anon_Contents]
  }
}

