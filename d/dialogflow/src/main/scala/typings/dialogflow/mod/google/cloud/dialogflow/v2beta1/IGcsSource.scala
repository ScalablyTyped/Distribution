package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GcsSource. */
trait IGcsSource extends StObject {
  
  /** GcsSource uri */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object IGcsSource {
  
  @scala.inline
  def apply(): IGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGcsSource]
  }
  
  @scala.inline
  implicit class IGcsSourceMutableBuilder[Self <: IGcsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriNull: Self = StObject.set(x, "uri", null)
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
