package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "PatternBrush")
@js.native
class PatternBrush () extends PencilBrush {
  /**
  	 * Creates "pattern" instance property
  	 */
  def getPattern(): js.Any = js.native
  def getPatternSrc(): stdLib.HTMLCanvasElement = js.native
  def getPatternSrcFunction(): java.lang.String = js.native
}

