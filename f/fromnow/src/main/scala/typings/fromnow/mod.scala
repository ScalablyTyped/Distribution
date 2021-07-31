package typings.fromnow

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fromnow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(date: DateOkay): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(date: DateOkay, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type DateOkay = Date | String | Double
  
  trait Options extends StObject {
    
    var and: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[Boolean] = js.undefined
    
    var zero: js.UndefOr[Boolean] = js.undefined
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
      def setAnd(value: Boolean): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setZero(value: Boolean): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
}
