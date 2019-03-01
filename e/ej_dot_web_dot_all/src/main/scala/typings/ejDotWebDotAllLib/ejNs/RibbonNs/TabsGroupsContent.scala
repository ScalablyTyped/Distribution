package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroupsContent extends js.Object {
  /** Specifies the height, width, type, isBig property to the controls in the group commonly.
    * @Default {Object}
    */
  var defaults: js.UndefOr[TabsGroupsContentDefaults] = js.undefined
  /** Specifies the controls such as Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls in the subgroup of the ribbon tab .
    * @Default {Array}
    */
  var groups: js.UndefOr[js.Array[TabsGroupsContentGroup]] = js.undefined
}

object TabsGroupsContent {
  @scala.inline
  def apply(defaults: TabsGroupsContentDefaults = null, groups: js.Array[TabsGroupsContentGroup] = null): TabsGroupsContent = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    __obj.asInstanceOf[TabsGroupsContent]
  }
}

