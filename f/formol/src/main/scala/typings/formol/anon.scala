package typings.formol

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    var no: ReactNode
    
    var yes: ReactNode
  }
  object Dictk {
    
    @scala.inline
    def apply(): Dictk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictk]
    }
    
    @scala.inline
    implicit class DictkMutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNo(value: ReactNode): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUndefined: Self = StObject.set(x, "no", js.undefined)
      
      @scala.inline
      def setYes(value: ReactNode): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    }
  }
}
