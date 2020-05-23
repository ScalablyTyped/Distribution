package typings.emojiMart.sharedPropsMod

import typings.emojiMart.anon.PartialRecordCategoryName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n, 'search' | 'notfound'> & {  categories  :std.Partial<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n['categories']>}> */
trait PartialI18n extends js.Object {
  var categories: js.UndefOr[PartialRecordCategoryName] = js.undefined
  var notfound: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
}

object PartialI18n {
  @scala.inline
  def apply(categories: PartialRecordCategoryName = null, notfound: String = null, search: String = null): PartialI18n = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (notfound != null) __obj.updateDynamic("notfound")(notfound.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialI18n]
  }
}

