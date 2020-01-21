package typings.dojo.dojox.mobile.dh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/SuffixFileTypeMap.html
  *
  * A component that provides a map for determining content-type from
  * the suffix of the URL.
  *
  */
trait SuffixFileTypeMap_ extends js.Object {
  /**
    *
    */
  var map: js.Object
  /**
    * Adds a handler class for the given content type.
    *
    * @param key
    * @param contentType
    */
  def add(key: String, contentType: String): Unit
  /**
    * Returns the handler class for the given content type.
    *
    * @param fileName
    */
  def getContentType(fileName: String): Unit
}

object SuffixFileTypeMap_ {
  @scala.inline
  def apply(add: (String, String) => Unit, getContentType: String => Unit, map: js.Object): SuffixFileTypeMap_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getContentType = js.Any.fromFunction1(getContentType), map = map.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuffixFileTypeMap_]
  }
}

