package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side dashboard parameter.
  */
@JSGlobal("ASPxClientDashboardParameter")
@js.native
open class ASPxClientDashboardParameter ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardParameter {
  
  /**
    * Returns a default parameter value.
    */
  /* CompleteClass */
  override def GetDefaultValue(): Any = js.native
  
  /**
    * Returns the parameter's description displayed to an end-user.
    */
  /* CompleteClass */
  override def GetDescription(): String = js.native
  
  /**
    * Returns a parameter name.
    */
  /* CompleteClass */
  override def GetName(): String = js.native
  
  /**
    * Returns a parameter type.
    */
  /* CompleteClass */
  override def GetType(): String = js.native
  
  /**
    * Returns a current parameter value(s).
    */
  /* CompleteClass */
  override def GetValue(): Any = js.native
  
  /**
    * Returns possible parameter values.
    */
  /* CompleteClass */
  override def GetValues(): js.Array[typings.devexpressWeb.ASPxClientDashboardParameterValue] = js.native
  
  /** @deprecated Use the GetName method instead. */
  /**
    * Gets the dashboard parameter name on the client side.
    */
  /* CompleteClass */
  var Name: String = js.native
  
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  /* CompleteClass */
  override def SetValue(value: Any): Unit = js.native
  
  /** @deprecated Use the GetValue method instead. */
  /**
    * Gets the dashboard parameter value on the client side.
    */
  /* CompleteClass */
  var Value: Any = js.native
}
