package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object css3 {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/css3/transit.html
    *
    * Performs a transition to hide a node and show another node.
    * This module defines the transit method which is used
    * to transit the specific region of an application from
    * one view/page to another view/page. This module relies
    * on utilities provided by dojox/css3/transition for the
    * transition effects.
    *
    * @param from
    * @param to
    * @param options       OptionalThe argument to specify the transit effect and direction.The effect can be specified in options.transition. Thevalid values are 'slide', 'flip', 'fade', 'none'.The direction can be specified in options.reverse. If itis true, the transit effects will be conducted in thereverse direction to the default direction. Finally the durationof the transition can be overridden by setting the duration property.
    */
  type transit = js.Function3[
    /* from */ typings.std.HTMLElement, 
    /* to */ typings.std.HTMLElement, 
    /* options */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/css3/transition.html
    *
    * This module defines the transition utilities which can be used
    * to perform transition effects based on the CSS Transition standard.
    *
    * @param args       OptionalThe arguments which will be mixed into this transition object.
    */
  type transition = js.Function1[/* args */ js.UndefOr[js.Object], scala.Unit]
}
