package typings
package gfcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contents extends js.Object {
  var contents: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
}

object Anon_Contents {
  @scala.inline
  def apply(path: java.lang.String, contents: java.lang.String = null): Anon_Contents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (contents != null) __obj.updateDynamic("contents")(contents)
    __obj.asInstanceOf[Anon_Contents]
  }
}

