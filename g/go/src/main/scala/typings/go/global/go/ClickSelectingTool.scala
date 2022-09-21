package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ClickSelectingTool selects and deselects Parts when there is a click.
  * It does this by calling Tool.standardMouseSelect.
  * It is also responsible for handling and dispatching click events on GraphObjects
  * by calling Tool.standardMouseClick.
  */
@JSGlobal("go.ClickSelectingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.clickSelectingTool.
  */
open class ClickSelectingTool ()
  extends typings.go.mod.ClickSelectingTool
