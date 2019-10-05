package typings.dojo.dojox.dtl.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/utils/date.html
  *
  *
  */
trait date extends js.Object {
  /**
    * Format the internal date object
    *
    * @param format
    */
  def DateFormat(format: String): Unit
}

object date {
  @scala.inline
  def apply(DateFormat: String => Unit): date = {
    val __obj = js.Dynamic.literal(DateFormat = js.Any.fromFunction1(DateFormat))
  
    __obj.asInstanceOf[date]
  }
}

