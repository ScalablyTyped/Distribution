package typings.domWebcodecs

import typings.std.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffscreenCanvasRenderingContext2D extends StObject {
  
  def createPattern(image: CanvasImageSourceWebCodecs): CanvasPattern | Null = js.native
  def createPattern(image: CanvasImageSourceWebCodecs, repetition: String): CanvasPattern | Null = js.native
  
  def drawImage(image: CanvasImageSourceWebCodecs, dx: Double, dy: Double): Unit = js.native
  def drawImage(image: CanvasImageSourceWebCodecs, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
  def drawImage(
    image: CanvasImageSourceWebCodecs,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  ): Unit = js.native
}
