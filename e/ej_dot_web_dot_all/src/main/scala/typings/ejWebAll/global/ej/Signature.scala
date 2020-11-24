package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Signature")
@js.native
class Signature protected ()
  extends typings.ejWebAll.ej.Signature {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Signature.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Signature.Model) = this()
}
/* static members */
@JSGlobal("ej.Signature")
@js.native
object Signature extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typings.ejWebAll.ej.Signature = js.native
  
  @js.native
  object SaveImageFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Signature.SaveImageFormat with Double] = js.native
    
    /* 2 */ val BMP: typings.ejWebAll.ej.Signature.SaveImageFormat.BMP with Double = js.native
    
    /* 1 */ val JPG: typings.ejWebAll.ej.Signature.SaveImageFormat.JPG with Double = js.native
    
    /* 0 */ val PNG: typings.ejWebAll.ej.Signature.SaveImageFormat.PNG with Double = js.native
    
    /* 3 */ val TIFF: typings.ejWebAll.ej.Signature.SaveImageFormat.TIFF with Double = js.native
  }
}
