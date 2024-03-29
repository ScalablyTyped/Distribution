package typings.detox

import org.scalablytyped.runtime.Shortcut
import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specReporterMod extends Shortcut {
  
  @JSImport("detox/runners/jest/specReporter", JSImport.Namespace)
  @js.native
  val ^ : SpecReporter = js.native
  
  trait SpecReporter
    extends StObject
       with CircusTestEventListenerBase {
    
    def specDone(): Unit
    
    def specStarted(): Unit
    
    def suiteDone(): Unit
    
    // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
    def suiteStarted(): Unit
  }
  object SpecReporter {
    
    inline def apply(
      handleTestEvent: (js.Any, js.Any) => js.Promise[Unit],
      specDone: () => Unit,
      specStarted: () => Unit,
      suiteDone: () => Unit,
      suiteStarted: () => Unit
    ): SpecReporter = {
      val __obj = js.Dynamic.literal(handleTestEvent = js.Any.fromFunction2(handleTestEvent), specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted), suiteDone = js.Any.fromFunction0(suiteDone), suiteStarted = js.Any.fromFunction0(suiteStarted))
      __obj.asInstanceOf[SpecReporter]
    }
    
    extension [Self <: SpecReporter](x: Self) {
      
      inline def setSpecDone(value: () => Unit): Self = StObject.set(x, "specDone", js.Any.fromFunction0(value))
      
      inline def setSpecStarted(value: () => Unit): Self = StObject.set(x, "specStarted", js.Any.fromFunction0(value))
      
      inline def setSuiteDone(value: () => Unit): Self = StObject.set(x, "suiteDone", js.Any.fromFunction0(value))
      
      inline def setSuiteStarted(value: () => Unit): Self = StObject.set(x, "suiteStarted", js.Any.fromFunction0(value))
    }
  }
  
  type _To = SpecReporter
  
  /* This means you don't have to write `^`, but can instead just say `specReporterMod.foo` */
  override def _to: SpecReporter = ^
}
