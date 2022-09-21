package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Material extends StObject {
  
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  var alphaTest: Double = js.native
  
  var blendDst: BlendingSrcFactor = js.native
  
  var blendDstAlpha: Double = js.native
  
  var blendEquation: BlendingEquation = js.native
  
  var blendEquationAlpha: Double = js.native
  
  var blendSrc: BlendingDstFactor = js.native
  
  var blendSrcAlpha: Double = js.native
  
  var blending: Blending = js.native
  
  def clone(material: Material): Material = js.native
  
  var colorWrite: Boolean = js.native
  
  def copy(source: Material): Material = js.native
  
  var depthTest: Boolean = js.native
  
  var depthWrite: Boolean = js.native
  
  def dispatchEvent(event: Target): Unit = js.native
  
  def dispose(): Unit = js.native
  
  def hasEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var needsUpdate: Boolean = js.native
  
  var opacity: Double = js.native
  
  var overdraw: Double = js.native
  
  var polygonOffset: Boolean = js.native
  
  var polygonOffsetFactor: Double = js.native
  
  var polygonOffsetUnits: Double = js.native
  
  def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  def setValues(parameters: MaterialParameters): Unit = js.native
  
  var side: Side = js.native
  
  def toJSON(): Any = js.native
  def toJSON(meta: Any): Any = js.native
  
  var `type`: String = js.native
  
  def update(): Unit = js.native
  
  var uuid: String = js.native
  
  var visible: Boolean = js.native
}
