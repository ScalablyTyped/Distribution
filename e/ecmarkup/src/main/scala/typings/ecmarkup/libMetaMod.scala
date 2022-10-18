package typings.ecmarkup

import typings.ecmarkup.libContextMod.Context
import typings.ecmarkup.libSpecMod.Spec
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMetaMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Builder * / any */ @JSImport("ecmarkup/lib/Meta", JSImport.Default)
  @js.native
  open class default () extends StObject
  /* static members */
  object default {
    
    @JSImport("ecmarkup/lib/Meta", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ecmarkup/lib/Meta", "default.elements")
    @js.native
    def elements: js.Array[String] = js.native
    inline def elements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elements")(x.asInstanceOf[js.Any])
    
    inline def enter(hasSpecNodeClauseStack: Context): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enter")(hasSpecNodeClauseStack.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def render(spec: Spec, node: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(spec.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type Meta = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Builder */ Any
}
