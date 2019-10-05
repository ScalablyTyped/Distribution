package typings.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/django.html
  *
  *
  */
@JSName("django")
trait django_ extends js.Object {
  /**
    *
    */
  var case_insensitive: Boolean
  /**
    *
    */
  var defaultMode: js.Object
  /**
    *
    */
  var modes: js.Array[_]
}

object django_ {
  @scala.inline
  def apply(case_insensitive: Boolean, defaultMode: js.Object, modes: js.Array[_]): django_ = {
    val __obj = js.Dynamic.literal(case_insensitive = case_insensitive, defaultMode = defaultMode, modes = modes)
  
    __obj.asInstanceOf[django_]
  }
}

