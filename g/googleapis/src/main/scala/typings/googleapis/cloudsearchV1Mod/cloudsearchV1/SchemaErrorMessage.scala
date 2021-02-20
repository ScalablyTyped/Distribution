package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error message per source response.
  */
@js.native
trait SchemaErrorMessage extends StObject {
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[SchemaSource] = js.native
}
object SchemaErrorMessage {
  
  @scala.inline
  def apply(): SchemaErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorMessage]
  }
  
  @scala.inline
  implicit class SchemaErrorMessageMutableBuilder[Self <: SchemaErrorMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
