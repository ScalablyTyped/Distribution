package typings.dojo.dojox.mobile.dh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/ContentTypeMap.html
  *
  * A component that provides a map for determining the content handler
  * class from a content-type.
  *
  */
@JSName("ContentTypeMap")
trait ContentTypeMap_ extends js.Object {
  /**
    *
    */
  var map: js.Object
  /**
    * Adds a handler class for the given content type.
    *
    * @param contentType
    * @param handlerClass
    */
  def add(contentType: String, handlerClass: String): Unit
  /**
    * Returns the handler class for the given content type.
    *
    * @param contentType
    */
  def getHandlerClass(contentType: String): js.Any
}

object ContentTypeMap_ {
  @scala.inline
  def apply(add: (String, String) => Unit, getHandlerClass: String => js.Any, map: js.Object): ContentTypeMap_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getHandlerClass = js.Any.fromFunction1(getHandlerClass), map = map)
  
    __obj.asInstanceOf[ContentTypeMap_]
  }
}

