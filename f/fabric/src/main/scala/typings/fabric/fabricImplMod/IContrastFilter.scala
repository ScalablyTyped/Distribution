package typings.fabric.fabricImplMod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContrastFilter
  extends StObject
     with IBaseFilter {
  
  /**
    * Applies filter to canvas element
    * @param canvasEl Canvas element to apply filter to
    */
  def applyTo(canvasEl: HTMLCanvasElement): Unit = js.native
}
