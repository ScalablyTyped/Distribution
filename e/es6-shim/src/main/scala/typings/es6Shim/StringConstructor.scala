package typings.es6Shim

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringConstructor extends js.Object {
  /**
    * Return the String value whose elements are, in order, the elements in the List elements.
    * If length is 0, the empty string is returned.
    */
  def fromCodePoint(codePoints: Double*): java.lang.String
  /**
    * String.raw is intended for use as a tag function of a Tagged Template String. When called
    * as such the first argument will be a well formed template call site object and the rest
    * parameter will contain the substitution values.
    * @param template A well-formed template string call site representation.
    * @param substitutions A set of substitution values.
    */
  def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String
}

object StringConstructor {
  @scala.inline
  def apply(
    fromCodePoint: /* repeated */ Double => java.lang.String,
    raw: (TemplateStringsArray, /* repeated */ js.Any) => java.lang.String
  ): StringConstructor = {
    val __obj = js.Dynamic.literal(fromCodePoint = js.Any.fromFunction1(fromCodePoint), raw = js.Any.fromFunction2(raw))
    __obj.asInstanceOf[StringConstructor]
  }
}

