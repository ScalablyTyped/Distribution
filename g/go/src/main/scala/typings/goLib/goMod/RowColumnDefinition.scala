package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * The RowColumnDefinition class describes constraints on a row or a column
    * in a Panel of type Panel.Table.
    * It also provides information about the actual layout after the
    * Table Panel has been arranged.
    */
@JSImport("go", "RowColumnDefinition")
@js.native
class RowColumnDefinition ()
  extends goLib.goMod.goNs.RowColumnDefinition {
  /**This read-only property returns the usable row height or column width, after arrangement, that objects in this row or column can be placed within.*/
  /* CompleteClass */
  override var actual: scala.Double = js.native
  /**Gets or sets a default alignment for elements that are in this row or column.*/
  /* CompleteClass */
  override var alignment: goLib.goMod.goNs.Spot = js.native
  /**Gets or sets the background Brush (or CSS color string) for a particular row or column, which fills the entire span of the column, including any separatorPadding.*/
  /* CompleteClass */
  override var background: goLib.goMod.goNs.BrushLike = js.native
  /**Determines whether or not the background, if there is one, is in front of or behind the separators.*/
  /* CompleteClass */
  override var coversSeparators: scala.Boolean = js.native
  /**Gets or sets the row height.*/
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**This read-only property returns which row or column this RowColumnDefinition describes in the .panel.*/
  /* CompleteClass */
  override var index: scala.Double = js.native
  /**This read-only property returns whether this describes a row or a column in the .panel.*/
  /* CompleteClass */
  override var isRow: scala.Boolean = js.native
  /**Gets or sets the maximum row height or column width.*/
  /* CompleteClass */
  override var maximum: scala.Double = js.native
  /**Gets or sets the minimum row height or column width.*/
  /* CompleteClass */
  override var minimum: scala.Double = js.native
  /**This read-only property returns the Panel that this row or column definition is in.*/
  /* CompleteClass */
  override var panel: goLib.goMod.goNs.Panel = js.native
  /**This read-only property returns the actual arranged row or column starting position, after arrangement.*/
  /* CompleteClass */
  override var position: scala.Double = js.native
  /**Gets or sets the dash array for dashing the spacing provided this row or column has a nonzero RowColumnDefinition.separatorStrokeWidth and non-null RowColumnDefinition.separatorStroke.*/
  /* CompleteClass */
  override var separatorDashArray: js.Array[scala.Double] = js.native
  /**Gets or sets the additional padding for a particular row or column, a Margin (or number for a uniform Margin).*/
  /* CompleteClass */
  override var separatorPadding: goLib.goMod.goNs.MarginLike = js.native
  /**Gets or sets the Brush (or CSS color string) for a particular row or column, provided that row or column has a nonzero RowColumnDefinition.separatorStrokeWidth.*/
  /* CompleteClass */
  override var separatorStroke: goLib.goMod.goNs.BrushLike = js.native
  /**Gets or sets the stroke width for a particular row or column's separator,*/
  /* CompleteClass */
  override var separatorStrokeWidth: scala.Double = js.native
  /**Gets or sets how this row or column deals with a Table Panel's extra space.*/
  /* CompleteClass */
  override var sizing: goLib.goMod.goNs.EnumValue = js.native
  /**Gets or sets the default stretch for elements that are in this row or column.*/
  /* CompleteClass */
  override var stretch: goLib.goMod.goNs.EnumValue = js.native
  /**This read-only property returns the total arranged row height or column width, after arrangement.*/
  /* CompleteClass */
  override var total: scala.Double = js.native
  /**Gets or sets the column width.*/
  /* CompleteClass */
  override var width: scala.Double = js.native
  /**
          * Add a data-binding of a property on this object to a property on a data object.
          * @param {Binding} binding
          */
  /* CompleteClass */
  override def bind(binding: goLib.goMod.goNs.Binding): scala.Unit = js.native
  /* CompleteClass */
  override def computeEffectiveSpacing(): scala.Double = js.native
    // undocumented
  /* CompleteClass */
  override def computeEffectiveSpacingTop(): scala.Double = js.native
}

/**
    * The RowColumnDefinition class describes constraints on a row or a column
    * in a Panel of type Panel.Table.
    * It also provides information about the actual layout after the
    * Table Panel has been arranged.
    */
@JSImport("go", "RowColumnDefinition")
@js.native
object RowColumnDefinition extends js.Object {
  /**The default .sizing, which resolves to RowColumnDefinition.None or else the Table Panel's rowSizing and columnSizing if present.*/
  var Default: goLib.goMod.goNs.EnumValue = js.native
  /**The default .sizing if none is specified on the Table Panel's rowSizing and columnSizing.*/
  var None: goLib.goMod.goNs.EnumValue = js.native
  /**If a Table Panel is larger than all the rows then this .sizing grants this row and any others with the same value the extra space, apportioned proportionally between them*/
  var ProportionalExtra: goLib.goMod.goNs.EnumValue = js.native
}

