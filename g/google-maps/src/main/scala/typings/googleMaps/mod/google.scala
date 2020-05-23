package typings.googleMaps.mod

import typings.googleMaps.anon.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait google extends js.Object {
  var maps: Typeofmaps
}

object google {
  @scala.inline
  def apply(maps: Typeofmaps): google = {
    val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
    __obj.asInstanceOf[google]
  }
}

