package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropGetters[Item] extends js.Object {
  def getInputProps(): js.Any = js.native
  def getInputProps(options: GetInputPropsOptions): js.Any = js.native
  def getItemProps(options: GetItemPropsOptions[Item]): js.Any = js.native
  def getLabelProps(): js.Any = js.native
  def getLabelProps(options: GetLabelPropsOptions): js.Any = js.native
  def getMenuProps(): js.Any = js.native
  def getMenuProps(options: GetMenuPropsOptions): js.Any = js.native
  def getMenuProps(options: GetMenuPropsOptions, otherOptions: GetPropsCommonOptions): js.Any = js.native
  def getRootProps(): js.Any = js.native
  def getRootProps(options: GetRootPropsOptions): js.Any = js.native
  def getRootProps(options: GetRootPropsOptions, otherOptions: GetPropsCommonOptions): js.Any = js.native
  def getToggleButtonProps(): js.Any = js.native
  def getToggleButtonProps(options: GetToggleButtonPropsOptions): js.Any = js.native
}

