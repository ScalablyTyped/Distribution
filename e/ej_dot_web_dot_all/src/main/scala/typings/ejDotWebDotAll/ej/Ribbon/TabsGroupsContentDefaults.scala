package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroupsContentDefaults extends js.Object {
  /** Specifies the controls height such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Specifies the controls size such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {false}
    */
  var isBig: js.UndefOr[Boolean] = js.undefined
  /** Specifies the controls type such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {ej.Ribbon.Type.Button}
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Specifies the controls width such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object TabsGroupsContentDefaults {
  @scala.inline
  def apply(
    height: String | Double = null,
    isBig: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    width: String | Double = null
  ): TabsGroupsContentDefaults = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isBig)) __obj.updateDynamic("isBig")(isBig.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsGroupsContentDefaults]
  }
}

