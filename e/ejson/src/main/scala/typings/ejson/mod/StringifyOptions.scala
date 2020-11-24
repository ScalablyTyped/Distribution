package typings.ejson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringifyOptions extends js.Object {
  
  var canonical: Boolean = js.native
  
  var indent: Boolean | Double | String = js.native
}
object StringifyOptions {
  
  @scala.inline
  def apply(canonical: Boolean, indent: Boolean | Double | String): StringifyOptions = {
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyOptions]
  }
  
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
    
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
    def setIndent(value: Boolean | Double | String): Self = this.set("indent", value.asInstanceOf[js.Any])
  }
}
