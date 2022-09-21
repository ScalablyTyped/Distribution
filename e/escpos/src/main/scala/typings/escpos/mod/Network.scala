package typings.escpos.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Network")
@js.native
open class Network protected ()
  extends StObject
     with Adapter {
  def this(address: String) = this()
  def this(address: String, port: Double) = this()
  
  def close(): Network = js.native
  def close(callback: js.Function2[/* error */ Any, /* device */ this.type, Unit]): Network = js.native
  
  def open(): Network = js.native
  /* CompleteClass */
  override def open(args: Any*): Adapter = js.native
  def open(callback: js.Function2[/* error */ Any, /* device */ this.type, Unit]): Network = js.native
  
  /* CompleteClass */
  override def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[Any], Unit]): Adapter = js.native
}
