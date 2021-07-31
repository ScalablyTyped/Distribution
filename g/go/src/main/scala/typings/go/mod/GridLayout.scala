package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
@JSImport("go", "GridLayout")
@js.native
/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
class GridLayout () extends Layout {
  
  /**Gets or sets whether the Part.location or the position should be used to arrange each part.*/
  var alignment: EnumValue = js.native
  
  /**Gets or sets how to arrange the parts.*/
  var arrangement: EnumValue = js.native
  
  /**Gets or sets the minimum part size by which each part is positioned in the grid.*/
  var cellSize: Size = js.native
  
  /**Gets or sets the comparison function used to sort the parts.*/
  def comparer(a: Part, b: Part): Double = js.native
  
  /**Gets or sets what order to place the parts.*/
  var sorting: EnumValue = js.native
  
  /**Gets or sets the minimum horizontal and vertical space between parts.*/
  var spacing: Size = js.native
  
  /**Gets or sets the maximum number of columns.*/
  var wrappingColumn: Double = js.native
  
  /**Gets or sets the wrapping width.*/
  var wrappingWidth: Double = js.native
}
object GridLayout {
  
  @JSImport("go", "GridLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**Lay out each child according to the sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSImport("go", "GridLayout.Ascending")
  @js.native
  def Ascending: EnumValue = js.native
  @scala.inline
  def Ascending_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in reverse sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSImport("go", "GridLayout.Descending")
  @js.native
  def Descending: EnumValue = js.native
  @scala.inline
  def Descending_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in the order in which they were found; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSImport("go", "GridLayout.Forward")
  @js.native
  def Forward: EnumValue = js.native
  @scala.inline
  def Forward_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Forward")(x.asInstanceOf[js.Any])
  
  /**Fill each row from left to right; This value is used for GridLayout.arrangement.*/
  /* static member */
  @JSImport("go", "GridLayout.LeftToRight")
  @js.native
  def LeftToRight: EnumValue = js.native
  @scala.inline
  def LeftToRight_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftToRight")(x.asInstanceOf[js.Any])
  
  /**Position the part's Part.location at a grid point; This value is used for GridLayout.alignment.*/
  /* static member */
  @JSImport("go", "GridLayout.Location")
  @js.native
  def Location: EnumValue = js.native
  @scala.inline
  def Location_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Location")(x.asInstanceOf[js.Any])
  
  /**Position the top-left corner of each part at a grid point; This value is used for GridLayout.alignment.*/
  /* static member */
  @JSImport("go", "GridLayout.Position")
  @js.native
  def Position: EnumValue = js.native
  @scala.inline
  def Position_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Position")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in reverse order from which they were found; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSImport("go", "GridLayout.Reverse")
  @js.native
  def Reverse: EnumValue = js.native
  @scala.inline
  def Reverse_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reverse")(x.asInstanceOf[js.Any])
  
  /**Fill each row from right to left; This value is used for GridLayout.arrangement.*/
  /* static member */
  @JSImport("go", "GridLayout.RightToLeft")
  @js.native
  def RightToLeft: EnumValue = js.native
  @scala.inline
  def RightToLeft_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightToLeft")(x.asInstanceOf[js.Any])
}
