package typings.ethereumCryptography.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xpub extends js.Object {
  
  var xpriv: String = js.native
  
  var xpub: String = js.native
}
object Xpub {
  
  @scala.inline
  def apply(xpriv: String, xpub: String): Xpub = {
    val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xpub]
  }
  
  @scala.inline
  implicit class XpubOps[Self <: Xpub] (val x: Self) extends AnyVal {
    
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
    def setXpriv(value: String): Self = this.set("xpriv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpub(value: String): Self = this.set("xpub", value.asInstanceOf[js.Any])
  }
}
