package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RowColumnDefinition class describes constraints on a row or a column
  * in a Panel of type Panel.Table.
  * It also provides information about the actual layout after the
  * Table Panel has been arranged.
  */
@JSImport("go", "RowColumnDefinition")
@js.native
/**
  * You do not need to use this constructor, because calls to Panel.getRowDefinition or Panel.getColumnDefinition will automatically create and remember a RowColumnDefinition for you.
  */
open class RowColumnDefinition () extends StObject {
  
  /**This read-only property returns the usable row height or column width, after arrangement, that objects in this row or column can be placed within.*/
  var actual: Double = js.native
  
  /**Gets or sets a default alignment for elements that are in this row or column.*/
  var alignment: Spot = js.native
  
  /**Gets or sets the background Brush (or CSS color string) for a particular row or column, which fills the entire span of the column, including any separatorPadding.*/
  var background: BrushLike = js.native
  
  /**
    * Add a data-binding of a property on this object to a property on a data object.
    * @param {Binding} binding
    */
  def bind(binding: Binding): Unit = js.native
  
  def computeEffectiveSpacing(): Double = js.native
  
  // undocumented
  def computeEffectiveSpacingTop(): Double = js.native
  
  /**Determines whether or not the background, if there is one, is in front of or behind the separators.*/
  var coversSeparators: Boolean = js.native
  
  /**Gets or sets the row height.*/
  var height: Double = js.native
  
  /**This read-only property returns which row or column this RowColumnDefinition describes in the .panel.*/
  var index: Double = js.native
  
  /**This read-only property returns whether this describes a row or a column in the .panel.*/
  var isRow: Boolean = js.native
  
  /**Gets or sets the maximum row height or column width.*/
  var maximum: Double = js.native
  
  /**Gets or sets the minimum row height or column width.*/
  var minimum: Double = js.native
  
  /**This read-only property returns the Panel that this row or column definition is in.*/
  var panel: Panel = js.native
  
  /**This read-only property returns the actual arranged row or column starting position, after arrangement.*/
  var position: Double = js.native
  
  /**Gets or sets the dash array for dashing the spacing provided this row or column has a nonzero RowColumnDefinition.separatorStrokeWidth and non-null RowColumnDefinition.separatorStroke.*/
  var separatorDashArray: js.Array[Double] = js.native
  
  /**Gets or sets the additional padding for a particular row or column, a Margin (or number for a uniform Margin).*/
  var separatorPadding: MarginLike = js.native
  
  /**Gets or sets the Brush (or CSS color string) for a particular row or column, provided that row or column has a nonzero RowColumnDefinition.separatorStrokeWidth.*/
  var separatorStroke: BrushLike = js.native
  
  /**Gets or sets the stroke width for a particular row or column's separator,*/
  var separatorStrokeWidth: Double = js.native
  
  /**Gets or sets how this row or column deals with a Table Panel's extra space.*/
  var sizing: EnumValue = js.native
  
  /**Gets or sets the default stretch for elements that are in this row or column.*/
  var stretch: EnumValue = js.native
  
  /**This read-only property returns the total arranged row height or column width, after arrangement.*/
  var total: Double = js.native
  
  /**Gets or sets the column width.*/
  var width: Double = js.native
}
object RowColumnDefinition {
  
  @JSImport("go", "RowColumnDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  /**The default .sizing, which resolves to RowColumnDefinition.None or else the Table Panel's rowSizing and columnSizing if present.*/
  /* static member */
  @JSImport("go", "RowColumnDefinition.Default")
  @js.native
  def Default: EnumValue = js.native
  inline def Default_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /**The default .sizing if none is specified on the Table Panel's rowSizing and columnSizing.*/
  /* static member */
  @JSImport("go", "RowColumnDefinition.None")
  @js.native
  def None: EnumValue = js.native
  inline def None_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**If a Table Panel is larger than all the rows then this .sizing grants this row and any others with the same value the extra space, apportioned proportionally between them*/
  /* static member */
  @JSImport("go", "RowColumnDefinition.ProportionalExtra")
  @js.native
  def ProportionalExtra: EnumValue = js.native
  inline def ProportionalExtra_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProportionalExtra")(x.asInstanceOf[js.Any])
}
