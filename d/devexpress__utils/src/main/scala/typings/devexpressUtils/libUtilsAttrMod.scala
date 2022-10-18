package typings.devexpressUtils

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsAttrMod {
  
  @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils")
  @js.native
  open class AttrUtils () extends StObject
  /* static members */
  object AttrUtils {
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def changeElementStyleAttribute(obj: HTMLElement, attrName: String, newValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changeElementStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.emptyObject")
    @js.native
    val emptyObject: Any = js.native
    
    inline def getElementAttribute(obj: HTMLElement, attrName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def getStyleAttribute(obj: CSSStyleDeclaration, attrName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.isAttributeExists")
    @js.native
    def isAttributeExists: Any = js.native
    inline def isAttributeExists_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAttributeExists")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/attr", "AttrUtils.isExistsAttributeInElement")
    @js.native
    def isExistsAttributeInElement: Any = js.native
    inline def isExistsAttributeInElement_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isExistsAttributeInElement")(x.asInstanceOf[js.Any])
    
    inline def removeElementAttribute(obj: HTMLElement, attrName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeElementAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeStyleAttribute(obj: CSSStyleDeclaration, attrName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def restoreElementStyleAttribute(obj: HTMLElement, attrName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreElementStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def saveStyleAttributeInElement(obj: HTMLElement, attrName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveStyleAttributeInElement")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setElementAttribute(obj: HTMLElement, attrName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setStyleAttribute(obj: CSSStyleDeclaration, attrName: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleAttribute")(obj.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
