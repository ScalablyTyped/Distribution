package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The LinkReshapingTool is used to interactively change the route of a Link.
  * This tool makes use of an Adornment, shown when the adorned Link is selected,
  * that includes some number of reshape handles.
  * This tool conducts a transaction while the tool is active.
  * A successful reshaping will result in a "LinkReshaped" DiagramEvent and a "LinkReshaping" transaction.
  */
@JSGlobal("go.LinkReshapingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.linkReshapingTool, which you can modify.
  */
open class LinkReshapingTool ()
  extends typings.go.mod.LinkReshapingTool
object LinkReshapingTool {
  
  @JSGlobal("go.LinkReshapingTool")
  @js.native
  val ^ : js.Any = js.native
  
  /**Allow dragging in any direction.*/
  /* static member */
  @JSGlobal("go.LinkReshapingTool.All")
  @js.native
  def All: typings.go.mod.EnumValue = js.native
  inline def All_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
  
  /**Allow only horizontal (left-and-right) dragging.*/
  /* static member */
  @JSGlobal("go.LinkReshapingTool.Horizontal")
  @js.native
  def Horizontal: typings.go.mod.EnumValue = js.native
  inline def Horizontal_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  /**Disallow dragging.*/
  /* static member */
  @JSGlobal("go.LinkReshapingTool.None")
  @js.native
  def None: typings.go.mod.EnumValue = js.native
  inline def None_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**Allow only vertical (up-and-down) dragging.*/
  /* static member */
  @JSGlobal("go.LinkReshapingTool.Vertical")
  @js.native
  def Vertical: typings.go.mod.EnumValue = js.native
  inline def Vertical_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
}
