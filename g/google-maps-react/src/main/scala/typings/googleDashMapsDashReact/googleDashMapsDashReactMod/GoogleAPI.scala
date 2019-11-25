package typings.googleDashMapsDashReact.googleDashMapsDashReactMod

import typings.googleDashMapsDashReact.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAPI extends js.Object {
  val maps: Typeofmaps
}

object GoogleAPI {
  @scala.inline
  def apply(maps: Typeofmaps): GoogleAPI = {
    val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleAPI]
  }
}

