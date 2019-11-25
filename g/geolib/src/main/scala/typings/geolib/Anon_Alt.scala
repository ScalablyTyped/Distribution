package typings.geolib

import typings.geolib.esTypesMod.GeolibAltitudeInputValue
import typings.geolib.esTypesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends GeolibInputAltitude {
  var alt: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object Anon_Alt {
  @scala.inline
  def apply(alt: Int | Double = null): Anon_Alt = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alt]
  }
}

