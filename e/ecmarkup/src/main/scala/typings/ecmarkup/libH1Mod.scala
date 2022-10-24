package typings.ecmarkup

import typings.ecmarkup.libContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libH1Mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Builder * / any */ @JSImport("ecmarkup/lib/H1", JSImport.Default)
  @js.native
  open class default () extends StObject
  /* static members */
  object default {
    
    @JSImport("ecmarkup/lib/H1", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ecmarkup/lib/H1", "default.elements")
    @js.native
    def elements: js.Array[String] = js.native
    inline def elements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elements")(x.asInstanceOf[js.Any])
    
    inline def enter(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enter")().asInstanceOf[js.Promise[Unit]]
    
    inline def exit(param0: Context): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  type H1 = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Builder */ Any
}
