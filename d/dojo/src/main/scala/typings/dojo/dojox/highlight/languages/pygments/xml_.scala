package typings.dojo.dojox.highlight.languages.pygments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/pygments/xml.html
  *
  *
  */
@JSName("xml")
trait xml_ extends js.Object {
  /**
    *
    */
  var defaultMode: js.Object
  /**
    *
    */
  var modes: js.Array[_]
}

object xml_ {
  @scala.inline
  def apply(defaultMode: js.Object, modes: js.Array[_]): xml_ = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode, modes = modes)
  
    __obj.asInstanceOf[xml_]
  }
}

