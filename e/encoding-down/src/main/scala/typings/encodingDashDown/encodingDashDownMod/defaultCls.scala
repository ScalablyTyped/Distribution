package typings.encodingDashDown.encodingDashDownMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.levelDashCodec.levelDashCodecMod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("encoding-down", JSImport.Default)
@js.native
class defaultCls[K, V] protected () extends EncodingDown[K, V] {
  // tslint:disable-next-line:no-unnecessary-generics
  def this(db: AbstractLevelDOWN[_, _]) = this()
  def this(db: AbstractLevelDOWN[_, _], options: CodecOptions) = this()
}

