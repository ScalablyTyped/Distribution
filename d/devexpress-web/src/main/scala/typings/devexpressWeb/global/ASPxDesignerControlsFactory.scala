package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ASPxDesignerControlsFactory")
@js.native
open class ASPxDesignerControlsFactory ()
  extends StObject
     with typings.devexpressWeb.ASPxDesignerControlsFactory {
  
  /* CompleteClass */
  override def createPopularBindingInfo(
    options: typings.devexpressWeb.ASPxDesignerElementSerializationInfoWithBindings,
    isExpression: Boolean
  ): typings.devexpressWeb.ASPxDesignerElementSerializationInfoWithBindings = js.native
  
  /* CompleteClass */
  override def getControlInfo(controlType: String): typings.devexpressWeb.ASPxDesignerToolboxItem = js.native
  
  /* CompleteClass */
  override def getControlType(model: Any): String = js.native
  
  /* CompleteClass */
  override def getPropertyInfo(controlType: String, propertyDisplayName: String): typings.devexpressWeb.ASPxDesignerElementSerializationInfo = js.native
  
  /* CompleteClass */
  override def hideExpressionBindings(controlType: String, propertyNames: String*): Unit = js.native
  
  /* CompleteClass */
  override def inheritControl(parentType: String, extendedOptions: typings.devexpressWeb.ASPxDesignerToolboxItem): typings.devexpressWeb.ASPxDesignerToolboxItem = js.native
  
  /* CompleteClass */
  override def registerControl(typeName: String, metadata: typings.devexpressWeb.ASPxDesignerToolboxItem): Unit = js.native
  
  /* CompleteClass */
  override def setExpressionBinding(
    controlType: String,
    propertyName: String,
    events: js.Array[String],
    group: String,
    objectProperties: js.Array[String]
  ): Unit = js.native
}
