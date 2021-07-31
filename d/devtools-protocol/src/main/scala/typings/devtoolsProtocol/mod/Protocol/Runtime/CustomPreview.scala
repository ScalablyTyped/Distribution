package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPreview extends StObject {
  
  /**
    * If formatter returns true as a result of formatter.hasBody call then bodyGetterId will
    * contain RemoteObjectId for the function that returns result of formatter.body(object, config) call.
    * The result value is json ML array.
    */
  var bodyGetterId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * The JSON-stringified result of formatter.header(object, config) call.
    * It contains json ML array that represents RemoteObject.
    */
  var header: String
}
object CustomPreview {
  
  @scala.inline
  def apply(header: String): CustomPreview = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreview]
  }
  
  @scala.inline
  implicit class CustomPreviewMutableBuilder[Self <: CustomPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyGetterId(value: RemoteObjectId): Self = StObject.set(x, "bodyGetterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyGetterIdUndefined: Self = StObject.set(x, "bodyGetterId", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
