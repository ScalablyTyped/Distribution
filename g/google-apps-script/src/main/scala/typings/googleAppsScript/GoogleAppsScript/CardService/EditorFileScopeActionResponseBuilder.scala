package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for EditorFileScopeActionResponse objects.
  */
trait EditorFileScopeActionResponseBuilder extends StObject {
  
  /**
    * Builds the current Editor action response.
    */
  def build(): EditorFileScopeActionResponse
  
  /**
    * Requests the drive.file scope for the current active Editor document.
    */
  def requestFileScopeForActiveDocument(): EditorFileScopeActionResponseBuilder
}
object EditorFileScopeActionResponseBuilder {
  
  inline def apply(
    build: () => EditorFileScopeActionResponse,
    requestFileScopeForActiveDocument: () => EditorFileScopeActionResponseBuilder
  ): EditorFileScopeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), requestFileScopeForActiveDocument = js.Any.fromFunction0(requestFileScopeForActiveDocument))
    __obj.asInstanceOf[EditorFileScopeActionResponseBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorFileScopeActionResponseBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => EditorFileScopeActionResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setRequestFileScopeForActiveDocument(value: () => EditorFileScopeActionResponseBuilder): Self = StObject.set(x, "requestFileScopeForActiveDocument", js.Any.fromFunction0(value))
  }
}
