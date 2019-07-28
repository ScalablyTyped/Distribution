package typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18n extends js.Object {
  var categories: Record[CategoryName, String]
  var notfound: String
  var search: String
  var skintext: String
}

object I18n {
  @scala.inline
  def apply(categories: Record[CategoryName, String], notfound: String, search: String, skintext: String): I18n = {
    val __obj = js.Dynamic.literal(categories = categories, notfound = notfound, search = search, skintext = skintext)
  
    __obj.asInstanceOf[I18n]
  }
}

