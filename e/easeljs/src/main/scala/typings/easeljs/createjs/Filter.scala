package typings.easeljs.createjs

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  // methods
  def applyFilter(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: Unit,
    targetX: Double
  ): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: Unit,
    targetX: Double,
    targetY: Double
  ): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: Unit,
    targetX: Unit,
    targetY: Double
  ): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: CanvasRenderingContext2D
  ): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: CanvasRenderingContext2D,
    targetX: Double
  ): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: CanvasRenderingContext2D,
    targetX: Double,
    targetY: Double
  ): Boolean = js.native
  def applyFilter(
    ctx: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    targetCtx: CanvasRenderingContext2D,
    targetX: Unit,
    targetY: Double
  ): Boolean = js.native
  
  def getBounds(): Rectangle = js.native
}
