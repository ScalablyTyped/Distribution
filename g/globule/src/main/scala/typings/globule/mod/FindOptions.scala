package typings.globule.mod

import typings.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOptions extends IOptions {
  
  var filter: js.UndefOr[
    String | (js.Function2[/* filepath */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], Boolean])
  ] = js.native
  
  var prefixBase: js.UndefOr[Boolean] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var srcBase: js.UndefOr[String] = js.native
}
object FindOptions {
  
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
  
  @scala.inline
  implicit class FindOptionsOps[Self <: FindOptions] (val x: Self) extends AnyVal {
    
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
    def setFilterFunction2(value: (/* filepath */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilter(
      value: String | (js.Function2[/* filepath */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], Boolean])
    ): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setPrefixBase(value: Boolean): Self = this.set("prefixBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixBase: Self = this.set("prefixBase", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setSrcBase(value: String): Self = this.set("srcBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcBase: Self = this.set("srcBase", js.undefined)
  }
}
