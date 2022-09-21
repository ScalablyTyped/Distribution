package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropGetters[Item] extends StObject {
  
  def getInputProps[T](): T & GetInputPropsOptions = js.native
  def getInputProps[T](options: T): T & GetInputPropsOptions = js.native
  
  def getItemProps(options: GetItemPropsOptions[Item]): Any = js.native
  
  def getLabelProps(): Any = js.native
  def getLabelProps(options: GetLabelPropsOptions): Any = js.native
  
  def getMenuProps(): Any = js.native
  def getMenuProps(options: Unit, otherOptions: GetPropsCommonOptions): Any = js.native
  def getMenuProps(options: GetMenuPropsOptions): Any = js.native
  def getMenuProps(options: GetMenuPropsOptions, otherOptions: GetPropsCommonOptions): Any = js.native
  
  def getRootProps(): Any = js.native
  def getRootProps(options: Unit, otherOptions: GetPropsCommonOptions): Any = js.native
  def getRootProps(options: GetRootPropsOptions): Any = js.native
  def getRootProps(options: GetRootPropsOptions, otherOptions: GetPropsCommonOptions): Any = js.native
  
  def getToggleButtonProps(): Any = js.native
  def getToggleButtonProps(options: GetToggleButtonPropsOptions): Any = js.native
}
