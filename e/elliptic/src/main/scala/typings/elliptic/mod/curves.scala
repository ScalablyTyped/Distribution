package typings.elliptic.mod

import typings.elliptic.mod.curves.PresetCurve.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curves {
  
  @JSImport("elliptic", "curves.PresetCurve")
  @js.native
  open class PresetCurve protected () extends StObject {
    // ?
    def this(options: Options) = this()
    
    var g: Any = js.native
    
    var hash: Any = js.native
    
    // ?
    var n: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | Null
      ] = js.native
    
    var `type`: String = js.native
  }
  object PresetCurve {
    
    trait Options extends StObject {
      
      var a: String
      
      var b: String
      
      var basis: js.UndefOr[Any] = js.undefined
      
      // ?
      var beta: js.UndefOr[String] = js.undefined
      
      var g: Any
      
      var gRed: Boolean
      
      var hash: Any
      
      var lambda: js.UndefOr[String] = js.undefined
      
      var n: String
      
      var p: String
      
      var prime: String | Null
      
      var `type`: String
    }
    object Options {
      
      inline def apply(a: String, b: String, g: Any, gRed: Boolean, hash: Any, n: String, p: String, `type`: String): Options = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], gRed = gRed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], prime = null)
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setA(value: String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setBasis(value: Any): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
        
        inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
        
        inline def setBeta(value: String): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
        
        inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
        
        inline def setG(value: Any): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        inline def setGRed(value: Boolean): Self = StObject.set(x, "gRed", value.asInstanceOf[js.Any])
        
        inline def setHash(value: Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        inline def setLambda(value: String): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
        
        inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
        
        inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
        
        inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        inline def setPrime(value: String): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
        
        inline def setPrimeNull: Self = StObject.set(x, "prime", null)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
