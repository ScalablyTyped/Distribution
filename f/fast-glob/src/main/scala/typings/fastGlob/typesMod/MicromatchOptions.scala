package typings.fastGlob.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicromatchOptions extends js.Object {
  
  var dot: js.UndefOr[Boolean] = js.native
  
  var matchBase: js.UndefOr[Boolean] = js.native
  
  var nobrace: js.UndefOr[Boolean] = js.native
  
  var nocase: js.UndefOr[Boolean] = js.native
  
  var noext: js.UndefOr[Boolean] = js.native
  
  var noglobstar: js.UndefOr[Boolean] = js.native
  
  var posix: js.UndefOr[Boolean] = js.native
  
  var strictSlashes: js.UndefOr[Boolean] = js.native
}
object MicromatchOptions {
  
  @scala.inline
  def apply(): MicromatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicromatchOptions]
  }
  
  @scala.inline
  implicit class MicromatchOptionsOps[Self <: MicromatchOptions] (val x: Self) extends AnyVal {
    
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
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setMatchBase(value: Boolean): Self = this.set("matchBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBase: Self = this.set("matchBase", js.undefined)
    
    @scala.inline
    def setNobrace(value: Boolean): Self = this.set("nobrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNobrace: Self = this.set("nobrace", js.undefined)
    
    @scala.inline
    def setNocase(value: Boolean): Self = this.set("nocase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocase: Self = this.set("nocase", js.undefined)
    
    @scala.inline
    def setNoext(value: Boolean): Self = this.set("noext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoext: Self = this.set("noext", js.undefined)
    
    @scala.inline
    def setNoglobstar(value: Boolean): Self = this.set("noglobstar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoglobstar: Self = this.set("noglobstar", js.undefined)
    
    @scala.inline
    def setPosix(value: Boolean): Self = this.set("posix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosix: Self = this.set("posix", js.undefined)
    
    @scala.inline
    def setStrictSlashes(value: Boolean): Self = this.set("strictSlashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictSlashes: Self = this.set("strictSlashes", js.undefined)
  }
}
