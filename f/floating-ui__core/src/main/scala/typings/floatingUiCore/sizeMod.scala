package typings.floatingUiCore

import typings.floatingUiCore.anon.MiddlewareArgumentsavaila
import typings.floatingUiCore.anon.PartialOptionsOptionsApply
import typings.floatingUiCore.typesMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeMod {
  
  @JSImport("@floating-ui/core/src/middleware/size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
  inline def size(options: PartialOptionsOptionsApply): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  trait Options extends StObject {
    
    /**
      * Function that is called to perform style mutations to the floating element
      * to change its size.
      * @default undefined
      */
    @JSName("apply")
    def apply(args: MiddlewareArgumentsavaila): Unit | js.Promise[Unit]
  }
  object Options {
    
    inline def apply(apply: MiddlewareArgumentsavaila => Unit | js.Promise[Unit]): Options = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApply(value: MiddlewareArgumentsavaila => Unit | js.Promise[Unit]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
}
