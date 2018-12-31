package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The RowColumnDefinition class describes constraints on a row or a column
  * in a Panel of type Panel.Table.
  * It also provides information about the actual layout after the
  * Table Panel has been arranged.
  */
trait RowColumnDefinition extends js.Object {
  /**This read-only property returns the usable row height or column width, after arrangement, that objects in this row or column can be placed within.*/
  var actual: scala.Double
  /**Gets or sets a default alignment for elements that are in this row or column.*/
  var alignment: Spot
  /**Gets or sets the background Brush (or CSS color string) for a particular row or column, which fills the entire span of the column, including any separatorPadding.*/
  var background: BrushLike
  /**Determines whether or not the background, if there is one, is in front of or behind the separators.*/
  var coversSeparators: scala.Boolean
  /**Gets or sets the row height.*/
  var height: scala.Double
  /**This read-only property returns which row or column this RowColumnDefinition describes in the .panel.*/
  var index: scala.Double
  /**This read-only property returns whether this describes a row or a column in the .panel.*/
  var isRow: scala.Boolean
  /**Gets or sets the maximum row height or column width.*/
  var maximum: scala.Double
  /**Gets or sets the minimum row height or column width.*/
  var minimum: scala.Double
  /**This read-only property returns the Panel that this row or column definition is in.*/
  var panel: Panel
  /**This read-only property returns the actual arranged row or column starting position, after arrangement.*/
  var position: scala.Double
  /**Gets or sets the dash array for dashing the spacing provided this row or column has a nonzero RowColumnDefinition.separatorStrokeWidth and non-null RowColumnDefinition.separatorStroke.*/
  var separatorDashArray: js.Array[scala.Double]
  /**Gets or sets the additional padding for a particular row or column, a Margin (or number for a uniform Margin).*/
  var separatorPadding: MarginLike
  /**Gets or sets the Brush (or CSS color string) for a particular row or column, provided that row or column has a nonzero RowColumnDefinition.separatorStrokeWidth.*/
  var separatorStroke: BrushLike
  /**Gets or sets the stroke width for a particular row or column's separator,*/
  var separatorStrokeWidth: scala.Double
  /**Gets or sets how this row or column deals with a Table Panel's extra space.*/
  var sizing: EnumValue
  /**Gets or sets the default stretch for elements that are in this row or column.*/
  var stretch: EnumValue
  /**This read-only property returns the total arranged row height or column width, after arrangement.*/
  var total: scala.Double
  /**Gets or sets the column width.*/
  var width: scala.Double
  /**
    * Add a data-binding of a property on this object to a property on a data object.
    * @param {Binding} binding
    */
  def bind(binding: Binding): scala.Unit
  def computeEffectiveSpacing(): scala.Double
    // undocumented
  def computeEffectiveSpacingTop(): scala.Double
}

