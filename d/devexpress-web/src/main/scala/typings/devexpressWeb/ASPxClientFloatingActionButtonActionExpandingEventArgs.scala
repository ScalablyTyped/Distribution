package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ActionExpanding event.
  */
trait ASPxClientFloatingActionButtonActionExpandingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the FAB action's context name.
    */
  var contextName: String
}
object ASPxClientFloatingActionButtonActionExpandingEventArgs {
  
  inline def apply(contextName: String): ASPxClientFloatingActionButtonActionExpandingEventArgs = {
    val __obj = js.Dynamic.literal(contextName = contextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionExpandingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientFloatingActionButtonActionExpandingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setContextName(value: String): Self = StObject.set(x, "contextName", value.asInstanceOf[js.Any])
  }
}
