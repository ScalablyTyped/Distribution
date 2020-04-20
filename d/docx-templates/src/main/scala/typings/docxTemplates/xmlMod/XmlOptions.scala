package typings.docxTemplates.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlOptions extends js.Object {
  var literalXmlDelimiter: String
}

object XmlOptions {
  @scala.inline
  def apply(literalXmlDelimiter: String): XmlOptions = {
    val __obj = js.Dynamic.literal(literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlOptions]
  }
}

