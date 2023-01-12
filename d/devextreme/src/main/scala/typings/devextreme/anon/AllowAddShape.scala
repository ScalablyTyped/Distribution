package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowAddShape extends StObject {
  
  /**
    * Specifies whether a user can add a shape.
    */
  var allowAddShape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can change a connection.
    */
  var allowChangeConnection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can change connector points.
    */
  var allowChangeConnectorPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can change a connector&apos;s text.
    */
  var allowChangeConnectorText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can change a shape&apos;s text.
    */
  var allowChangeShapeText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can delete a connector.
    */
  var allowDeleteConnector: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can delete a shape.
    */
  var allowDeleteShape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can move a shape.
    */
  var allowMoveShape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can resize a shape.
    */
  var allowResizeShape: js.UndefOr[Boolean] = js.undefined
}
object AllowAddShape {
  
  inline def apply(): AllowAddShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAddShape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowAddShape] (val x: Self) extends AnyVal {
    
    inline def setAllowAddShape(value: Boolean): Self = StObject.set(x, "allowAddShape", value.asInstanceOf[js.Any])
    
    inline def setAllowAddShapeUndefined: Self = StObject.set(x, "allowAddShape", js.undefined)
    
    inline def setAllowChangeConnection(value: Boolean): Self = StObject.set(x, "allowChangeConnection", value.asInstanceOf[js.Any])
    
    inline def setAllowChangeConnectionUndefined: Self = StObject.set(x, "allowChangeConnection", js.undefined)
    
    inline def setAllowChangeConnectorPoints(value: Boolean): Self = StObject.set(x, "allowChangeConnectorPoints", value.asInstanceOf[js.Any])
    
    inline def setAllowChangeConnectorPointsUndefined: Self = StObject.set(x, "allowChangeConnectorPoints", js.undefined)
    
    inline def setAllowChangeConnectorText(value: Boolean): Self = StObject.set(x, "allowChangeConnectorText", value.asInstanceOf[js.Any])
    
    inline def setAllowChangeConnectorTextUndefined: Self = StObject.set(x, "allowChangeConnectorText", js.undefined)
    
    inline def setAllowChangeShapeText(value: Boolean): Self = StObject.set(x, "allowChangeShapeText", value.asInstanceOf[js.Any])
    
    inline def setAllowChangeShapeTextUndefined: Self = StObject.set(x, "allowChangeShapeText", js.undefined)
    
    inline def setAllowDeleteConnector(value: Boolean): Self = StObject.set(x, "allowDeleteConnector", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteConnectorUndefined: Self = StObject.set(x, "allowDeleteConnector", js.undefined)
    
    inline def setAllowDeleteShape(value: Boolean): Self = StObject.set(x, "allowDeleteShape", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteShapeUndefined: Self = StObject.set(x, "allowDeleteShape", js.undefined)
    
    inline def setAllowMoveShape(value: Boolean): Self = StObject.set(x, "allowMoveShape", value.asInstanceOf[js.Any])
    
    inline def setAllowMoveShapeUndefined: Self = StObject.set(x, "allowMoveShape", js.undefined)
    
    inline def setAllowResizeShape(value: Boolean): Self = StObject.set(x, "allowResizeShape", value.asInstanceOf[js.Any])
    
    inline def setAllowResizeShapeUndefined: Self = StObject.set(x, "allowResizeShape", js.undefined)
  }
}
