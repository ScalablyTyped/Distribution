package typings.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/groovy.html
  *
  * Groovy highlight definitions
  *
  */
trait groovy_ extends js.Object {
  /**
    *
    */
  var GROOVY_KEYWORDS: js.Object
  /**
    *
    */
  var defaultMode: js.Object
  /**
    *
    */
  var modes: js.Array[_]
}

object groovy_ {
  @scala.inline
  def apply(GROOVY_KEYWORDS: js.Object, defaultMode: js.Object, modes: js.Array[_]): groovy_ = {
    val __obj = js.Dynamic.literal(GROOVY_KEYWORDS = GROOVY_KEYWORDS.asInstanceOf[js.Any], defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[groovy_]
  }
}

