package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "CircleBrush")
@js.native
open class CircleBrush () extends BaseBrush {
  
  /**
    * @return Just added pointer point
    */
  def addPoint(pointer: Any): Point = js.native
  
  /**
    * Invoked inside on mouse down and mouse move
    */
  def drawDot(pointer: Any): Unit = js.native
}
