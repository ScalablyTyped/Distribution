package typings.es6Shim

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringConstructor extends StObject {
  
  /**
    * Return the String value whose elements are, in order, the elements in the List elements.
    * If length is 0, the empty string is returned.
    */
  def fromCodePoint(codePoints: Double*): java.lang.String = js.native
  
  /**
    * String.raw is intended for use as a tag function of a Tagged Template String. When called
    * as such the first argument will be a well formed template call site object and the rest
    * parameter will contain the substitution values.
    * @param template A well-formed template string call site representation.
    * @param substitutions A set of substitution values.
    */
  def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
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
  
  @scala.inline
  implicit class StringConstructorMutableBuilder[Self <: StringConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromCodePoint(value: /* repeated */ Double => java.lang.String): Self = StObject.set(x, "fromCodePoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRaw(value: (TemplateStringsArray, /* repeated */ js.Any) => java.lang.String): Self = StObject.set(x, "raw", js.Any.fromFunction2(value))
  }
}
