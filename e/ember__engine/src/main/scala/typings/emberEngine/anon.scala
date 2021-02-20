package typings.emberEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiate extends StObject {
    
    var instantiate: js.UndefOr[Boolean] = js.native
    
    var singleton: js.UndefOr[Boolean] = js.native
  }
  object Instantiate {
    
    @scala.inline
    def apply(): Instantiate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Instantiate]
    }
    
    @scala.inline
    implicit class InstantiateMutableBuilder[Self <: Instantiate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstantiate(value: Boolean): Self = StObject.set(x, "instantiate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstantiateUndefined: Self = StObject.set(x, "instantiate", js.undefined)
      
      @scala.inline
      def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    }
  }
}
