package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
@JSGlobal("go.GridLayout")
@js.native
/**
  * This simple layout places all of the Parts in a grid-like arrangement, ordered, spaced apart,
  * and wrapping as needed.  It ignores any Links connecting the Nodes being laid out.
  */
open class GridLayout ()
  extends typings.go.mod.GridLayout
object GridLayout {
  
  @JSGlobal("go.GridLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**Lay out each child according to the sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSGlobal("go.GridLayout.Ascending")
  @js.native
  def Ascending: typings.go.mod.EnumValue = js.native
  inline def Ascending_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in reverse sort order given by GridLayout.comparer; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSGlobal("go.GridLayout.Descending")
  @js.native
  def Descending: typings.go.mod.EnumValue = js.native
  inline def Descending_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in the order in which they were found; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSGlobal("go.GridLayout.Forward")
  @js.native
  def Forward: typings.go.mod.EnumValue = js.native
  inline def Forward_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Forward")(x.asInstanceOf[js.Any])
  
  /**Fill each row from left to right; This value is used for GridLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.GridLayout.LeftToRight")
  @js.native
  def LeftToRight: typings.go.mod.EnumValue = js.native
  inline def LeftToRight_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftToRight")(x.asInstanceOf[js.Any])
  
  /**Position the part's Part.location at a grid point; This value is used for GridLayout.alignment.*/
  /* static member */
  @JSGlobal("go.GridLayout.Location")
  @js.native
  def Location: typings.go.mod.EnumValue = js.native
  inline def Location_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Location")(x.asInstanceOf[js.Any])
  
  /**Position the top-left corner of each part at a grid point; This value is used for GridLayout.alignment.*/
  /* static member */
  @JSGlobal("go.GridLayout.Position")
  @js.native
  def Position: typings.go.mod.EnumValue = js.native
  inline def Position_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Position")(x.asInstanceOf[js.Any])
  
  /**Lay out each child in reverse order from which they were found; This value is used for GridLayout.sorting.*/
  /* static member */
  @JSGlobal("go.GridLayout.Reverse")
  @js.native
  def Reverse: typings.go.mod.EnumValue = js.native
  inline def Reverse_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reverse")(x.asInstanceOf[js.Any])
  
  /**Fill each row from right to left; This value is used for GridLayout.arrangement.*/
  /* static member */
  @JSGlobal("go.GridLayout.RightToLeft")
  @js.native
  def RightToLeft: typings.go.mod.EnumValue = js.native
  inline def RightToLeft_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RightToLeft")(x.asInstanceOf[js.Any])
}
