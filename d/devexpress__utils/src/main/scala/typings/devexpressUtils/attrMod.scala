package typings.devexpressUtils

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @scala.inline
    def changeElementStyleAttribute(obj: HTMLElement, attrName: String, newValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changeElementStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.emptyObject")
    @js.native
    val emptyObject: js.Any = js.native
    
    @scala.inline
    def getElementAttribute(obj: HTMLElement, attrName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    @scala.inline
    def getStyleAttribute(obj: CSSStyleDeclaration, attrName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
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
    
    @scala.inline
    def removeElementAttribute(obj: HTMLElement, attrName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeElementAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def removeStyleAttribute(obj: CSSStyleDeclaration, attrName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def restoreElementStyleAttribute(obj: HTMLElement, attrName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreElementStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.saveStyleAttributeInElement")
    @js.native
    def saveStyleAttributeInElement: js.Any = js.native
    @scala.inline
    def saveStyleAttributeInElement_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saveStyleAttributeInElement")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementAttribute(obj: HTMLElement, attrName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setStyleAttribute(obj: CSSStyleDeclaration, attrName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
