package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message specifies a header location to extract JWT token.
  */
@js.native
trait SchemaJwtHeader extends js.Object {
  
  /**
    * The HTTP header name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The value prefix. The value format is &quot;value_prefix&quot; For
    * example, for &quot;Authorization: Bearer &quot;,
    * value_prefix=&quot;Bearer &quot; with a space at the end.
    */
  var valuePrefix: js.UndefOr[String] = js.native
}
object SchemaJwtHeader {
  
  @scala.inline
  def apply(): SchemaJwtHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwtHeader]
  }
  
  @scala.inline
  implicit class SchemaJwtHeaderOps[Self <: SchemaJwtHeader] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValuePrefix(value: String): Self = this.set("valuePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePrefix: Self = this.set("valuePrefix", js.undefined)
  }
}
