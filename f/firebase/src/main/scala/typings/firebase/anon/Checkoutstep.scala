package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkoutstep
  extends /* key */ StringDictionary[js.Any] {
  
  var checkout_option: js.UndefOr[String] = js.native
  
  var checkout_step: js.UndefOr[Double] = js.native
}
object Checkoutstep {
  
  @scala.inline
  def apply(): Checkoutstep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checkoutstep]
  }
  
  @scala.inline
  implicit class CheckoutstepOps[Self <: Checkoutstep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckout_option(value: String): Self = this.set("checkout_option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckout_option: Self = this.set("checkout_option", js.undefined)
    
    @scala.inline
    def setCheckout_step(value: Double): Self = this.set("checkout_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckout_step: Self = this.set("checkout_step", js.undefined)
  }
}
