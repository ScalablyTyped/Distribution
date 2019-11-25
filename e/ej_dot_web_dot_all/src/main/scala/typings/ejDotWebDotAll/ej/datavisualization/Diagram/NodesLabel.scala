package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesLabel extends js.Object {
  /** Enables/disables the bold style
    * @Default {false}
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /** Sets the border color of the label
    * @Default {transparent}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Sets the border width of the label
    * @Default {0}
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /** Enables or disables the default behaviors of the label.
    * @Default {ej.datavisualization.Diagram.LabelConstraints.None}
    */
  var constraints: js.UndefOr[LabelConstraints | String] = js.undefined
  /** This property allows you to customize labels appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Sets the fill color of the text area
    * @Default {transparent}
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /** Sets the font color of the text
    * @Default {black}
    */
  var fontColor: js.UndefOr[String] = js.undefined
  /** Sets the font family of the text
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Defines the font size of the text
    * @Default {12}
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /** Sets the height of the label(the maximum value of label height and the node height will be considered as label height)
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Sets the horizontal alignment of the label.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.undefined
  /** Enables/disables the italic style
    * @Default {false}
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /** To set the margin of the label
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** Gets whether the label is currently being edited or not.
    * @Default {ej.datavisualization.Diagram.LabelEditMode.Edit}
    */
  var mode: js.UndefOr[LabelEditMode | String] = js.undefined
  /** Sets the unique identifier of the label
    */
  var name: js.UndefOr[String] = js.undefined
  /** Sets the fraction/ratio(relative to node) that defines the position of the label
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** Defines the transparency of the labels
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Sets the overflowType of the labels
    * @Default {ej.datavisualization.Diagram.OverflowType.Ellipsis}
    */
  var overflowType: js.UndefOr[OverflowType | String] = js.undefined
  /** To set the padding of the node label
    * @Default {ej.datavisualization.Diagram.Padding()}
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** Defines whether the label is editable or not
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Defines the angle to which the label needs to be rotated
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[Double] = js.undefined
  /** Sets the id of svg/html templates. Applicable, if the node's label is HTML or native.
    */
  var templateId: js.UndefOr[String] = js.undefined
  /** Defines the label text
    */
  var text: js.UndefOr[String] = js.undefined
  /** Defines how to align the text inside the label.
    * @Default {ej.datavisualization.Diagram.TextAlign.Center}
    */
  var textAlign: js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign | String] = js.undefined
  /** Sets how to decorate the label text.
    * @Default {ej.datavisualization.Diagram.TextDecorations.None}
    */
  var textDecoration: js.UndefOr[TextDecorations | String] = js.undefined
  /** Defines the overflowed content is displayed or not.
    * @Default {false}
    */
  var textOverflow: js.UndefOr[Boolean] = js.undefined
  /** Sets the vertical alignment of the label.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.undefined
  /** Enables or disables the visibility of the label
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Sets the width of the label(the maximum value of label width and the node width will be considered as label width)
    * @Default {50}
    */
  var width: js.UndefOr[Double] = js.undefined
  /** Defines how the label text needs to be wrapped.
    * @Default {ej.datavisualization.Diagram.TextWrapping.WrapWithOverflow}
    */
  var wrapping: js.UndefOr[TextWrapping | String] = js.undefined
}

object NodesLabel {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    borderColor: String = null,
    borderWidth: Int | Double = null,
    constraints: LabelConstraints | String = null,
    cssClass: String = null,
    fillColor: String = null,
    fontColor: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    height: Int | Double = null,
    horizontalAlignment: HorizontalAlignment | String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    margin: js.Any = null,
    mode: LabelEditMode | String = null,
    name: String = null,
    offset: js.Any = null,
    opacity: Int | Double = null,
    overflowType: OverflowType | String = null,
    padding: js.Any = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rotateAngle: Int | Double = null,
    templateId: String = null,
    text: String = null,
    textAlign: typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign | String = null,
    textDecoration: TextDecorations | String = null,
    textOverflow: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: VerticalAlignment | String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    wrapping: TextWrapping | String = null
  ): NodesLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overflowType != null) __obj.updateDynamic("overflowType")(overflowType.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (rotateAngle != null) __obj.updateDynamic("rotateAngle")(rotateAngle.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (!js.isUndefined(textOverflow)) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapping != null) __obj.updateDynamic("wrapping")(wrapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesLabel]
  }
}

