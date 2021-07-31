package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSelectPropGetters[Item] extends StObject {
  
  def getItemProps(options: UseSelectGetItemPropsOptions[Item]): js.Any = js.native
  
  def getLabelProps(): js.Any = js.native
  def getLabelProps(options: UseSelectGetLabelPropsOptions): js.Any = js.native
  
  def getMenuProps(): js.Any = js.native
  def getMenuProps(options: Unit, otherOptions: GetPropsCommonOptions): js.Any = js.native
  def getMenuProps(options: UseSelectGetMenuPropsOptions): js.Any = js.native
  def getMenuProps(options: UseSelectGetMenuPropsOptions, otherOptions: GetPropsCommonOptions): js.Any = js.native
  
  def getToggleButtonProps(): js.Any = js.native
  def getToggleButtonProps(options: Unit, otherOptions: GetPropsCommonOptions): js.Any = js.native
  def getToggleButtonProps(options: UseSelectGetToggleButtonPropsOptions): js.Any = js.native
  def getToggleButtonProps(options: UseSelectGetToggleButtonPropsOptions, otherOptions: GetPropsCommonOptions): js.Any = js.native
}
