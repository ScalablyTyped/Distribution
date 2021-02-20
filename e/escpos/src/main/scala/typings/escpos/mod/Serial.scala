package typings.escpos.mod

import typings.escpos.anon.AutoOpen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Serial")
@js.native
class Serial protected () extends Adapter {
  def this(port: Double) = this()
  def this(port: Double, options: AutoOpen) = this()
  
  def close(): Serial = js.native
  def close(callback: js.UndefOr[scala.Nothing], timeout: Double): Serial = js.native
  def close(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit]): Serial = js.native
  def close(callback: js.Function2[/* error */ js.Any, /* device */ this.type, Unit], timeout: Double): Serial = js.native
  
  def open(): Serial = js.native
  def open(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Serial = js.native
}
