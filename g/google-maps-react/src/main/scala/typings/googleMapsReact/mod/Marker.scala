package typings.googleMapsReact.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-maps-react", "Marker")
@js.native
class Marker[P /* <: MarkerProps */, S] ()
  extends Component[P, S, js.Any] {
  var marker: js.UndefOr[typings.googlemaps.google.maps.Marker] = js.native
  def getMarker(): js.Promise[typings.googlemaps.google.maps.Marker] = js.native
  def renderMarker(): Unit = js.native
}

