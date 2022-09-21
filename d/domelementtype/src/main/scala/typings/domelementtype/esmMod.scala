package typings.domelementtype

import typings.domelementtype.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("domelementtype/lib/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("domelementtype/lib/esm", "CDATA")
  @js.native
  val CDATA: String | Double = js.native
  
  @JSImport("domelementtype/lib/esm", "Comment")
  @js.native
  val Comment: String | Double = js.native
  
  @JSImport("domelementtype/lib/esm", "Directive")
  @js.native
  val Directive: String | Double = js.native
  
  @JSImport("domelementtype/lib/esm", "Doctype")
  @js.native
  val Doctype: String | Double = js.native
  
  @js.native
  sealed trait ElementType extends StObject
  @JSImport("domelementtype/lib/esm", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ElementType & String] = js.native
    
    /** Type for <![CDATA[ ... ]]> */
    @js.native
    sealed trait CDATA
      extends StObject
         with ElementType
    /* "cdata" */ val CDATA: typings.domelementtype.esmMod.ElementType.CDATA & String = js.native
    
    /** Type for <!-- ... --> */
    @js.native
    sealed trait Comment
      extends StObject
         with ElementType
    /* "comment" */ val Comment: typings.domelementtype.esmMod.ElementType.Comment & String = js.native
    
    /** Type for <? ... ?> */
    @js.native
    sealed trait Directive
      extends StObject
         with ElementType
    /* "directive" */ val Directive: typings.domelementtype.esmMod.ElementType.Directive & String = js.native
    
    /** Type for <!doctype ...> */
    @js.native
    sealed trait Doctype
      extends StObject
         with ElementType
    /* "doctype" */ val Doctype: typings.domelementtype.esmMod.ElementType.Doctype & String = js.native
    
    /** Type for the root element of a document */
    @js.native
    sealed trait Root
      extends StObject
         with ElementType
    /* "root" */ val Root: typings.domelementtype.esmMod.ElementType.Root & String = js.native
    
    /** Type for <script> tags */
    @js.native
    sealed trait Script
      extends StObject
         with ElementType
    /* "script" */ val Script: typings.domelementtype.esmMod.ElementType.Script & String = js.native
    
    /** Type for <style> tags */
    @js.native
    sealed trait Style
      extends StObject
         with ElementType
    /* "style" */ val Style: typings.domelementtype.esmMod.ElementType.Style & String = js.native
    
    /** Type for Any tag */
    @js.native
    sealed trait Tag
      extends StObject
         with ElementType
    /* "tag" */ val Tag: typings.domelementtype.esmMod.ElementType.Tag & String = js.native
    
    /** Type for Text */
    @js.native
    sealed trait Text
      extends StObject
         with ElementType
    /* "text" */ val Text: typings.domelementtype.esmMod.ElementType.Text & String = js.native
  }
  
  @JSImport("domelementtype/lib/esm", "Root")
  @js.native
  val Root: String | Double = js.native
  
  @JSImport("domelementtype/lib/esm", "Script")
  @js.native
  val Script: String | Double = js.native
  
  @JSImport("domelementtype/lib/esm", "Style")
  @js.native
  val Style: String | Double = js.native
  
  @JSImport("domelementtype/lib/esm", "Tag")
  @js.native
  val Tag: String | Double = js.native
  
  @JSImport("domelementtype/lib/esm", "Text")
  @js.native
  val Text: String | Double = js.native
  
  inline def isTag(elem: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
