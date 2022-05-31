package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Panel is a GraphObject that holds other GraphObjects as its elements.
  * A Panel is responsible for sizing and positioning its elements.
  * Every Panel has a .type and establishes its own coordinate system. The .type of a Panel
  * determines how it will size and arrange its elements.
  */
@JSGlobal("go.Panel")
@js.native
/**
  * Constructs an empty Panel of the given .type.
  * @param {EnumValue=} type If not supplied, the default Panel type is Panel.Position.
  */
class Panel ()
  extends typings.go.mod.Panel {
  def this(`type`: typings.go.mod.EnumValue) = this()
}
object Panel {
  
  @JSGlobal("go.Panel")
  @js.native
  val ^ : js.Any = js.native
  
  /**This value for .type resizes the main element to fit around the other elements; the main element is the first GraphObject with GraphObject.isPanelMain set to true, or else the first GraphObject if none have that property set to true.*/
  /* static member */
  @JSGlobal("go.Panel.Auto")
  @js.native
  def Auto: typings.go.mod.EnumValue = js.native
  inline def Auto_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Auto")(x.asInstanceOf[js.Any])
  
  /**This value for .type is used to draw regular patterns of lines.*/
  /* static member */
  @JSGlobal("go.Panel.Grid")
  @js.native
  def Grid: typings.go.mod.EnumValue = js.native
  inline def Grid_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Grid")(x.asInstanceOf[js.Any])
  
  /**This value for .type lays out the elements horizontally with their GraphObject.alignment property dictating their alignment on the Y-axis.*/
  /* static member */
  @JSGlobal("go.Panel.Horizontal")
  @js.native
  def Horizontal: typings.go.mod.EnumValue = js.native
  inline def Horizontal_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  /**This value for .type is used for Links and adornments that act as Links.*/
  /* static member */
  @JSGlobal("go.Panel.Link")
  @js.native
  def Link: typings.go.mod.EnumValue = js.native
  inline def Link_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
  
  /**The default .type arranges each element according to their GraphObject.position.*/
  /* static member */
  @JSGlobal("go.Panel.Position")
  @js.native
  def Position: typings.go.mod.EnumValue = js.native
  inline def Position_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Position")(x.asInstanceOf[js.Any])
  
  /**This value for .type arranges GraphObjects about a main element using the GraphObject.alignment and GraphObject.alignmentFocus properties; the main element is the first GraphObject with GraphObject.isPanelMain set to true, or else the first GraphObject if none have that property set to true.*/
  /* static member */
  @JSGlobal("go.Panel.Spot")
  @js.native
  def Spot: typings.go.mod.EnumValue = js.native
  inline def Spot_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Spot")(x.asInstanceOf[js.Any])
  
  /**This value for .type arranges GraphObjects into rows and columns; set the GraphObject.row and GraphObject.column properties on each element.*/
  /* static member */
  @JSGlobal("go.Panel.Table")
  @js.native
  def Table: typings.go.mod.EnumValue = js.native
  
  /**Organizational Panel type that is only valid inside of a Table panel.*/
  /* static member */
  @JSGlobal("go.Panel.TableColumn")
  @js.native
  def TableColumn: typings.go.mod.EnumValue = js.native
  inline def TableColumn_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TableColumn")(x.asInstanceOf[js.Any])
  
  /**Organizational Panel type that is only valid inside of a Table panel.*/
  /* static member */
  @JSGlobal("go.Panel.TableRow")
  @js.native
  def TableRow: typings.go.mod.EnumValue = js.native
  inline def TableRow_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TableRow")(x.asInstanceOf[js.Any])
  
  inline def Table_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Table")(x.asInstanceOf[js.Any])
  
  /**This value for .type lays out the elements vertically with their GraphObject.alignment property dictating their alignment on the X-axis.*/
  /* static member */
  @JSGlobal("go.Panel.Vertical")
  @js.native
  def Vertical: typings.go.mod.EnumValue = js.native
  inline def Vertical_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
  
  /**This value for .type rescales a single GraphObject to fit inside the panel depending on the element's GraphObject.stretch property.*/
  /* static member */
  @JSGlobal("go.Panel.Viewbox")
  @js.native
  def Viewbox: typings.go.mod.EnumValue = js.native
  inline def Viewbox_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Viewbox")(x.asInstanceOf[js.Any])
}
