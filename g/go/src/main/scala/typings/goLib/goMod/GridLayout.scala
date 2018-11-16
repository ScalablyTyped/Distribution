package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
    * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
    */
@JSImport("go", "GridLayout")
@js.native
class GridLayout ()
  extends goLib.goMod.goNs.GridLayout

/**
    * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
    * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
    */
@JSImport("go", "GridLayout")
@js.native
object GridLayout extends js.Object {
  /**Lay out each child according to the sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  var Ascending: goLib.goMod.goNs.EnumValue = js.native
  /**Lay out each child in reverse sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  var Descending: goLib.goMod.goNs.EnumValue = js.native
  /**Lay out each child in the order in which they were found; This value is used for GridLayout.sorting.*/
  var Forward: goLib.goMod.goNs.EnumValue = js.native
  /**Fill each row from left to right; This value is used for GridLayout.arrangement.*/
  var LeftToRight: goLib.goMod.goNs.EnumValue = js.native
  /**Position the part's Part.location at a grid point; This value is used for GridLayout.alignment.*/
  var Location: goLib.goMod.goNs.EnumValue = js.native
  /**Position the top-left corner of each part at a grid point; This value is used for GridLayout.alignment.*/
  var Position: goLib.goMod.goNs.EnumValue = js.native
  /**Lay out each child in reverse order from which they were found; This value is used for GridLayout.sorting.*/
  var Reverse: goLib.goMod.goNs.EnumValue = js.native
  /**Fill each row from right to left; This value is used for GridLayout.arrangement.*/
  var RightToLeft: goLib.goMod.goNs.EnumValue = js.native
}

