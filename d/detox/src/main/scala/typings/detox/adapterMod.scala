package typings.detox

import org.scalablytyped.runtime.Shortcut
import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import typings.detox.mod.global.Detox_.Detox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod extends Shortcut {
  
  @JSImport("detox/runners/jest/adapter", JSImport.Namespace)
  @js.native
  val ^ : DetoxJestAdapter = js.native
  
  @js.native
  trait DetoxJestAdapter extends CircusTestEventListenerBase {
    
    def afterAll(): js.Promise[Unit] = js.native
    
    def beforeEach(): js.Promise[Unit] = js.native
    
    var detox: Detox = js.native
    
    // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
    def specDone(): Unit = js.native
    
    def specStarted(): Unit = js.native
  }
  object DetoxJestAdapter {
    
    @scala.inline
    def apply(
      afterAll: () => js.Promise[Unit],
      beforeEach: () => js.Promise[Unit],
      detox: Detox,
      handleTestEvent: (js.Any, js.Any) => js.Promise[Unit],
      specDone: () => Unit,
      specStarted: () => Unit
    ): DetoxJestAdapter = {
      val __obj = js.Dynamic.literal(afterAll = js.Any.fromFunction0(afterAll), beforeEach = js.Any.fromFunction0(beforeEach), detox = detox.asInstanceOf[js.Any], handleTestEvent = js.Any.fromFunction2(handleTestEvent), specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted))
      __obj.asInstanceOf[DetoxJestAdapter]
    }
    
    @scala.inline
    implicit class DetoxJestAdapterMutableBuilder[Self <: DetoxJestAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterAll(value: () => js.Promise[Unit]): Self = StObject.set(x, "afterAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeEach(value: () => js.Promise[Unit]): Self = StObject.set(x, "beforeEach", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetox(value: Detox): Self = StObject.set(x, "detox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecDone(value: () => Unit): Self = StObject.set(x, "specDone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSpecStarted(value: () => Unit): Self = StObject.set(x, "specStarted", js.Any.fromFunction0(value))
    }
  }
  
  type _To = DetoxJestAdapter
  
  /* This means you don't have to write `^`, but can instead just say `adapterMod.foo` */
  override def _to: DetoxJestAdapter = ^
}
