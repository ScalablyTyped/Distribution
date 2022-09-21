package typings.es6template

import org.scalablytyped.runtime.Shortcut
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("es6template", JSImport.Namespace)
  @js.native
  val ^ : Default = js.native
  
  @js.native
  trait Default extends StObject {
    
    def apply(str: String, locals: Record[String, Any]): String = js.native
    
    // This rule is disabled because the caller of `compile()` knows what the type of the `locals` parameter should be when
    // calling the `compile` function.
    // tslint:disable-next-line:no-unnecessary-generics
    def compile[Locals](str: String): js.Function1[/* locals */ Locals, String] = js.native
    
    def render(str: String, locals: Record[String, Any]): String = js.native
  }
  
  type _To = Default
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Default = ^
}
