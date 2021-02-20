package typings.devexpressUtils

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attrMod {
  
  @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils")
  @js.native
  class AttrUtils () extends StObject
  /* static members */
  object AttrUtils {
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.changeElementStyleAttribute")
    @js.native
    def changeElementStyleAttribute(obj: HTMLElement, attrName: String, newValue: String): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.emptyObject")
    @js.native
    val emptyObject: js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.getElementAttribute")
    @js.native
    def getElementAttribute(obj: HTMLElement, attrName: String): String | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.getStyleAttribute")
    @js.native
    def getStyleAttribute(obj: CSSStyleDeclaration, attrName: String): String | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.isAttributeExists")
    @js.native
    def isAttributeExists: js.Any = js.native
    @scala.inline
    def isAttributeExists_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAttributeExists")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.isExistsAttributeInElement")
    @js.native
    def isExistsAttributeInElement: js.Any = js.native
    @scala.inline
    def isExistsAttributeInElement_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isExistsAttributeInElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.removeElementAttribute")
    @js.native
    def removeElementAttribute(obj: HTMLElement, attrName: String): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.removeStyleAttribute")
    @js.native
    def removeStyleAttribute(obj: CSSStyleDeclaration, attrName: String): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.restoreElementStyleAttribute")
    @js.native
    def restoreElementStyleAttribute(obj: HTMLElement, attrName: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.saveStyleAttributeInElement")
    @js.native
    def saveStyleAttributeInElement: js.Any = js.native
    @scala.inline
    def saveStyleAttributeInElement_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saveStyleAttributeInElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.setElementAttribute")
    @js.native
    def setElementAttribute(obj: HTMLElement, attrName: String, value: String): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.setStyleAttribute")
    @js.native
    def setStyleAttribute(obj: CSSStyleDeclaration, attrName: String, value: String): Unit = js.native
  }
}
