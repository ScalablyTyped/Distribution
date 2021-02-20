package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ReloadDocumentRequest. */
@js.native
trait IReloadDocumentRequest extends StObject {
  
  /** ReloadDocumentRequest gcsSource */
  var gcsSource: js.UndefOr[IGcsSource | Null] = js.native
  
  /** ReloadDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.native
}
object IReloadDocumentRequest {
  
  @scala.inline
  def apply(): IReloadDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReloadDocumentRequest]
  }
  
  @scala.inline
  implicit class IReloadDocumentRequestMutableBuilder[Self <: IReloadDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsSource(value: IGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceNull: Self = StObject.set(x, "gcsSource", null)
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
