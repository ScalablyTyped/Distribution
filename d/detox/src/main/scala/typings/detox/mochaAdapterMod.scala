package typings.detox

import org.scalablytyped.runtime.Shortcut
import typings.detox.mod.global.Detox_.Detox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mochaAdapterMod extends Shortcut {
  
  @JSImport("detox/runners/mocha/adapter", JSImport.Namespace)
  @js.native
  val ^ : DetoxMochaAdapter = js.native
  
  trait DetoxMochaAdapter extends StObject {
    
    def afterEach(context: js.Any): js.Promise[Unit]
    
    def beforeEach(context: js.Any): js.Promise[Unit]
    
    var detox: Detox
  }
  object DetoxMochaAdapter {
    
    inline def apply(afterEach: js.Any => js.Promise[Unit], beforeEach: js.Any => js.Promise[Unit], detox: Detox): DetoxMochaAdapter = {
      val __obj = js.Dynamic.literal(afterEach = js.Any.fromFunction1(afterEach), beforeEach = js.Any.fromFunction1(beforeEach), detox = detox.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetoxMochaAdapter]
    }
    
    extension [Self <: DetoxMochaAdapter](x: Self) {
      
      inline def setAfterEach(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
      
      inline def setBeforeEach(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
      
      inline def setDetox(value: Detox): Self = StObject.set(x, "detox", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = DetoxMochaAdapter
  
  /* This means you don't have to write `^`, but can instead just say `mochaAdapterMod.foo` */
  override def _to: DetoxMochaAdapter = ^
}
