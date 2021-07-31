package typings.facepaint

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(breakpoints: js.Array[Selector]): DynamicStyleFunction = ^.asInstanceOf[js.Dynamic].apply(breakpoints.asInstanceOf[js.Any]).asInstanceOf[DynamicStyleFunction]
  @scala.inline
  def apply(breakpoints: js.Array[Selector], options: Options): DynamicStyleFunction = (^.asInstanceOf[js.Dynamic].apply(breakpoints.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DynamicStyleFunction]
  
  @JSImport("facepaint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Arg = BaseArg | js.Array[BaseArg]
  
  type BaseArg = js.Object | js.Array[js.Object]
  
  type DynamicStyle = StringDictionary[StringDictionary[String | Double]]
  
  type DynamicStyleFunction = js.Function1[/* repeated */ Arg, js.Array[DynamicStyle]]
  
  trait Options extends StObject {
    
    var literal: js.UndefOr[Boolean] = js.undefined
    
    var overlap: js.UndefOr[Boolean] = js.undefined
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
      def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
      
      @scala.inline
      def setOverlap(value: Boolean): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    }
  }
  
  type Selector = String
}
