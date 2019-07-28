package typings.geolib

import typings.geolib.esTypesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esGetCompassDirectionMod {
  type BearingFunction = js.Function2[/* origin */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}
