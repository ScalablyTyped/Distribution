package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the file manager's FileManagerToolbarItemBase object.
  */
trait ASPxClientFileManagerToolbarItem extends ASPxClientMenuItem

object ASPxClientFileManagerToolbarItem {
  @scala.inline
  def apply(
    GetChecked: () => scala.Boolean,
    GetEnabled: () => scala.Boolean,
    GetImageUrl: () => java.lang.String,
    GetItem: scala.Double => ASPxClientMenuItem,
    GetItemByName: java.lang.String => ASPxClientMenuItem,
    GetItemCount: () => scala.Double,
    GetNavigateUrl: () => java.lang.String,
    GetText: () => java.lang.String,
    GetVisible: () => scala.Boolean,
    SetChecked: scala.Boolean => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetImageUrl: java.lang.String => scala.Unit,
    SetNavigateUrl: java.lang.String => scala.Unit,
    SetText: java.lang.String => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    index: scala.Double,
    indexPath: java.lang.String,
    menu: ASPxClientMenuBase,
    name: java.lang.String,
    parent: ASPxClientMenuItem
  ): ASPxClientFileManagerToolbarItem = {
    val __obj = js.Dynamic.literal(GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index, indexPath = indexPath, menu = menu, name = name, parent = parent)
  
    __obj.asInstanceOf[ASPxClientFileManagerToolbarItem]
  }
}

