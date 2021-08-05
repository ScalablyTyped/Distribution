package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.Private.PreferencesOptions
import typings.forgeViewer.anon.ButtonText
import typings.std.Element
import typings.three.mod.Box3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Private {
  
  @JSGlobal("Autodesk.Viewing.Private")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Autodesk.Viewing.Private.BoundsCallback")
  @js.native
  class BoundsCallback protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.BoundsCallback {
    def this(bounds: Box3) = this()
    
    /* CompleteClass */
    override def onCircularArc(cx: Double, cy: Double, start: Double, end: Double, radius: Double, vpId: Double): Unit = js.native
    
    /* CompleteClass */
    override def onEllipticalArc(
      cx: Double,
      cy: Double,
      start: Double,
      end: Double,
      major: Double,
      minor: Double,
      tilt: Double,
      vpId: Double
    ): Unit = js.native
    
    /* CompleteClass */
    override def onLineSegment(x1: Double, y1: Double, x2: Double, y2: Double, vpId: Double): Unit = js.native
    
    /* CompleteClass */
    override def onOneTriangle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, vpId: Double): Unit = js.native
    
    /* CompleteClass */
    override def onTexQuad(centerX: Double, centerY: Double, width: Double, height: Double, rotation: Double, vpId: Double): Unit = js.native
    
    /* CompleteClass */
    override def onVertex(cx: Double, cy: Double, vpId: Double): Unit = js.native
  }
  
  object HudMessage {
    
    @JSGlobal("Autodesk.Viewing.Private.HudMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def dismiss(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[Boolean]
    
    inline def displayMessage(container: Element, messageSpec: ButtonText): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(container: Element, messageSpec: ButtonText, closeCallback: js.Function1[/* event */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: js.Function1[/* event */ js.Any, Unit],
      buttonCallback: js.Function1[/* event */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: js.Function1[/* event */ js.Any, Unit],
      buttonCallback: js.Function1[/* event */ js.Any, Unit],
      checkboxCallback: js.Function1[/* event */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any], checkboxCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: js.Function1[/* event */ js.Any, Unit],
      buttonCallback: Unit,
      checkboxCallback: js.Function1[/* event */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any], checkboxCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: Unit,
      buttonCallback: js.Function1[/* event */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: Unit,
      buttonCallback: js.Function1[/* event */ js.Any, Unit],
      checkboxCallback: js.Function1[/* event */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any], checkboxCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: Unit,
      buttonCallback: Unit,
      checkboxCallback: js.Function1[/* event */ js.Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any], checkboxCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Autodesk.Viewing.Private.Preferences")
  @js.native
  class Preferences protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.Preferences {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D, options: PreferencesOptions) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.Private.VertexBufferReader")
  @js.native
  class VertexBufferReader protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.VertexBufferReader {
    def this(geometry: js.Any) = this()
    def this(geometry: js.Any, use2dInstancing: Boolean) = this()
    
    /* CompleteClass */
    override def enumGeoms(filter: js.Any, callback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def enumGeomsForObject(dbId: Double, callback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def enumGeomsForVisibleLayer(layerIdsVisible: js.Array[Double], callback: js.Any): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.Viewer3DImpl")
  @js.native
  class Viewer3DImpl protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.Viewer3DImpl {
    def this(thecanvas: js.Any, theapi: js.Any) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.Private.ViewerState")
  @js.native
  class ViewerState protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.ViewerState {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.Private.VisibilityManager")
  @js.native
  class VisibilityManager protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.VisibilityManager {
    def this(viewerImpl: js.Any, model: js.Any) = this()
  }
  
  inline def calculatePrecision(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculatePrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def convertUnits(fromUnits: String, toUnits: String, calibrationFactor: Double, d: Double, `type`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUnits")(fromUnits.asInstanceOf[js.Any], toUnits.asInstanceOf[js.Any], calibrationFactor.asInstanceOf[js.Any], d.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("Autodesk.Viewing.Private.env")
  @js.native
  val env: String = js.native
  
  inline def fadeValue(
    startValue: Double,
    endValue: Double,
    duration: Double,
    setParam: js.Function1[/* value */ Double, Unit]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeValue")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], setParam.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fadeValue(
    startValue: Double,
    endValue: Double,
    duration: Double,
    setParam: js.Function1[/* value */ Double, Unit],
    onFinished: js.Function0[Unit]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeValue")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], setParam.asInstanceOf[js.Any], onFinished.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def formatValueWithUnits(value: Double, units: String, `type`: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValueWithUnits")(value.asInstanceOf[js.Any], units.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getHtmlTemplate(url: String, callback: js.Function2[/* error */ String, /* content */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlTemplate")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lerp(x: Double, y: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
}
