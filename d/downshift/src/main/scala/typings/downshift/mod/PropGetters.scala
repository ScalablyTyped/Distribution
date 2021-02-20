package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropGetters[Item] extends StObject {
  
  def getInputProps[T](): T with GetInputPropsOptions = js.native
  def getInputProps[T](options: T): T with GetInputPropsOptions = js.native
  
  def getItemProps(options: GetItemPropsOptions[Item]): js.Any = js.native
  
  def getLabelProps(): js.Any = js.native
  def getLabelProps(options: GetLabelPropsOptions): js.Any = js.native
  
  def getMenuProps(): js.Any = js.native
  def getMenuProps(options: js.UndefOr[scala.Nothing], otherOptions: GetPropsCommonOptions): js.Any = js.native
  def getMenuProps(options: GetMenuPropsOptions): js.Any = js.native
  def getMenuProps(options: GetMenuPropsOptions, otherOptions: GetPropsCommonOptions): js.Any = js.native
  
  def getRootProps(): js.Any = js.native
  def getRootProps(options: js.UndefOr[scala.Nothing], otherOptions: GetPropsCommonOptions): js.Any = js.native
  def getRootProps(options: GetRootPropsOptions): js.Any = js.native
  def getRootProps(options: GetRootPropsOptions, otherOptions: GetPropsCommonOptions): js.Any = js.native
  
  def getToggleButtonProps(): js.Any = js.native
  def getToggleButtonProps(options: GetToggleButtonPropsOptions): js.Any = js.native
}
