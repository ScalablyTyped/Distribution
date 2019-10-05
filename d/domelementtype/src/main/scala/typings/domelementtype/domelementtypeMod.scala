package typings.domelementtype

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

@JSImport("domelementtype", JSImport.Namespace)
@js.native
object domelementtypeMod extends js.Object {
  @js.native
  object DomElementType extends js.Object {
    /***
      * <![CDATA[ ... ]]>
      */
    val CDATA: cdata = js.native
    /***
      * <!-- ... -->
      */
    val Comment: comment = js.native
    /***
      * <? ... ?>
      */
    val Directive: directive = js.native
    /***
      * <!DOCTYPE ... >
      */
    val Doctype: doctype = js.native
    /***
      * <script> tags
      */
    val Script: script = js.native
    /***
      * <style> tags
      */
    val Style: style = js.native
    /***
      * Any tag
      */
    val Tag: tag = js.native
    /***
      * Text
      */
    val Text: text = js.native
    /***
      * Checks whether element object is a tag
      */
    def isTag(elem: Anon_Type): Boolean = js.native
  }
  
}

