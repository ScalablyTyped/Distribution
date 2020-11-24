package typings.durandal.binderMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("durandal/binder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var binding: js.Function3[/* data */ js.Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit] = js.native
  
  var bindingComplete: js.Function3[/* data */ js.Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit] = js.native
  
  var throwOnErrors: Boolean = js.native
}
