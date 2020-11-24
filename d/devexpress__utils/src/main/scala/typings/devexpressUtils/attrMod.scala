package typings.devexpressUtils

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/attr", JSImport.Namespace)
@js.native
object attrMod extends js.Object {
  
  @js.native
  class AttrUtils () extends js.Object
  /* static members */
  @js.native
  object AttrUtils extends js.Object {
    
    def changeElementStyleAttribute(obj: HTMLElement, attrName: String, newValue: String): Unit = js.native
    
    val emptyObject: js.Any = js.native
    
    def getElementAttribute(obj: HTMLElement, attrName: String): String | Null = js.native
    
    def getStyleAttribute(obj: CSSStyleDeclaration, attrName: String): String | Null = js.native
    
    var isAttributeExists: js.Any = js.native
    
    var isExistsAttributeInElement: js.Any = js.native
    
    def removeElementAttribute(obj: HTMLElement, attrName: String): Unit = js.native
    
    def removeStyleAttribute(obj: CSSStyleDeclaration, attrName: String): Unit = js.native
    
    def restoreElementStyleAttribute(obj: HTMLElement, attrName: String): Boolean = js.native
    
    var saveStyleAttributeInElement: js.Any = js.native
    
    def setElementAttribute(obj: HTMLElement, attrName: String, value: String): Unit = js.native
    
    def setStyleAttribute(obj: CSSStyleDeclaration, attrName: String, value: String): Unit = js.native
  }
}
