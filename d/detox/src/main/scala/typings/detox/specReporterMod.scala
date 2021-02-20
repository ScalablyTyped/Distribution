package typings.detox

import org.scalablytyped.runtime.Shortcut
import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specReporterMod extends Shortcut {
  
  @JSImport("detox/runners/jest/specReporter", JSImport.Namespace)
  @js.native
  val ^ : SpecReporter = js.native
  
  @js.native
  trait SpecReporter extends CircusTestEventListenerBase {
    
    def specDone(): Unit = js.native
    
    def specStarted(): Unit = js.native
    
    def suiteDone(): Unit = js.native
    
    // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
    def suiteStarted(): Unit = js.native
  }
  object SpecReporter {
    
    @scala.inline
    def apply(
      handleTestEvent: (js.Any, js.Any) => js.Promise[Unit],
      specDone: () => Unit,
      specStarted: () => Unit,
      suiteDone: () => Unit,
      suiteStarted: () => Unit
    ): SpecReporter = {
      val __obj = js.Dynamic.literal(handleTestEvent = js.Any.fromFunction2(handleTestEvent), specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted), suiteDone = js.Any.fromFunction0(suiteDone), suiteStarted = js.Any.fromFunction0(suiteStarted))
      __obj.asInstanceOf[SpecReporter]
    }
    
    @scala.inline
    implicit class SpecReporterMutableBuilder[Self <: SpecReporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpecDone(value: () => Unit): Self = StObject.set(x, "specDone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSpecStarted(value: () => Unit): Self = StObject.set(x, "specStarted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSuiteDone(value: () => Unit): Self = StObject.set(x, "suiteDone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSuiteStarted(value: () => Unit): Self = StObject.set(x, "suiteStarted", js.Any.fromFunction0(value))
    }
  }
  
  type _To = SpecReporter
  
  /* This means you don't have to write `^`, but can instead just say `specReporterMod.foo` */
  override def _to: SpecReporter = ^
}
