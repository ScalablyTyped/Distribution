package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LeafItemSettings extends js.Object {
  /** Specifies the border brush color of the leaf item.
               * @Default {white}
               */
  var borderBrush: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the border thickness of the leaf item.
               * @Default {1}
               */
  var borderThickness: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the space between the leaf items.
               * @Default {0}
               */
  var gap: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the label template of the leaf item.
               * @Default {null}
               */
  var itemTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the label path of the leaf item.
               * @Default {null}
               */
  var labelPath: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the position of the leaf labels.
               * @Default {center}
               */
  var labelPosition: js.UndefOr[Position | java.lang.String] = js.undefined
  /** Specifies the mode of label visibility
               * @Default {visible}
               */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | java.lang.String] = js.undefined
  /** Shows or hides the label of the leaf item.
               * @Default {false}
               */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the overflow options for leaf labels.
               * @Default {none}
               */
  var textOverflow: js.UndefOr[TextOverflow | java.lang.String] = js.undefined
}

