package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`import`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDeclaration
  extends Import
     with DeclarationBase {
  var from: String
  var kind: `import`
}

object ImportDeclaration {
  @scala.inline
  def apply(
    from: String,
    kind: `import`,
    comment: String = null,
    flags: DeclarationFlags = null,
    jsDocComment: String = null
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(from = from, kind = kind)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (jsDocComment != null) __obj.updateDynamic("jsDocComment")(jsDocComment)
    __obj.asInstanceOf[ImportDeclaration]
  }
}

