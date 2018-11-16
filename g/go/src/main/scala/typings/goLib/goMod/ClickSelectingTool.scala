package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * The ClickSelectingTool selects and deselects Parts when there is a click.
    * It does this by calling Tool.standardMouseSelect.
    * It is also responsible for handling and dispatching click events on GraphObjects
    * by calling Tool.standardMouseClick.
    */
@JSImport("go", "ClickSelectingTool")
@js.native
class ClickSelectingTool ()
  extends goLib.goMod.goNs.ClickSelectingTool

