package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ReloadDocumentRequest. */
trait IReloadDocumentRequest extends StObject {
  
  /** ReloadDocumentRequest gcsSource */
  var gcsSource: js.UndefOr[IGcsSource | Null] = js.undefined
  
  /** ReloadDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IReloadDocumentRequest {
  
  inline def apply(): IReloadDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReloadDocumentRequest]
  }
  
  extension [Self <: IReloadDocumentRequest](x: Self) {
    
    inline def setGcsSource(value: IGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceNull: Self = StObject.set(x, "gcsSource", null)
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
