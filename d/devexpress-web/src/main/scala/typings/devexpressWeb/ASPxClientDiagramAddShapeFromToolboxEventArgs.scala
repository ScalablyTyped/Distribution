package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
trait ASPxClientDiagramAddShapeFromToolboxEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The type of the processed shape.
    */
  var `type`: String
}
object ASPxClientDiagramAddShapeFromToolboxEventArgs {
  
  inline def apply(`type`: String): ASPxClientDiagramAddShapeFromToolboxEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramAddShapeFromToolboxEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDiagramAddShapeFromToolboxEventArgs] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
