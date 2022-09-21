package typings.dialogPolyfill

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLDialogElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * If used as ESM, then we export a const of type "DialogPolyfillType" as the default.
    */
  @JSImport("dialog-polyfill", JSImport.Default)
  @js.native
  val default: DialogPolyfillType = js.native
  
  /**
    * If used as CJS, then "dialogPolyfill" is added to the global scope. Just assert it exists.
    */
  object global {
    
    @JSGlobal("dialogPolyfill")
    @js.native
    val dialogPolyfill: DialogPolyfillType = js.native
  }
  
  trait DialogPolyfillType extends StObject {
    
    def forceRegisterDialog(dialog: HTMLDialogElement): Unit
    
    def registerDialog(dialog: HTMLDialogElement): Unit
  }
  object DialogPolyfillType {
    
    inline def apply(forceRegisterDialog: HTMLDialogElement => Unit, registerDialog: HTMLDialogElement => Unit): DialogPolyfillType = {
      val __obj = js.Dynamic.literal(forceRegisterDialog = js.Any.fromFunction1(forceRegisterDialog), registerDialog = js.Any.fromFunction1(registerDialog))
      __obj.asInstanceOf[DialogPolyfillType]
    }
    
    extension [Self <: DialogPolyfillType](x: Self) {
      
      inline def setForceRegisterDialog(value: HTMLDialogElement => Unit): Self = StObject.set(x, "forceRegisterDialog", js.Any.fromFunction1(value))
      
      inline def setRegisterDialog(value: HTMLDialogElement => Unit): Self = StObject.set(x, "registerDialog", js.Any.fromFunction1(value))
    }
  }
  
  type _To = DialogPolyfillType
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: DialogPolyfillType = default
}
