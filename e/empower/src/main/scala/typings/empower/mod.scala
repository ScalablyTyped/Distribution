package typings.empower

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("empower", JSImport.Namespace)
  @js.native
  def apply(originalAssert: js.Any, formatter: js.Any): js.Any = js.native
  @JSImport("empower", JSImport.Namespace)
  @js.native
  def apply(originalAssert: js.Any, formatter: js.Any, options: Options): js.Any = js.native
  
  @js.native
  trait Options extends StObject {
    
    var destructive: js.UndefOr[Boolean] = js.native
    
    var modifyMessageOnRethrow: js.UndefOr[Boolean] = js.native
    
    var patterns: js.UndefOr[js.Array[String]] = js.native
    
    var saveContextOnRethrow: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestructive(value: Boolean): Self = StObject.set(x, "destructive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructiveUndefined: Self = StObject.set(x, "destructive", js.undefined)
      
      @scala.inline
      def setModifyMessageOnRethrow(value: Boolean): Self = StObject.set(x, "modifyMessageOnRethrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyMessageOnRethrowUndefined: Self = StObject.set(x, "modifyMessageOnRethrow", js.undefined)
      
      @scala.inline
      def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      @scala.inline
      def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
      
      @scala.inline
      def setSaveContextOnRethrow(value: Boolean): Self = StObject.set(x, "saveContextOnRethrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveContextOnRethrowUndefined: Self = StObject.set(x, "saveContextOnRethrow", js.undefined)
    }
  }
}
