package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.ITextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.IText")
@js.native
class IText protected ()
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
@JSImport("fabric", "fabric.IText")
@js.native
object IText extends js.Object {
  /**
    * Returns fabric.IText instance from an object representation
    * @static
    * @memberOf fabric.IText
    * @param {Object} object Object to create an instance from
    * @param {function} [callback] invoked with new instance as argument
    */
  def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.IText = js.native
  def fromObject(`object`: js.Any, callback: js.Function): typings.fabric.fabricImplMod.IText = js.native
}

