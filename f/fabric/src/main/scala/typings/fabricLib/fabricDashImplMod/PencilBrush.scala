package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "PencilBrush")
@js.native
class PencilBrush () extends BaseBrush {
  /**
  	 * Converts points to SVG path
  	 * @param points Array of points
  	 */
  def convertPointsToSVGPath(points: js.Array[fabricLib.Anon_Y]): js.Array[java.lang.String] = js.native
  def convertPointsToSVGPath(points: js.Array[fabricLib.Anon_Y], minX: scala.Double): js.Array[java.lang.String] = js.native
  def convertPointsToSVGPath(points: js.Array[fabricLib.Anon_Y], minX: scala.Double, minY: scala.Double): js.Array[java.lang.String] = js.native
  /**
  	 * Creates fabric.Path object to add on canvas
  	 * @param pathData Path data
  	 */
  def createPath(pathData: java.lang.String): Path = js.native
}

