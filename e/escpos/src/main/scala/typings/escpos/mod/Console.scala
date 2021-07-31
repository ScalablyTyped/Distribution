package typings.escpos.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Console")
@js.native
class Console ()
  extends StObject
     with Adapter {
  def this(handler: js.Function1[/* data */ js.Array[js.Array[js.Any]], Unit]) = this()
  
  def open(): Console = js.native
  /* CompleteClass */
  override def open(args: js.Any*): Adapter = js.native
  def open(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Console = js.native
  
  def write(data: Buffer): Console = js.native
  /* CompleteClass */
  override def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter = js.native
}
