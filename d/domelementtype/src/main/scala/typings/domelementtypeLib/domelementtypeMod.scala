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
    val CDATA: domelementtypeLib.domelementtypeLibStrings.cdata = js.native
    /***
      * <!-- ... -->
      */
    val Comment: domelementtypeLib.domelementtypeLibStrings.comment = js.native
    /***
      * <? ... ?>
      */
    val Directive: domelementtypeLib.domelementtypeLibStrings.directive = js.native
    /***
      * <!DOCTYPE ... >
      */
    val Doctype: domelementtypeLib.domelementtypeLibStrings.doctype = js.native
    /***
      * <script> tags
      */
    val Script: domelementtypeLib.domelementtypeLibStrings.script = js.native
    /***
      * <style> tags
      */
    val Style: domelementtypeLib.domelementtypeLibStrings.style = js.native
    /***
      * Any tag
      */
    val Tag: domelementtypeLib.domelementtypeLibStrings.tag = js.native
    /***
      * Text
      */
    val Text: domelementtypeLib.domelementtypeLibStrings.text = js.native
    /***
      * Checks whether element object is a tag
      */
    def isTag(elem: domelementtypeLib.Anon_Type): scala.Boolean = js.native
  }
  
}

