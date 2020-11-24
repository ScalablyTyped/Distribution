package typings.ebml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Decoder = typings.ebml.mod.Decoder_
  
  type Encoder = typings.ebml.mod.Encoder_
  
  type StateAndTagData = js.Tuple2[
    typings.ebml.ebmlStrings.tag | typings.ebml.ebmlStrings.start | typings.ebml.ebmlStrings.end, 
    typings.ebml.mod.Tag[js.Any] | typings.ebml.mod.TagMetadata
  ]
  
  type Tag[T /* <: typings.ebml.mod.TagType */] = typings.ebml.mod.Tag_[T]
}
