package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The RelinkingTool allows the user to reconnect an existing Link
  * if the Link.relinkableTo and/or Link.relinkableFrom properties are true.
  */
@JSImport("go", "RelinkingTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.relinkingTool, which you can modify.
  */
class RelinkingTool ()
  extends goLib.goMod.goNs.RelinkingTool

