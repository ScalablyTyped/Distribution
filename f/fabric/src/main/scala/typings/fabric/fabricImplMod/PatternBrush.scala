package typings.fabric.fabricImplMod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "PatternBrush")
@js.native
open class PatternBrush protected () extends PencilBrush {
  /**
    * Constructor
    * @param {Canvas} canvas
    */
  def this(canvas: Canvas) = this()
  
  /**
    * Creates "pattern" instance property
    */
  def getPattern(): Any = js.native
  
  def getPatternSrc(): HTMLCanvasElement = js.native
  
  def getPatternSrcFunction(): String = js.native
}
