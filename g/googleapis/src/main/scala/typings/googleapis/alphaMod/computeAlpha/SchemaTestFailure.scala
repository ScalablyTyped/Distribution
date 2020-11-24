package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTestFailure extends js.Object {
  
  var actualService: js.UndefOr[String] = js.native
  
  var expectedService: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object SchemaTestFailure {
  
  @scala.inline
  def apply(): SchemaTestFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestFailure]
  }
  
  @scala.inline
  implicit class SchemaTestFailureOps[Self <: SchemaTestFailure] (val x: Self) extends AnyVal {
    
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
    def setActualService(value: String): Self = this.set("actualService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualService: Self = this.set("actualService", js.undefined)
    
    @scala.inline
    def setExpectedService(value: String): Self = this.set("expectedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedService: Self = this.set("expectedService", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
