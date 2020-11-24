package typings.emberCliBabelPluginHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPluginOptions extends js.Object {
  
  /**
    * Any plugins that the given one must appear *after* in the plugins array.
    */
  var after: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Any plugins that the given one must appear *before* in the plugins array.
    */
  var before: js.UndefOr[js.Array[String]] = js.native
}
object AddPluginOptions {
  
  @scala.inline
  def apply(): AddPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPluginOptions]
  }
  
  @scala.inline
  implicit class AddPluginOptionsOps[Self <: AddPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: String*): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: js.Array[String]): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
}
