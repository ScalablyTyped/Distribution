package typings.gestalt.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var __style: StringDictionary[js.UndefOr[String | Double]]
}

object Style {
  @scala.inline
  def apply(__style: StringDictionary[js.UndefOr[String | Double]]): Style = {
    val __obj = js.Dynamic.literal(__style = __style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

