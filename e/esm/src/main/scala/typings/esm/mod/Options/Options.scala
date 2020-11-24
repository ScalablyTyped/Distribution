package typings.esm.mod.Options

import typings.esm.anon.PartialEsm
import typings.esm.esmStrings.all
import typings.esm.esmStrings.auto
import typings.esm.esmStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var await: Boolean = js.native
  
  var cjs: Boolean | PartialEsm = js.native
  
  var force: Boolean = js.native
  
  var mainFields: js.Array[String] = js.native
  
  var mode: auto | all | strict = js.native
  
  var wasm: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(
    await: Boolean,
    cjs: Boolean | PartialEsm,
    force: Boolean,
    mainFields: js.Array[String],
    mode: auto | all | strict,
    wasm: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], cjs = cjs.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], mainFields = mainFields.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], wasm = wasm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: typings.esm.mod.Options.Options] (val x: Self) extends AnyVal {
    
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
    def setCjs(value: Boolean | PartialEsm): Self = this.set("cjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainFieldsVarargs(value: String*): Self = this.set("mainFields", js.Array(value :_*))
    
    @scala.inline
    def setMainFields(value: js.Array[String]): Self = this.set("mainFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: auto | all | strict): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasm(value: Boolean): Self = this.set("wasm", value.asInstanceOf[js.Any])
  }
}
