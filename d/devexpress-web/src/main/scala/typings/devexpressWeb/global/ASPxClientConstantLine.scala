package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ConstantLine class.
  */
@JSGlobal("ASPxClientConstantLine")
@js.native
open class ASPxClientConstantLine ()
  extends StObject
     with typings.devexpressWeb.ASPxClientConstantLine {
  
  /**
    * Gets the axis that owns the current constant line object.
    */
  /* CompleteClass */
  var axis: typings.devexpressWeb.ASPxClientAxis = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the constant line title.
    */
  /* CompleteClass */
  var title: String = js.native
  
  /**
    * Gets the constant line's position along the axis.
    */
  /* CompleteClass */
  var value: Any = js.native
}
