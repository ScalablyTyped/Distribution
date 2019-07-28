package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameValue extends js.Object {
  /** Name of the HTTP header. */
  var name: String
  /** Value of the HTTP header. */
  var value: String
}

object Anon_NameValue {
  @scala.inline
  def apply(name: String, value: String): Anon_NameValue = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Anon_NameValue]
  }
}

