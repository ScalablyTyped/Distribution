package typings.dialogflow.protosProtosMod.google.protobuf.UninterpretedOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a NamePart. */
trait INamePart extends js.Object {
  /** NamePart isExtension */
  var isExtension: Boolean
  /** NamePart namePart */
  var namePart: String
}

object INamePart {
  @scala.inline
  def apply(isExtension: Boolean, namePart: String): INamePart = {
    val __obj = js.Dynamic.literal(isExtension = isExtension, namePart = namePart)
  
    __obj.asInstanceOf[INamePart]
  }
}

