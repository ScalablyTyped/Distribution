package typings.ent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def encode(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def encode(s: String, opts: EntOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(s.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait EntOpts extends StObject {
    
    /**
      * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
      */
    var named: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If opts.numeric is false or opts.named is true, encoding will used named codes like &pi;.
      */
    var numeric: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If opts.special is set to an Object, the key names will be forced to be encoded (defaults to forcing: <>'"&)
      */
    var special: js.UndefOr[js.Any] = js.undefined
  }
  object EntOpts {
    
    @scala.inline
    def apply(): EntOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntOpts]
    }
    
    @scala.inline
    implicit class EntOptsMutableBuilder[Self <: EntOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
      
      @scala.inline
      def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      @scala.inline
      def setSpecial(value: js.Any): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialUndefined: Self = StObject.set(x, "special", js.undefined)
    }
  }
}
