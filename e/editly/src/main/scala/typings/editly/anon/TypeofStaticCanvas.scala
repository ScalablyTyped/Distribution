package typings.editly.anon

import org.scalablytyped.runtime.Instantiable0
import typings.editly.editlyStrings.getImageData
import typings.editly.editlyStrings.setLineDash
import typings.editly.editlyStrings.toDataURL
import typings.editly.editlyStrings.toDataURLWithQuality
import typings.fabric.mod.fabric.StaticCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStaticCanvas
  extends StObject
     with Instantiable0[StaticCanvas] {
  
  /**
    * @static
    * @type String
    * @default
    */
  var EMPTY_JSON: String = js.native
  
  /**
    * Provides a way to check support of some of the canvas methods
    * (either those of HTMLCanvasElement itself, or rendering context)
    *
    * @param {String} methodName Method to check support for;
    *                            Could be one of "setLineDash"
    * @return {Boolean | null} `true` if method is supported (or at least exists),
    *                          `null` if canvas element or context can not be initialized
    */
  def supports(methodName: getImageData | toDataURL | toDataURLWithQuality | setLineDash): Boolean = js.native
  
  /**
    * Returns JSON representation of canvas
    * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    */
  def toJSON(): String = js.native
  def toJSON(propertiesToInclude: js.Array[String]): String = js.native
}
