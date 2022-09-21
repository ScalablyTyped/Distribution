package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  object component {
    
    object field {
      
      @JSGlobal("Ext.layout.component.field.Field")
      @js.native
      open class Field ()
        extends StObject
           with typings.extjs.Ext.layout.component.field.Field
      /* static members */
      object Field {
        
        @JSGlobal("Ext.layout.component.field.Field")
        @js.native
        val ^ : js.Any = js.native
        
        /** [Method] Add methods  properties to the prototype of this class
          * @param members Object
          */
        inline def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
        inline def addMembers(members: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /** [Method] Add  override static properties of this class
          * @param members Object
          * @returns Ext.Base this
          */
        inline def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
        inline def addStatics(members: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
        
        /** [Method] Create aliases for existing prototype methods
          * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
          * @param origin String/Object The original method name
          */
        inline def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
        inline def createAlias(alias: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def createAlias(alias: Any, origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def createAlias(alias: Unit, origin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /** [Method] Destroy the error tip instance  */
        inline def destroyTip(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyTip")().asInstanceOf[Unit]
        
        /** [Method] Get the current class name in string format
          * @returns String className
          */
        inline def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
        
        /** [Method] Adds members to class  */
        inline def implement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")().asInstanceOf[Unit]
        
        /** [Method] Use a custom QuickTip instance separate from the main QuickTips singleton so that we can give it a custom frame style  */
        inline def initTip(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initTip")().asInstanceOf[Unit]
        
        /** [Method] Override members of this class
          * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
          * @returns Ext.Base this class
          */
        inline def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
        inline def `override`(members: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
      }
    }
  }
}
