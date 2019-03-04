package typings
package geolibLib.geolibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassDirection extends js.Object {
  var exact: java.lang.String
  var rough: java.lang.String
}

object CompassDirection {
  @scala.inline
  def apply(exact: java.lang.String, rough: java.lang.String): CompassDirection = {
    val __obj = js.Dynamic.literal(exact = exact, rough = rough)
  
    __obj.asInstanceOf[CompassDirection]
  }
}

