package typings.dotenvExpand

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(config: DotenvResult): DotenvResult = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[DotenvResult]
  
  @JSImport("dotenv-expand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DotenvResult extends StObject {
    
    var error: js.UndefOr[Error] = js.undefined
    
    var parsed: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object DotenvResult {
    
    @scala.inline
    def apply(): DotenvResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotenvResult]
    }
    
    @scala.inline
    implicit class DotenvResultMutableBuilder[Self <: DotenvResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setParsed(value: StringDictionary[String]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    }
  }
}
