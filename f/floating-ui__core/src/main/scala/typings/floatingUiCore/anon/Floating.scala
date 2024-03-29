package typings.floatingUiCore.anon

import typings.floatingUiCore.srcTypesMod.FloatingElement
import typings.floatingUiCore.srcTypesMod.ReferenceElement
import typings.floatingUiCore.srcTypesMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Floating extends StObject {
  
  var floating: FloatingElement
  
  var reference: ReferenceElement
  
  var strategy: Strategy
}
object Floating {
  
  inline def apply(floating: FloatingElement, reference: ReferenceElement, strategy: Strategy): Floating = {
    val __obj = js.Dynamic.literal(floating = floating.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Floating]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Floating] (val x: Self) extends AnyVal {
    
    inline def setFloating(value: FloatingElement): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setReference(value: ReferenceElement): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
