package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client point object.
  */
@JSGlobal("ASPxClientPoint")
@js.native
class ASPxClientPoint protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientPoint {
  /**
    * Initializes a new instance of the ASPxClientPoint object. For internal use only.
    * @param x An integer value specifying the x-coordinate of the point.
    * @param y An integer value specifying the y-coordinate of the point.
    */
  def this(x: Double, y: Double) = this()
  
  /**
    * Gets the point's X-coordinate.
    */
  /* CompleteClass */
  override def GetX(): Double = js.native
  
  /**
    * Gets the point's Y-coordinate.
    */
  /* CompleteClass */
  override def GetY(): Double = js.native
}
