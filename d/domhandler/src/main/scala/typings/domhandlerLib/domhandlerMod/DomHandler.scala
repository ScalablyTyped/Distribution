package typings
package domhandlerLib.domhandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domhandler", "DomHandler")
@js.native
class DomHandler protected () extends js.Object {
  def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _]) = this()
  def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _], options: DomHandlerOptions) = this()
  def oncdatastart(): scala.Unit = js.native
  def onclosetag(): scala.Unit = js.native
  def oncomment(data: java.lang.String): scala.Unit = js.native
  def oncommentend(): scala.Unit = js.native
  /***
    * Signals the handler that parsing is done
    */
  def onend(): scala.Unit = js.native
  def onerror(error: stdLib.Error): scala.Unit = js.native
  def onopentag(name: java.lang.String, attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  def onparserinit(parser: js.Any): scala.Unit = js.native
  def onprocessinginstruction(name: java.lang.String, data: java.lang.String): scala.Unit = js.native
  /***
    * Resets the handler back to starting state
    */
  def onreset(): scala.Unit = js.native
  def ontext(data: java.lang.String): scala.Unit = js.native
}

