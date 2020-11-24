package typings.expressOpenapi.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationHandlerArray
  extends /* index */ NumberDictionary[RequestHandler[ParamsDictionary, _, _, Query]]
     with Operation {
  
  var apiDoc: js.UndefOr[typings.openapiTypes.mod.OpenAPI.Operation] = js.native
}
object OperationHandlerArray {
  
  @scala.inline
  def apply(): OperationHandlerArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationHandlerArray]
  }
  
  @scala.inline
  implicit class OperationHandlerArrayOps[Self <: OperationHandlerArray] (val x: Self) extends AnyVal {
    
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
    def setApiDoc(value: typings.openapiTypes.mod.OpenAPI.Operation): Self = this.set("apiDoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiDoc: Self = this.set("apiDoc", js.undefined)
  }
}
