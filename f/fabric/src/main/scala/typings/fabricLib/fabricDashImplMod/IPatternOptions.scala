package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPatternOptions extends js.Object {
  /**
  	 * Pattern horizontal offset from object's left/top corner
  	 */
  var offsetX: scala.Double
  /**
  	 * Pattern vertical offset from object's left/top corner
  	 */
  var offsetY: scala.Double
  /**
  	 * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
  	 */
  var repeat: java.lang.String
  /**
  	 * The source for the pattern
  	 */
  var source: java.lang.String | stdLib.HTMLImageElement
}

