package typings.dojo.dojox.geo.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/JsonImport.html
  *
  * Class to load JSON formated ShapeFile as output of the JSon Custom Map Converter.
  * This class loads JSON formated ShapeFile produced by the JSon Custom Map Converter.
  * When loading the JSON file, it calls a iterator function each time a feature is read.
  * This iterator function is provided as parameter to the constructor.
  *
  * @param params The parameters to initialize this JsonImport instance.
  */
@JSGlobal("dojox.geo.openlayers.JsonImport")
@js.native
class JsonImport protected () extends js.Object {
  def this(params: js.Object) = this()
  /**
    * Triggers the loading.
    *
    */
  def loadData(): Unit = js.native
}

