package typings.editly.anon

import org.scalablytyped.runtime.Instantiable0
import typings.fabric.mod.fabric.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofObject
  extends StObject
     with Instantiable0[Object] {
  
  /**
    * Defines the number of fraction digits to use when serializing object values.
    */
  var NUM_FRACTION_DIGITS: js.UndefOr[Double] = js.native
  
  /**
    * Creates fabric Object instance
    * @param {string} Class name
    * @param {fabric.Object} Original object
    * @param {Function} Callback when complete
    * @param {Object} Extra parameters for fabric.Object
    * @private
    * @return {fabric.Object}
    */
  def _fromObject(className: String, `object`: typings.fabric.fabricImplMod.Object): typings.fabric.fabricImplMod.Object = js.native
  def _fromObject(className: String, `object`: typings.fabric.fabricImplMod.Object, callback: js.Function): typings.fabric.fabricImplMod.Object = js.native
  def _fromObject(
    className: String,
    `object`: typings.fabric.fabricImplMod.Object,
    callback: js.Function,
    extraParam: Any
  ): typings.fabric.fabricImplMod.Object = js.native
  def _fromObject(className: String, `object`: typings.fabric.fabricImplMod.Object, callback: Unit, extraParam: Any): typings.fabric.fabricImplMod.Object = js.native
}
