package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GcsSource. */
trait IGcsSource extends StObject {
  
  /** GcsSource uri */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object IGcsSource {
  
  inline def apply(): IGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGcsSource]
  }
  
  extension [Self <: IGcsSource](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
