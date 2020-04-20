package typings.domelementtype.mod

import typings.domelementtype.domelementtypeStrings.cdata
import typings.domelementtype.domelementtypeStrings.comment
import typings.domelementtype.domelementtypeStrings.directive
import typings.domelementtype.domelementtypeStrings.doctype
import typings.domelementtype.domelementtypeStrings.script
import typings.domelementtype.domelementtypeStrings.style
import typings.domelementtype.domelementtypeStrings.tag
import typings.domelementtype.domelementtypeStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.domelementtype.domelementtypeStrings.text
  - typings.domelementtype.domelementtypeStrings.directive
  - typings.domelementtype.domelementtypeStrings.comment
  - typings.domelementtype.domelementtypeStrings.script
  - typings.domelementtype.domelementtypeStrings.style
  - typings.domelementtype.domelementtypeStrings.tag
  - typings.domelementtype.domelementtypeStrings.cdata
  - typings.domelementtype.domelementtypeStrings.doctype
*/
trait ElementType extends js.Object

object ElementType {
  @scala.inline
  def CDATA: cdata = "cdata".asInstanceOf[cdata]
  @scala.inline
  def Comment: comment = "comment".asInstanceOf[comment]
  @scala.inline
  def Directive: directive = "directive".asInstanceOf[directive]
  @scala.inline
  def Doctype: doctype = "doctype".asInstanceOf[doctype]
  @scala.inline
  def Script: script = "script".asInstanceOf[script]
  @scala.inline
  def Style: style = "style".asInstanceOf[style]
  @scala.inline
  def Tag: tag = "tag".asInstanceOf[tag]
  @scala.inline
  def Text: text = "text".asInstanceOf[text]
}

