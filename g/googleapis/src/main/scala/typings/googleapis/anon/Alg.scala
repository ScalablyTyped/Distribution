package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alg extends StObject {
  
  var alg: js.UndefOr[String] = js.native
  
  var e: js.UndefOr[String] = js.native
  
  var kid: js.UndefOr[String] = js.native
  
  var kty: js.UndefOr[String] = js.native
  
  var n: js.UndefOr[String] = js.native
  
  var use: js.UndefOr[String] = js.native
}
object Alg {
  
  @scala.inline
  def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  
  @scala.inline
  implicit class AlgMutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    @scala.inline
    def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    @scala.inline
    def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    @scala.inline
    def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    @scala.inline
    def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    @scala.inline
    def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
  }
}
