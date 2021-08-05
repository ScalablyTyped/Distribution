package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.ICanvasOptions
import typings.fabric.fabricStrings.getImageData
import typings.fabric.fabricStrings.setLineDash
import typings.fabric.fabricStrings.toDataURL
import typings.fabric.fabricStrings.toDataURLWithQuality
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Canvas")
@js.native
/**
  * Constructor
  * @param element <canvas> element to initialize instance on
  * @param [options] Options object
  */
class Canvas ()
  extends typings.fabric.fabricImplMod.Canvas {
  def this(element: String) = this()
  def this(element: HTMLCanvasElement) = this()
  def this(element: String, options: ICanvasOptions) = this()
  def this(element: Null, options: ICanvasOptions) = this()
  def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
}
/* static members */
object Canvas {
  
  @JSImport("fabric", "fabric.Canvas")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric", "fabric.Canvas.EMPTY_JSON")
  @js.native
  def EMPTY_JSON: String = js.native
  inline def EMPTY_JSON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_JSON")(x.asInstanceOf[js.Any])
  
  /**
    * Provides a way to check support of some of the canvas methods
    * (either those of HTMLCanvasElement itself, or rendering context)
    * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
    */
  inline def supports_getImageData(methodName: getImageData): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supports")(methodName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def supports_setLineDash(methodName: setLineDash): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supports")(methodName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def supports_toDataURL(methodName: toDataURL): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supports")(methodName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def supports_toDataURLWithQuality(methodName: toDataURLWithQuality): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supports")(methodName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns JSON representation of canvas
    * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    */
  inline def toJSON(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[String]
  inline def toJSON(propertiesToInclude: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(propertiesToInclude.asInstanceOf[js.Any]).asInstanceOf[String]
}
