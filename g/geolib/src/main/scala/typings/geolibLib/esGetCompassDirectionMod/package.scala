package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esGetCompassDirectionMod {
  type BearingFunction = js.Function2[
    /* origin */ geolibLib.esTypesMod.GeolibInputCoordinates, 
    /* dest */ geolibLib.esTypesMod.GeolibInputCoordinates, 
    scala.Double
  ]
}
