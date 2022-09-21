package typings.domelementtype

import typings.domelementtype.anon.TypeElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domelementtype", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("domelementtype", "CDATA")
  @js.native
  val CDATA: String | Double = js.native
  
  @JSImport("domelementtype", "Comment")
  @js.native
  val Comment: String | Double = js.native
  
  @JSImport("domelementtype", "Directive")
  @js.native
  val Directive: String | Double = js.native
  
  @JSImport("domelementtype", "Doctype")
  @js.native
  val Doctype: String | Double = js.native
  
  @js.native
  sealed trait ElementType extends StObject
  @JSImport("domelementtype", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ElementType & String] = js.native
    
    /** Type for <![CDATA[ ... ]]> */
    @js.native
    sealed trait CDATA
      extends StObject
         with ElementType
    /* "cdata" */ val CDATA: typings.domelementtype.mod.ElementType.CDATA & String = js.native
    
    /** Type for <!-- ... --> */
    @js.native
    sealed trait Comment
      extends StObject
         with ElementType
    /* "comment" */ val Comment: typings.domelementtype.mod.ElementType.Comment & String = js.native
    
    /** Type for <? ... ?> */
    @js.native
    sealed trait Directive
      extends StObject
         with ElementType
    /* "directive" */ val Directive: typings.domelementtype.mod.ElementType.Directive & String = js.native
    
    /** Type for <!doctype ...> */
    @js.native
    sealed trait Doctype
      extends StObject
         with ElementType
    /* "doctype" */ val Doctype: typings.domelementtype.mod.ElementType.Doctype & String = js.native
    
    /** Type for the root element of a document */
    @js.native
    sealed trait Root
      extends StObject
         with ElementType
    /* "root" */ val Root: typings.domelementtype.mod.ElementType.Root & String = js.native
    
    /** Type for <script> tags */
    @js.native
    sealed trait Script
      extends StObject
         with ElementType
    /* "script" */ val Script: typings.domelementtype.mod.ElementType.Script & String = js.native
    
    /** Type for <style> tags */
    @js.native
    sealed trait Style
      extends StObject
         with ElementType
    /* "style" */ val Style: typings.domelementtype.mod.ElementType.Style & String = js.native
    
    /** Type for Any tag */
    @js.native
    sealed trait Tag
      extends StObject
         with ElementType
    /* "tag" */ val Tag: typings.domelementtype.mod.ElementType.Tag & String = js.native
    
    /** Type for Text */
    @js.native
    sealed trait Text
      extends StObject
         with ElementType
    /* "text" */ val Text: typings.domelementtype.mod.ElementType.Text & String = js.native
  }
  
  @JSImport("domelementtype", "Root")
  @js.native
  val Root: String | Double = js.native
  
  @JSImport("domelementtype", "Script")
  @js.native
  val Script: String | Double = js.native
  
  @JSImport("domelementtype", "Style")
  @js.native
  val Style: String | Double = js.native
  
  @JSImport("domelementtype", "Tag")
  @js.native
  val Tag: String | Double = js.native
  
  @JSImport("domelementtype", "Text")
  @js.native
  val Text: String | Double = js.native
  
  inline def isTag(elem: TypeElementType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
