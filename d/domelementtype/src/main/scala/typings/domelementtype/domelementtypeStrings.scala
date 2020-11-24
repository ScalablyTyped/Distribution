package typings.domelementtype

import typings.domelementtype.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domelementtypeStrings {
  
  @scala.inline
  def cdata: cdata = "cdata".asInstanceOf[cdata]
  
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  
  @scala.inline
  def directive: directive = "directive".asInstanceOf[directive]
  
  @scala.inline
  def doctype: doctype = "doctype".asInstanceOf[doctype]
  
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @scala.inline
  def tag: tag = "tag".asInstanceOf[tag]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait cdata extends ElementType
  
  @js.native
  sealed trait comment extends ElementType
  
  @js.native
  sealed trait directive extends ElementType
  
  @js.native
  sealed trait doctype extends ElementType
  
  @js.native
  sealed trait script extends ElementType
  
  @js.native
  sealed trait style extends ElementType
  
  @js.native
  sealed trait tag extends ElementType
  
  @js.native
  sealed trait text extends ElementType
}
