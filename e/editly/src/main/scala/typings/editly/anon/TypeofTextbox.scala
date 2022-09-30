package typings.editly.anon

import org.scalablytyped.runtime.Instantiable1
import typings.fabric.mod.fabric.Textbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTextbox
  extends StObject
     with Instantiable1[/* text */ String, Textbox] {
  
  /**
    * Returns fabric.Textbox instance from an object representation
    * @static
    * @memberOf fabric.Textbox
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Textbox instance is created
    */
  def fromObject(`object`: Any): typings.fabric.fabricImplMod.Textbox = js.native
  def fromObject(`object`: Any, callback: js.Function): typings.fabric.fabricImplMod.Textbox = js.native
}
