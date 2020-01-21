package typings.ethereumjsTx.typesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformableToBuffer extends js.Object {
  def toBuffer(): Buffer
}

object TransformableToBuffer {
  @scala.inline
  def apply(toBuffer: () => Buffer): TransformableToBuffer = {
    val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer))
  
    __obj.asInstanceOf[TransformableToBuffer]
  }
}

