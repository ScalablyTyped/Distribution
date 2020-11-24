package typings.es6template.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default extends js.Object {
  
  def apply(str: String, locals: Record[String, _]): String = js.native
  
  // This rule is disabled because the caller of `compile()` knows what the type of the `locals` parameter should be when
  // calling the `compile` function.
  // tslint:disable-next-line:no-unnecessary-generics
  def compile[Locals](str: String): js.Function1[/* locals */ Locals, String] = js.native
  
  def render(str: String, locals: Record[String, _]): String = js.native
}
