package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * This abstract class is the base class for the LinkingTool and RelinkingTool classes.
    * This class includes properties for defining and accessing any temporary nodes and temporary link
    * that are used during any linking operation, as well as access to the existing diagram's nodes and link
    * (if any) that are involved with the linking operation.
    */
@JSImport("go", "LinkingBaseTool")
@js.native
abstract class LinkingBaseTool ()
  extends goLib.goMod.goNs.LinkingBaseTool

