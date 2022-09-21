package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.ITextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.IText")
@js.native
open class IText protected ()
  extends typings.fabric.fabricImplMod.IText {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: ITextOptions) = this()
}
/* static members */
object IText {
  
  @JSImport("fabric", "fabric.IText")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns fabric.IText instance from an object representation
    * @static
    * @memberOf fabric.IText
    * @param {Object} object Object to create an instance from
    * @param {function} [callback] invoked with new instance as argument
    */
  inline def fromObject(`object`: Any): typings.fabric.fabricImplMod.IText = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.IText]
  inline def fromObject(`object`: Any, callback: js.Function): typings.fabric.fabricImplMod.IText = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.IText]
}
