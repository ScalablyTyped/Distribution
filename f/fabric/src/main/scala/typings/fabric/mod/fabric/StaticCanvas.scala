package typings.fabric.mod.fabric

import typings.fabric.anon.Objects
import typings.fabric.fabricImplMod.ICanvasOptions
import typings.fabric.fabricStrings.getImageData
import typings.fabric.fabricStrings.setLineDash
import typings.fabric.fabricStrings.toDataURL
import typings.fabric.fabricStrings.toDataURLWithQuality
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.StaticCanvas")
@js.native
/**
  * Constructor
  * @param {HTMLElement | String} el <canvas> element to initialize instance on
  * @param {Object} [options] Options object
  * @return {Object} thisArg
  */
open class StaticCanvas ()
  extends typings.fabric.fabricImplMod.StaticCanvas {
  def this(element: String) = this()
  def this(element: HTMLCanvasElement) = this()
  def this(element: String, options: ICanvasOptions) = this()
  def this(element: Null, options: ICanvasOptions) = this()
  def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
}
/* static members */
object StaticCanvas {
  
  @JSImport("fabric", "fabric.StaticCanvas")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @static
    * @default
    */
  @JSImport("fabric", "fabric.StaticCanvas.EMPTY_JSON")
  @js.native
  def EMPTY_JSON: String = js.native
  inline def EMPTY_JSON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_JSON")(x.asInstanceOf[js.Any])
  
  /**
    * Provides a way to check support of some of the canvas methods
    * (either those of HTMLCanvasElement itself, or rendering context)
    *
    * @param {String} methodName Method to check support for;
    *                            Could be one of "setLineDash"
    * @return {Boolean | null} `true` if method is supported (or at least exists),
    *                          `null` if canvas element or context can not be initialized
    */
  inline def supports(methodName: getImageData | toDataURL | toDataURLWithQuality | setLineDash): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supports")(methodName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns JSON representation of canvas
    * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    */
  inline def toJSON(): Objects = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[Objects]
  inline def toJSON(propertiesToInclude: js.Array[String]): Objects = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(propertiesToInclude.asInstanceOf[js.Any]).asInstanceOf[Objects]
}
