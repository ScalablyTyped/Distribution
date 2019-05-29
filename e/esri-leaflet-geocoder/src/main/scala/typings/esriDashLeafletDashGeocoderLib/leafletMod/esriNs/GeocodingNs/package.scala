package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GeocodingNs {
  type Geosearch = GeosearchControl with leafletLib.leafletMod.Evented
  type GeosearchCallback = js.Function2[/* error */ js.UndefOr[js.Any], /* results */ js.Any, scala.Unit]
  type GeosearchConstructor = org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* options */ GeosearchObject], Geosearch]
}
