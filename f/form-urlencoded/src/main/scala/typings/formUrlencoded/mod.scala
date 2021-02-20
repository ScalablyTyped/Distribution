package typings.formUrlencoded

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("form-urlencoded", JSImport.Namespace)
  @js.native
  def apply(data: js.Any): String = js.native
  @JSImport("form-urlencoded", JSImport.Namespace)
  @js.native
  def apply(data: js.Any, opts: FormEncodedOptions): String = js.native
  
  @js.native
  trait FormEncodedOptions extends StObject {
    
    var ignorenull: js.UndefOr[Boolean] = js.native
    
    var skipIndex: js.UndefOr[Boolean] = js.native
    
    var sorted: js.UndefOr[Boolean] = js.native
  }
  object FormEncodedOptions {
    
    @scala.inline
    def apply(): FormEncodedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormEncodedOptions]
    }
    
    @scala.inline
    implicit class FormEncodedOptionsMutableBuilder[Self <: FormEncodedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnorenull(value: Boolean): Self = StObject.set(x, "ignorenull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorenullUndefined: Self = StObject.set(x, "ignorenull", js.undefined)
      
      @scala.inline
      def setSkipIndex(value: Boolean): Self = StObject.set(x, "skipIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIndexUndefined: Self = StObject.set(x, "skipIndex", js.undefined)
      
      @scala.inline
      def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
}
