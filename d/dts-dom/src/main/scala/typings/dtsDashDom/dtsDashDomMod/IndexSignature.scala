package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`index-signature`
import typings.dtsDashDom.dtsDashDomStrings.number
import typings.dtsDashDom.dtsDashDomStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSignature
  extends DeclarationBase
     with ClassMember
     with ObjectTypeMember {
  var indexType: string | number
  var kind: `index-signature`
  var name: String
  var valueType: Type
}

object IndexSignature {
  @scala.inline
  def apply(
    indexType: string | number,
    kind: `index-signature`,
    name: String,
    valueType: Type,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): IndexSignature = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], kind = kind, name = name, valueType = valueType.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[IndexSignature]
  }
}

