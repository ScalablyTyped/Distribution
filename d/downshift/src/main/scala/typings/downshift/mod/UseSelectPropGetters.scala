package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSelectPropGetters[Item] extends js.Object {
  def getItemProps(options: GetItemPropsOptions[Item]): js.Any = js.native
  def getLabelProps(): js.Any = js.native
  def getLabelProps(options: GetLabelPropsOptions): js.Any = js.native
  def getMenuProps(): js.Any = js.native
  def getMenuProps(options: GetMenuPropsOptions): js.Any = js.native
  def getMenuProps(options: GetMenuPropsOptions, otherOptions: GetPropsCommonOptions): js.Any = js.native
  def getToggleButtonProps(): js.Any = js.native
  def getToggleButtonProps(options: GetToggleButtonPropsOptions): js.Any = js.native
}

