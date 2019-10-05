package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/cookie.html
  *
  * Get or set a cookie.
  * If one argument is passed, returns the value of the cookie
  * For two or more arguments, acts as a setter.
  *
  * @param name Name of the cookie
  * @param value       OptionalValue for the cookie
  * @param props       OptionalProperties for the cookie
  */
@js.native
trait cookie extends js.Object {
  def apply(name: String): Unit = js.native
  def apply(name: String, value: String): Unit = js.native
  def apply(name: String, value: String, props: js.Object): Unit = js.native
  /**
    * Use to determine if the current browser supports cookies or not.
    *
    * Returns true if user allows cookies.
    * Returns false if user doesn't allow cookies.
    *
    */
  def isSupported(): Unit = js.native
}

