package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  */
@JSGlobal("go.LinkingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.linkingTool, which you can modify.
  */
class LinkingTool ()
  extends typings.go.mod.LinkingTool
object LinkingTool {
  
  @JSGlobal("go.LinkingTool")
  @js.native
  val ^ : js.Any = js.native
  
  /**This value for LinkingTool.direction indicates that users may draw new links backwards only.*/
  /* static member */
  @JSGlobal("go.LinkingTool.BackwardsOnly")
  @js.native
  def BackwardsOnly: typings.go.mod.EnumValue = js.native
  inline def BackwardsOnly_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BackwardsOnly")(x.asInstanceOf[js.Any])
  
  /**This value for LinkingTool.direction indicates that users may draw new links in either direction.*/
  /* static member */
  @JSGlobal("go.LinkingTool.Either")
  @js.native
  def Either: typings.go.mod.EnumValue = js.native
  inline def Either_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Either")(x.asInstanceOf[js.Any])
  
  /**This value for LinkingTool.direction indicates that users may draw new links forwards only.*/
  /* static member */
  @JSGlobal("go.LinkingTool.ForwardsOnly")
  @js.native
  def ForwardsOnly: typings.go.mod.EnumValue = js.native
  inline def ForwardsOnly_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForwardsOnly")(x.asInstanceOf[js.Any])
}
