package typings.firstDashMate.firstDashMateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("first-mate", "ScopeSelector")
@js.native
class ScopeSelector protected () extends js.Object {
  /**
    *  Create a new scope selector.
    *  @param source The string to parse as a scope selector.
    *  @return A newly constructed ScopeSelector.
    */
  def this(source: String) = this()
  /**
    *  Gets the prefix of this scope selector.
    *  @param scopes The scopes to match a prefix against.
    *  @return The matching prefix, if there is one.
    */
  def getPrefix(scopes: String): js.UndefOr[String] = js.native
  def getPrefix(scopes: js.Array[String]): js.UndefOr[String] = js.native
  /**
    *  Check if this scope selector matches the scopes.
    *  @param scopes A single scope or an array of them to be compared against.
    *  @return A boolean indicating whether or not this ScopeSelector matched.
    */
  def matches(scopes: String): Boolean = js.native
  def matches(scopes: js.Array[String]): Boolean = js.native
  /**
    *  Convert this TextMate scope selector to a CSS selector.
    *  @return A string with the CSSSelector representation of this ScopeSelector.
    */
  def toCssSelector(): String = js.native
  /**
    *  Convert this TextMate scope selector to a CSS selector, prefixing scopes
    *  with `syntax--`.
    *  @return A string with the syntax-specific CSSSelector representation of this
    *  ScopeSelector.
    */
  def toCssSyntaxSelector(): String = js.native
}

