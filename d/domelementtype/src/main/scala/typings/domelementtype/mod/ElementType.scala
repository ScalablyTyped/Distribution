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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /** Type for <![CDATA[ ... ]]> */
  @scala.inline
  def CDATA: cdata = "cdata".asInstanceOf[cdata]
  
  /** Type for <!-- ... --> */
  @scala.inline
  def Comment: comment = "comment".asInstanceOf[comment]
  
  /** Type for <? ... ?> */
  @scala.inline
  def Directive: directive = "directive".asInstanceOf[directive]
  
  /** Type for <!doctype ...> */
  @scala.inline
  def Doctype: doctype = "doctype".asInstanceOf[doctype]
  
  /** Type for <script> tags */
  @scala.inline
  def Script: script = "script".asInstanceOf[script]
  
  /** Type for <style> tags */
  @scala.inline
  def Style: style = "style".asInstanceOf[style]
  
  /** Type for Any tag */
  @scala.inline
  def Tag: tag = "tag".asInstanceOf[tag]
  
  /** Type for Text */
  @scala.inline
  def Text: text = "text".asInstanceOf[text]
}
