package typings.emojiMart.sharedPropsMod

import typings.emojiMart.RecordCategoryNamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18n extends js.Object {
  var categories: RecordCategoryNamestring
  var notfound: String
  var search: String
  var skintext: String
}

object I18n {
  @scala.inline
  def apply(categories: RecordCategoryNamestring, notfound: String, search: String, skintext: String): I18n = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], notfound = notfound.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skintext = skintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
}

