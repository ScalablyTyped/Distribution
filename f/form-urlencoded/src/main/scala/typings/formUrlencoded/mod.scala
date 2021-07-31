package typings.formUrlencoded

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(data: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(data: js.Any, opts: FormEncodedOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("form-urlencoded", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FormEncodedOptions extends StObject {
    
    var ignorenull: js.UndefOr[Boolean] = js.undefined
    
    var skipIndex: js.UndefOr[Boolean] = js.undefined
    
    var sorted: js.UndefOr[Boolean] = js.undefined
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
