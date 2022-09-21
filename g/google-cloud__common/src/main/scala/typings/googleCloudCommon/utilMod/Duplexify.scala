package typings.googleCloudCommon.utilMod

import typings.googleCloudCommon.googleCloudCommonBooleans.`false`
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duplexify extends Duplex {
  
  val destroyed: Boolean = js.native
  
  def setReadable(): Unit = js.native
  def setReadable(readable: Readable): Unit = js.native
  @JSName("setReadable")
  def setReadable_false(readable: `false`): Unit = js.native
  
  def setWritable(): Unit = js.native
  def setWritable(writable: Writable): Unit = js.native
  @JSName("setWritable")
  def setWritable_false(writable: `false`): Unit = js.native
}
