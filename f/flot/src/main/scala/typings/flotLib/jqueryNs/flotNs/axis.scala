package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait axis extends axisOptions {
  var options: axisOptions
  def c2p(canvasPoint: canvasPoint): point
  def p2c(point: point): canvasPoint
}

