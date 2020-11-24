package typings.fsJetpack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOptions extends js.Object {
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var matching: js.UndefOr[String | js.Array[String]] = js.native
  
  var overwrite: js.UndefOr[Boolean | OverwriteFunction] = js.native
}
object CopyOptions {
  
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  @scala.inline
  implicit class CopyOptionsOps[Self <: CopyOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setMatchingVarargs(value: String*): Self = this.set("matching", js.Array(value :_*))
    
    @scala.inline
    def setMatching(value: String | js.Array[String]): Self = this.set("matching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching: Self = this.set("matching", js.undefined)
    
    @scala.inline
    def setOverwriteFunction2(
      value: (/* srcInspectData */ InspectResult, /* destInspectData */ InspectResult) => Boolean | js.Promise[Boolean]
    ): Self = this.set("overwrite", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOverwrite(value: Boolean | OverwriteFunction): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
}
