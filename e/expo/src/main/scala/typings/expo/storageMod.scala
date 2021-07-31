package typings.expo

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.mod.AsyncStorageStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod extends Shortcut {
  
  @JSImport("expo/build/Notifications/Storage", JSImport.Default)
  @js.native
  val default: AsyncStorageStatic = js.native
  
  type _To = AsyncStorageStatic
  
  /* This means you don't have to write `default`, but can instead just say `storageMod.foo` */
  override def _to: AsyncStorageStatic = default
}
