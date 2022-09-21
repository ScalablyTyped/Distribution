package typings.firebaseFirestore

import org.scalablytyped.runtime.Shortcut
import typings.firebaseFirestore.anon.External
import typings.firebaseFirestore.anon.Onwarn
import typings.firebaseFirestore.anon.Plugins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollupConfigLiteMod extends Shortcut {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/rollup.config.lite", JSImport.Default)
  @js.native
  val default: js.Array[External | Plugins | Onwarn] = js.native
  
  type _To = js.Array[External | Plugins | Onwarn]
  
  /* This means you don't have to write `default`, but can instead just say `rollupConfigLiteMod.foo` */
  override def _to: js.Array[External | Plugins | Onwarn] = default
}
