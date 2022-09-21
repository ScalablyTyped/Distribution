package typings.escpos.mod

import typings.escpos.anon.AutoOpen
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Serial")
@js.native
open class Serial protected ()
  extends StObject
     with Adapter {
  def this(port: Double) = this()
  def this(port: Double, options: AutoOpen) = this()
  
  def close(): Serial = js.native
  def close(callback: js.Function2[/* error */ Any, /* device */ this.type, Unit]): Serial = js.native
  def close(callback: js.Function2[/* error */ Any, /* device */ this.type, Unit], timeout: Double): Serial = js.native
  def close(callback: Unit, timeout: Double): Serial = js.native
  
  def open(): Serial = js.native
  /* CompleteClass */
  override def open(args: Any*): Adapter = js.native
  def open(callback: js.Function1[/* error */ js.UndefOr[Any], Unit]): Serial = js.native
  
  /* CompleteClass */
  override def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[Any], Unit]): Adapter = js.native
}
