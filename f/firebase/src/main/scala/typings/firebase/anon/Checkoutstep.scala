package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkoutstep
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var checkout_option: js.UndefOr[String] = js.undefined
  
  var checkout_step: js.UndefOr[Double] = js.undefined
}
object Checkoutstep {
  
  @scala.inline
  def apply(): Checkoutstep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checkoutstep]
  }
  
  @scala.inline
  implicit class CheckoutstepMutableBuilder[Self <: Checkoutstep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckout_option(value: String): Self = StObject.set(x, "checkout_option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckout_optionUndefined: Self = StObject.set(x, "checkout_option", js.undefined)
    
    @scala.inline
    def setCheckout_step(value: Double): Self = StObject.set(x, "checkout_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckout_stepUndefined: Self = StObject.set(x, "checkout_step", js.undefined)
  }
}
