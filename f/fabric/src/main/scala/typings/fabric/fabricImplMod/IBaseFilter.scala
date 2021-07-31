package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseFilter extends StObject {
  
  /**
    * Apply the operation to a Uint8Array representing the pixels of an image.
    *
    * @param {Object} options
    * @param {ImageData} options.imageData The Uint8Array to be filtered.
    */
  def applyTo2d(options: js.Any): Unit = js.native
  
  /**
    * Sets filter's properties from options
    * @param [options] Options object
    */
  def setOptions(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  
  /**
    * Returns a JSON representation of an instance
    */
  def toJSON(): String = js.native
  
  /**
    * Returns object representation of an instance
    */
  def toObject(): js.Any = js.native
}
