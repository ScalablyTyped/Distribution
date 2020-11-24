package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Third-party Python runtime library that is required by the application.
  */
@js.native
trait SchemaLibrary extends js.Object {
  
  /**
    * Name of the library. Example: &quot;django&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Version of the library to select, or &quot;latest&quot;.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaLibrary {
  
  @scala.inline
  def apply(): SchemaLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLibrary]
  }
  
  @scala.inline
  implicit class SchemaLibraryOps[Self <: SchemaLibrary] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
