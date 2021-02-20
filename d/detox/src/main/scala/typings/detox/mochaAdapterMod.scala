package typings.detox

import org.scalablytyped.runtime.Shortcut
import typings.detox.mod.global.Detox_.Detox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mochaAdapterMod extends Shortcut {
  
  @JSImport("detox/runners/mocha/adapter", JSImport.Namespace)
  @js.native
  val ^ : DetoxMochaAdapter = js.native
  
  @js.native
  trait DetoxMochaAdapter extends StObject {
    
    def afterEach(context: js.Any): js.Promise[Unit] = js.native
    
    def beforeEach(context: js.Any): js.Promise[Unit] = js.native
    
    var detox: Detox = js.native
  }
  object DetoxMochaAdapter {
    
    @scala.inline
    def apply(afterEach: js.Any => js.Promise[Unit], beforeEach: js.Any => js.Promise[Unit], detox: Detox): DetoxMochaAdapter = {
      val __obj = js.Dynamic.literal(afterEach = js.Any.fromFunction1(afterEach), beforeEach = js.Any.fromFunction1(beforeEach), detox = detox.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetoxMochaAdapter]
    }
    
    @scala.inline
    implicit class DetoxMochaAdapterMutableBuilder[Self <: DetoxMochaAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterEach(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeEach(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDetox(value: Detox): Self = StObject.set(x, "detox", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = DetoxMochaAdapter
  
  /* This means you don't have to write `^`, but can instead just say `mochaAdapterMod.foo` */
  override def _to: DetoxMochaAdapter = ^
}
