package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of ASPxClientDashboardParameter objects.
  */
@JSGlobal("ASPxClientDashboardParameters")
@js.native
open class ASPxClientDashboardParameters ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardParameters {
  
  /**
    * Returns a dashboard parameter by its index in the ASPxClientDashboardParameters collection. A ASPxClientDashboardParameter object that is the client-side dashboard parameter.
    * @param index An integer value that specifies the parameter index.
    */
  /* CompleteClass */
  override def GetParameterByIndex(index: Double): typings.devexpressWeb.ASPxClientDashboardParameter = js.native
  
  /**
    * Returns a dashboard parameter by its name. A ASPxClientDashboardParameter object that is the client-side dashboard parameter.
    * @param name A String object that specifies the parameter name.
    */
  /* CompleteClass */
  override def GetParameterByName(name: String): typings.devexpressWeb.ASPxClientDashboardParameter = js.native
  
  /**
    * Returns an array of dashboard parameters from the ASPxClientDashboardParameters collection.
    */
  /* CompleteClass */
  override def GetParameterList(): js.Array[typings.devexpressWeb.ASPxClientDashboardParameter] = js.native
}
