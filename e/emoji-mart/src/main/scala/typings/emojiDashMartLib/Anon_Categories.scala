package typings
package emojiDashMartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Categories extends js.Object {
  var categories: stdLib.Partial[
    stdLib.Record[emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.CategoryName, java.lang.String]
  ]
}

object Anon_Categories {
  @scala.inline
  def apply(
    categories: stdLib.Partial[
      stdLib.Record[emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.CategoryName, java.lang.String]
    ]
  ): Anon_Categories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("categories")(categories)
    __obj.asInstanceOf[Anon_Categories]
  }
}

