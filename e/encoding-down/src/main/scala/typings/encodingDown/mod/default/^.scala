package typings.encodingDown.mod.default

import org.scalablytyped.runtime.TopLevel
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.encodingDown.mod.EncodingDown
import typings.encodingDown.mod.EncodingDown.Constructor
import typings.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("encoding-down", JSImport.Default)
@js.native
class ^[K, V] protected () extends EncodingDown[K, V] {
  // tslint:disable-next-line:no-unnecessary-generics
  def this(db: AbstractLevelDOWN[_, _]) = this()
  def this(db: AbstractLevelDOWN[_, _], options: CodecOptions) = this()
}

@JSImport("encoding-down", JSImport.Default)
@js.native
object ^ extends TopLevel[Constructor]

