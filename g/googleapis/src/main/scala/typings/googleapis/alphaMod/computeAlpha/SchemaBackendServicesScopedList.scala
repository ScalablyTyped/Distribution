package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServicesScopedList extends StObject {
  
  /**
    * A list of BackendServices contained in this scope.
    */
  var backendServices: js.UndefOr[js.Array[SchemaBackendService]] = js.undefined
  
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaBackendServicesScopedList {
  
  @scala.inline
  def apply(): SchemaBackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServicesScopedList]
  }
  
  @scala.inline
  implicit class SchemaBackendServicesScopedListMutableBuilder[Self <: SchemaBackendServicesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendServices(value: js.Array[SchemaBackendService]): Self = StObject.set(x, "backendServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServicesUndefined: Self = StObject.set(x, "backendServices", js.undefined)
    
    @scala.inline
    def setBackendServicesVarargs(value: SchemaBackendService*): Self = StObject.set(x, "backendServices", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
