package typings.dojo.dojox.geo.openlayers._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.__JsonImportArgs.html
  *
  * The keyword arguments that can be passed in a JsonImport constructor.
  *
  */
trait __JsonImportArgs extends js.Object {
  /**
    * Error callback called if something fails.
    *
    */
  var error: js.Function
  /**
    * The function called each time a feature is read. The function is called with a GeometryFeature as argument.
    *
    */
  var nextFeature: js.Function
  /**
    * The url pointing to the JSON file to load.
    *
    */
  var url: String
}

object __JsonImportArgs {
  @scala.inline
  def apply(error: js.Function, nextFeature: js.Function, url: String): __JsonImportArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], nextFeature = nextFeature.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[__JsonImportArgs]
  }
}

