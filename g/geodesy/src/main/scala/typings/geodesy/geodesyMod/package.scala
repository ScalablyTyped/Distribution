package typings.geodesy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geodesyMod {
  import org.scalablytyped.runtime.StringDictionary

  type Datums = Plural[Datum]
  type Ellipsoids = Plural[Ellipsoid]
  type Plural[T] = StringDictionary[T]
  type Polygon[T] = js.Array[T]
  type Transform = js.Tuple7[Double, Double, Double, Double, Double, Double, Double]
}
