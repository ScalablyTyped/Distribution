package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esGetPathLengthMod {
  type DistanceFn = js.Function2[
    /* point */ geolibLib.esTypesMod.GeolibInputCoordinates, 
    /* dest */ geolibLib.esTypesMod.GeolibInputCoordinates, 
    scala.Double
  ]
}
