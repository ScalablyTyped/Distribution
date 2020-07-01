package typings.gliderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EasingFunction = js.Function5[
    /* x */ scala.Double, 
    /* t */ scala.Double, 
    /* b */ scala.Double, 
    /* c */ scala.Double, 
    /* d */ scala.Double, 
    scala.Double
  ]
  type Selector = typings.std.HTMLElement | java.lang.String
}
