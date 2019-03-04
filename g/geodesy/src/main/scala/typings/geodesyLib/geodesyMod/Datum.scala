package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  var ellipsoid: Ellipsoid
  var transform: js.Tuple7[
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
}

trait datum extends js.Object

object Datum {
  @scala.inline
  def apply(
    ellipsoid: Ellipsoid,
    transform: js.Tuple7[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ]
  ): Datum = {
    val __obj = js.Dynamic.literal(ellipsoid = ellipsoid, transform = transform)
  
    __obj.asInstanceOf[Datum]
  }
}

