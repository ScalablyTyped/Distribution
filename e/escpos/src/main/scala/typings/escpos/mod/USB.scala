package typings.escpos.mod

import typings.escpos.escposBooleans.`false`
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "USB")
@js.native
class USB ()
  extends StObject
     with Adapter {
  def this(vid: String) = this()
  def this(vid: String, pid: String) = this()
  def this(vid: Unit, pid: String) = this()
  
  def close(): USB = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): USB = js.native
  
  def open(): USB = js.native
  /* CompleteClass */
  override def open(args: js.Any*): Adapter = js.native
  def open(callback: js.Function2[/* error */ js.Any, /* device */ js.UndefOr[this.type], Unit]): USB = js.native
  
  /* CompleteClass */
  override def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter = js.native
}
/* static members */
object USB {
  
  @JSImport("escpos", "USB")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findPrinter(): js.Array[USB] | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("findPrinter")().asInstanceOf[js.Array[USB] | `false`]
  
  @scala.inline
  def getDevice(): js.Promise[USB] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevice")().asInstanceOf[js.Promise[USB]]
  @scala.inline
  def getDevice(vid: String): js.Promise[USB] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevice")(vid.asInstanceOf[js.Any]).asInstanceOf[js.Promise[USB]]
  @scala.inline
  def getDevice(vid: String, pid: String): js.Promise[USB] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevice")(vid.asInstanceOf[js.Any], pid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[USB]]
  @scala.inline
  def getDevice(vid: Unit, pid: String): js.Promise[USB] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDevice")(vid.asInstanceOf[js.Any], pid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[USB]]
}
