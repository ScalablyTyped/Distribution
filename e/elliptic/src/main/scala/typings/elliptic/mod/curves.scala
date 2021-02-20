package typings.elliptic.mod

import typings.elliptic.mod.curves.PresetCurve.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curves {
  
  @JSImport("elliptic", "curves.PresetCurve")
  @js.native
  class PresetCurve protected () extends StObject {
    // ?
    def this(options: Options) = this()
    
    var g: js.Any = js.native
    
    var hash: js.Any = js.native
    
    // ?
    var n: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Null
      ] = js.native
    
    var `type`: String = js.native
  }
  object PresetCurve {
    
    @js.native
    trait Options extends StObject {
      
      var a: String = js.native
      
      var b: String = js.native
      
      var basis: js.UndefOr[js.Any] = js.native
      
      // ?
      var beta: js.UndefOr[String] = js.native
      
      var g: js.Any = js.native
      
      var gRed: Boolean = js.native
      
      var hash: js.Any = js.native
      
      var lambda: js.UndefOr[String] = js.native
      
      var n: String = js.native
      
      var p: String = js.native
      
      var prime: String | Null = js.native
      
      var `type`: String = js.native
    }
    object Options {
      
      @scala.inline
      def apply(a: String, b: String, g: js.Any, gRed: Boolean, hash: js.Any, n: String, p: String, `type`: String): Options = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], gRed = gRed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasis(value: js.Any): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
        
        @scala.inline
        def setBeta(value: String): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
        
        @scala.inline
        def setG(value: js.Any): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGRed(value: Boolean): Self = StObject.set(x, "gRed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHash(value: js.Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLambda(value: String): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
        
        @scala.inline
        def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrime(value: String): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimeNull: Self = StObject.set(x, "prime", null)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
