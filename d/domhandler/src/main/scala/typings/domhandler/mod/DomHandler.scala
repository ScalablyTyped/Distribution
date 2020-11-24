package typings.domhandler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domhandler", "DomHandler")
@js.native
class DomHandler protected () extends js.Object {
  def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _]) = this()
  def this(
    callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _],
    options: DomHandlerOptions
  ) = this()
  
  def oncdatastart(): Unit = js.native
  
  def onclosetag(): Unit = js.native
  
  def oncomment(data: String): Unit = js.native
  
  def oncommentend(): Unit = js.native
  
  /***
    * Signals the handler that parsing is done
    */
  def onend(): Unit = js.native
  
  def onerror(error: Error): Unit = js.native
  
  def onopentag(name: String, attribs: StringDictionary[String]): Unit = js.native
  
  def onparserinit(parser: js.Any): Unit = js.native
  
  def onprocessinginstruction(name: String, data: String): Unit = js.native
  
  /***
    * Resets the handler back to starting state
    */
  def onreset(): Unit = js.native
  
  def ontext(data: String): Unit = js.native
}
