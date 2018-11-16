package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectorsTargetDecorator extends js.Object {
  /** Sets the border color of the decorator
               * @Default {black}
               */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** This property allows you to customize targetDecorator appearance using user-defined CSS.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the color with which the decorator will be filled
               * @Default {black}
               */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the height of the target decorator
               * @Default {8}
               */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Defines the custom shape of the target decorator
               */
  var pathData: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the shape of the target decorator.
               * @Default {ej.datavisualization.Diagram.DecoratorShapes.Arrow}
               */
  var shape: js.UndefOr[DecoratorShapes | java.lang.String] = js.undefined
  /** Defines the width of the target decorator
               * @Default {8}
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

