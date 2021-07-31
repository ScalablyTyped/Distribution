package typings.fossilDelta

import typings.fossilDelta.anon.VerifyChecksum
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fossil-delta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def apply(origin: ByteArray, delta: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(origin.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def apply(origin: ByteArray, delta: js.Array[Double], ops: VerifyChecksum): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(origin.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], ops.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def create(origin: ByteArray, target: ByteArray): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def outputSize(delta: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("outputSize")(delta.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type ByteArray = js.Array[Double] | Uint8Array | Buffer
}
