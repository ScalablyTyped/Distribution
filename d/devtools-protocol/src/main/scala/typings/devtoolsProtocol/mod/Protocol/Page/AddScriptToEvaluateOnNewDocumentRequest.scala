package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddScriptToEvaluateOnNewDocumentRequest extends StObject {
  
  var source: String = js.native
  
  /**
    * If specified, creates an isolated world with the given name and evaluates given script in it.
    * This world name will be used as the ExecutionContextDescription::name when the corresponding
    * event is emitted.
    */
  var worldName: js.UndefOr[String] = js.native
}
object AddScriptToEvaluateOnNewDocumentRequest {
  
  @scala.inline
  def apply(source: String): AddScriptToEvaluateOnNewDocumentRequest = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnNewDocumentRequest]
  }
  
  @scala.inline
  implicit class AddScriptToEvaluateOnNewDocumentRequestMutableBuilder[Self <: AddScriptToEvaluateOnNewDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldName(value: String): Self = StObject.set(x, "worldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldNameUndefined: Self = StObject.set(x, "worldName", js.undefined)
  }
}
