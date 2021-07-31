package typings.empower

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(originalAssert: js.Any, formatter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(originalAssert.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply(originalAssert: js.Any, formatter: js.Any, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(originalAssert.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("empower", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var destructive: js.UndefOr[Boolean] = js.undefined
    
    var modifyMessageOnRethrow: js.UndefOr[Boolean] = js.undefined
    
    var patterns: js.UndefOr[js.Array[String]] = js.undefined
    
    var saveContextOnRethrow: js.UndefOr[Boolean] = js.undefined
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
