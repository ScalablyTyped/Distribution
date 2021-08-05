package typings.domelementtype

import typings.domelementtype.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domelementtypeStrings {
  
  @js.native
  sealed trait cdata
    extends StObject
       with ElementType
  inline def cdata: cdata = "cdata".asInstanceOf[cdata]
  
  @js.native
  sealed trait comment
    extends StObject
       with ElementType
  inline def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait directive
    extends StObject
       with ElementType
  inline def directive: directive = "directive".asInstanceOf[directive]
  
  @js.native
  sealed trait doctype
    extends StObject
       with ElementType
  inline def doctype: doctype = "doctype".asInstanceOf[doctype]
  
  @js.native
  sealed trait script
    extends StObject
       with ElementType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait style
    extends StObject
       with ElementType
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait tag
    extends StObject
       with ElementType
  inline def tag: tag = "tag".asInstanceOf[tag]
  
  @js.native
  sealed trait text
    extends StObject
       with ElementType
  inline def text: text = "text".asInstanceOf[text]
}
