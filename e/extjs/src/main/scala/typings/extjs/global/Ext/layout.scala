package typings.extjs.global.Ext

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.layout")
@js.native
object layout extends js.Object {
  
  @js.native
  object component extends js.Object {
    
    @js.native
    object field extends js.Object {
      
      @js.native
      class Field ()
        extends typings.extjs.Ext.layout.component.field.Field
      /* static members */
      @js.native
      object Field extends js.Object {
        
        /** [Method] Add methods  properties to the prototype of this class
          * @param members Object
          */
        def addMembers(): Unit = js.native
        def addMembers(members: js.Any): Unit = js.native
        
        /** [Method] Add  override static properties of this class
          * @param members Object
          * @returns Ext.Base this
          */
        def addStatics(): IBase = js.native
        def addStatics(members: js.Any): IBase = js.native
        
        /** [Method] Create aliases for existing prototype methods
          * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
          * @param origin String/Object The original method name
          */
        def createAlias(): Unit = js.native
        def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
        def createAlias(alias: js.Any): Unit = js.native
        def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
        
        /** [Method] Destroy the error tip instance  */
        def destroyTip(): Unit = js.native
        
        /** [Method] Get the current class name in string format
          * @returns String className
          */
        def getName(): java.lang.String = js.native
        
        /** [Method] Adds members to class  */
        def implement(): Unit = js.native
        
        /** [Method] Use a custom QuickTip instance separate from the main QuickTips singleton so that we can give it a custom frame style  */
        def initTip(): Unit = js.native
        
        /** [Method] Override members of this class
          * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
          * @returns Ext.Base this class
          */
        def `override`(): IBase = js.native
        def `override`(members: js.Any): IBase = js.native
      }
    }
  }
}
