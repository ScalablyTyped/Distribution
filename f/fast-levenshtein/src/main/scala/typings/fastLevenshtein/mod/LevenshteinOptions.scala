package typings.fastLevenshtein.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevenshteinOptions extends js.Object {
  
  var useCollator: js.UndefOr[Boolean] = js.native
}
object LevenshteinOptions {
  
  @scala.inline
  def apply(): LevenshteinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevenshteinOptions]
  }
  
  @scala.inline
  implicit class LevenshteinOptionsOps[Self <: LevenshteinOptions] (val x: Self) extends AnyVal {
    
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
    def setUseCollator(value: Boolean): Self = this.set("useCollator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCollator: Self = this.set("useCollator", js.undefined)
  }
}
