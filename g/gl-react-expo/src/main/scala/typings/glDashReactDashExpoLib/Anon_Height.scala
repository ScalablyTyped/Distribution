package typings
package glDashReactDashExpoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: scala.Double
  var localUri: java.lang.String
  var uri: java.lang.String
  var width: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(height: scala.Double, localUri: java.lang.String, uri: java.lang.String, width: scala.Double): Anon_Height = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("localUri")(localUri)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Height]
  }
}

