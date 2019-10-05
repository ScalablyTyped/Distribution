package typings.ebml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ebmlMod {
  import typings.ebml.ebmlStrings.end
  import typings.ebml.ebmlStrings.start
  import typings.ebml.ebmlStrings.tag

  type Decoder = Decoder_
  type Encoder = Encoder_
  type StateAndTagData = js.Tuple2[tag | start | end, Tag[js.Any] | TagMetadata]
  type Tag[T /* <: TagType */] = Tag_[T]
}
