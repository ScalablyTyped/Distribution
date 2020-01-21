package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fx {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/scroll.html
    *
    * Returns an animation that will smooth-scroll to a node
    * This implementation support either horizontal or vertical scroll, as well as
    * both. In addition, element in iframe can be scrolled to correctly.
    *
    * @param args offset: {x: int, y: int} this will be added to the target positionduration: Duration of the animation in milliseconds.win: a node or window object to scroll
    */
  type scroll = js.Function1[/* args */ js.Object, scala.Unit]
}
