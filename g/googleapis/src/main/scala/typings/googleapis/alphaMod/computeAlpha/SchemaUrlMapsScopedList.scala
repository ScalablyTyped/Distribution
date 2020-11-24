package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUrlMapsScopedList extends js.Object {
  
  /**
    * A list of UrlMaps contained in this scope.
    */
  var urlMaps: js.UndefOr[js.Array[SchemaUrlMap]] = js.native
  
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaUrlMapsScopedList {
  
  @scala.inline
  def apply(): SchemaUrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsScopedList]
  }
  
  @scala.inline
  implicit class SchemaUrlMapsScopedListOps[Self <: SchemaUrlMapsScopedList] (val x: Self) extends AnyVal {
    
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
    def setUrlMapsVarargs(value: SchemaUrlMap*): Self = this.set("urlMaps", js.Array(value :_*))
    
    @scala.inline
    def setUrlMaps(value: js.Array[SchemaUrlMap]): Self = this.set("urlMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlMaps: Self = this.set("urlMaps", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
