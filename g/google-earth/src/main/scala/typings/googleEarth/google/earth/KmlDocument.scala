package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlDocument")
@js.native
class KmlDocument () extends KmlContainer {
  /**
    * Returns a list of elements using a particular style URL.
    */
  def getElementsByStyleUrl(styleUrl: String): KmlObjectList[KmlObject] = js.native
  /**
    * Returns an array containing the style selectors present in the KML document.
    */
  def getStyleSelectors(): GEStyleSelectorContainer = js.native
}

