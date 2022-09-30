package typings.editly.anon

import org.scalablytyped.runtime.Instantiable1
import typings.fabric.mod.fabric.IText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIText
  extends StObject
     with Instantiable1[/* text */ String, IText] {
  
  /**
    * Returns fabric.IText instance from an object representation
    * @static
    * @memberOf fabric.IText
    * @param {Object} object Object to create an instance from
    * @param {function} [callback] invoked with new instance as argument
    */
  def fromObject(`object`: Any): typings.fabric.fabricImplMod.IText = js.native
  def fromObject(`object`: Any, callback: js.Function): typings.fabric.fabricImplMod.IText = js.native
}
