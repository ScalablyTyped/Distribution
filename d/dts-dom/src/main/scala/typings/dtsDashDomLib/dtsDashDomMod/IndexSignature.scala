package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexSignature
  extends DeclarationBase
     with ClassMember
     with ObjectTypeMember {
  var indexType: dtsDashDomLib.dtsDashDomLibStrings.string | dtsDashDomLib.dtsDashDomLibStrings.number
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`index-signature`
  var name: java.lang.String
  var valueType: Type
}

object IndexSignature {
  @scala.inline
  def apply(
    indexType: dtsDashDomLib.dtsDashDomLibStrings.string | dtsDashDomLib.dtsDashDomLibStrings.number,
    kind: dtsDashDomLib.dtsDashDomLibStrings.`index-signature`,
    name: java.lang.String,
    valueType: Type,
    comment: java.lang.String = null,
    flags: DeclarationFlags = null,
    jsDocComment: java.lang.String = null
  ): IndexSignature = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], kind = kind, name = name, valueType = valueType.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[IndexSignature]
  }
}

