package typings
package emojiDashMartLib.distDashEsUtilsSharedDashPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18n extends js.Object {
  var categories: stdLib.Record[CategoryName, java.lang.String]
  var notfound: java.lang.String
  var search: java.lang.String
  var skintext: java.lang.String
}

object I18n {
  @scala.inline
  def apply(
    categories: stdLib.Record[CategoryName, java.lang.String],
    notfound: java.lang.String,
    search: java.lang.String,
    skintext: java.lang.String
  ): I18n = {
    val __obj = js.Dynamic.literal(categories = categories, notfound = notfound, search = search, skintext = skintext)
  
    __obj.asInstanceOf[I18n]
  }
}

