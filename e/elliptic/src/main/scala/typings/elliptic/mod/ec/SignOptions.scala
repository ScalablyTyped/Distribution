package typings.elliptic.mod.ec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignOptions extends js.Object {
  
  var canonical: js.UndefOr[Boolean] = js.native
  
  var k: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ] = js.native
  
  var pers: js.UndefOr[js.Any] = js.native
  
  var persEnc: js.UndefOr[String] = js.native
}
object SignOptions {
  
  @scala.inline
  def apply(): SignOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignOptions]
  }
  
  @scala.inline
  implicit class SignOptionsOps[Self <: SignOptions] (val x: Self) extends AnyVal {
    
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
    def setCanonical(value: Boolean): Self = this.set("canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonical: Self = this.set("canonical", js.undefined)
    
    @scala.inline
    def setK(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
    
    @scala.inline
    def setPers(value: js.Any): Self = this.set("pers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePers: Self = this.set("pers", js.undefined)
    
    @scala.inline
    def setPersEnc(value: String): Self = this.set("persEnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersEnc: Self = this.set("persEnc", js.undefined)
  }
}
