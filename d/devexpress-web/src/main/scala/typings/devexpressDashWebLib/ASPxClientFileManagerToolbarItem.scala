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
    GetChecked: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetImageUrl: js.Function0[java.lang.String],
    GetItem: js.Function1[scala.Double, ASPxClientMenuItem],
    GetItemByName: js.Function1[java.lang.String, ASPxClientMenuItem],
    GetItemCount: js.Function0[scala.Double],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetChecked: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    indexPath: java.lang.String,
    menu: ASPxClientMenuBase,
    name: java.lang.String,
    parent: ASPxClientMenuItem
  ): ASPxClientFileManagerToolbarItem = {
    val __obj = js.Dynamic.literal(GetChecked = GetChecked, GetEnabled = GetEnabled, GetImageUrl = GetImageUrl, GetItem = GetItem, GetItemByName = GetItemByName, GetItemCount = GetItemCount, GetNavigateUrl = GetNavigateUrl, GetText = GetText, GetVisible = GetVisible, SetChecked = SetChecked, SetEnabled = SetEnabled, SetImageUrl = SetImageUrl, SetNavigateUrl = SetNavigateUrl, SetText = SetText, SetVisible = SetVisible, index = index, indexPath = indexPath, menu = menu, name = name, parent = parent)
  
    __obj.asInstanceOf[ASPxClientFileManagerToolbarItem]
  }
}

