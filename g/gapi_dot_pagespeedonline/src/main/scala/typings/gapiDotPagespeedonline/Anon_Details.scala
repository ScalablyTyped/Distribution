package typings.gapiDotPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  /**
    * List of entries that provide additional details about a single URL. Optional.
    */
  var details: js.Array[Anon_Args]
  /**
    * A format string that gives information about the URL, and a list of arguments for that format string.
    */
  var result: Anon_Args
}

object Anon_Details {
  @scala.inline
  def apply(details: js.Array[Anon_Args], result: Anon_Args): Anon_Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Details]
  }
}

