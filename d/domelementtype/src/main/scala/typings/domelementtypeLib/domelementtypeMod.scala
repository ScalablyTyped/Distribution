package typings
package domelementtypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domelementtype", JSImport.Namespace)
@js.native
object domelementtypeMod extends js.Object {
  @JSName("DomElementType")
  @js.native
  object DomElementTypeNs extends js.Object {
    /***
      * <![CDATA[ ... ]]>
      */
    val CDATA: /* cdata */ java.lang.String = js.native
    /***
      * <!-- ... -->
      */
    val Comment: /* comment */ java.lang.String = js.native
    /***
      * <? ... ?>
      */
    val Directive: /* directive */ java.lang.String = js.native
    /***
      * <!DOCTYPE ... >
      */
    val Doctype: /* doctype */ java.lang.String = js.native
    /***
      * <script> tags
      */
    val Script: /* script */ java.lang.String = js.native
    /***
      * <style> tags
      */
    val Style: /* style */ java.lang.String = js.native
    /***
      * Any tag
      */
    val Tag: /* tag */ java.lang.String = js.native
    /***
      * Text
      */
    val Text: /* text */ java.lang.String = js.native
    /***
      * Checks whether element object is a tag
      */
    def isTag(elem: domelementtypeLib.Anon_Type): scala.Boolean = js.native
  }
  
}

