package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TextEditingTool is used to let the user interactively edit text in place.
  * You do not normally need to create an instance of this tool
  * because one already exists as the ToolManager.clickSelectingTool.
  */
@JSGlobal("go.TextEditingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.textEditingTool, which you can modify.
  */
class TextEditingTool ()
  extends typings.go.mod.TextEditingTool
object TextEditingTool {
  
  @JSGlobal("go.TextEditingTool")
  @js.native
  val ^ : js.Any = js.native
  
  /**The user has typed ENTER.*/
  /* static member */
  @JSGlobal("go.TextEditingTool.Enter")
  @js.native
  def Enter: typings.go.mod.EnumValue = js.native
  inline def Enter_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enter")(x.asInstanceOf[js.Any])
  
  /**The text editing control has lost focus.*/
  /* static member */
  @JSGlobal("go.TextEditingTool.LostFocus")
  @js.native
  def LostFocus: typings.go.mod.EnumValue = js.native
  inline def LostFocus_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LostFocus")(x.asInstanceOf[js.Any])
  
  /**The user has clicked somewhere else in the diagram.*/
  /* static member */
  @JSGlobal("go.TextEditingTool.MouseDown")
  @js.native
  def MouseDown: typings.go.mod.EnumValue = js.native
  inline def MouseDown_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MouseDown")(x.asInstanceOf[js.Any])
  
  /**A single click on a TextBlock with TextBlock.editable property set to true will start in-place editing.*/
  /* static member */
  @JSGlobal("go.TextEditingTool.SingleClick")
  @js.native
  def SingleClick: typings.go.mod.EnumValue = js.native
  
  /**A single click on a TextBlock with TextBlock.editable property set to true will start in-place editing, but only if the Part that the TextBlock is in is already selected.*/
  /* static member */
  @JSGlobal("go.TextEditingTool.SingleClickSelected")
  @js.native
  def SingleClickSelected: typings.go.mod.EnumValue = js.native
  inline def SingleClickSelected_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SingleClickSelected")(x.asInstanceOf[js.Any])
  
  inline def SingleClick_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SingleClick")(x.asInstanceOf[js.Any])
  
  /**The user has typed TAB.*/
  /* static member */
  @JSGlobal("go.TextEditingTool.Tab")
  @js.native
  def Tab: typings.go.mod.EnumValue = js.native
  inline def Tab_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
}
