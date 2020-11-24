package typings.esm.anon

import typings.esm.esmStrings.all
import typings.esm.esmStrings.auto
import typings.esm.esmStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<esm.esm.Options.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var await: js.UndefOr[Boolean] = js.native
  
  var cjs: js.UndefOr[Boolean | PartialEsm] = js.native
  
  var force: js.UndefOr[Boolean] = js.native
  
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  
  var mode: js.UndefOr[auto | all | strict] = js.native
  
  var wasm: js.UndefOr[Boolean] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setAwait(value: Boolean): Self = this.set("await", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwait: Self = this.set("await", js.undefined)
    
    @scala.inline
    def setCjs(value: Boolean | PartialEsm): Self = this.set("cjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCjs: Self = this.set("cjs", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setMainFieldsVarargs(value: String*): Self = this.set("mainFields", js.Array(value :_*))
    
    @scala.inline
    def setMainFields(value: js.Array[String]): Self = this.set("mainFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainFields: Self = this.set("mainFields", js.undefined)
    
    @scala.inline
    def setMode(value: auto | all | strict): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setWasm(value: Boolean): Self = this.set("wasm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWasm: Self = this.set("wasm", js.undefined)
  }
}
