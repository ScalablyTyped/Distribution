package typings.firebaseAppCompat

import org.scalablytyped.runtime.Shortcut
import typings.firebaseAppCompat.publicTypesMod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexLiteMod extends Shortcut {
  
  @JSImport("@firebase/app-compat/dist/esm/src/index.lite", JSImport.Default)
  @js.native
  val default: FirebaseNamespace = js.native
  
  type _To = FirebaseNamespace
  
  /* This means you don't have to write `default`, but can instead just say `indexLiteMod.foo` */
  override def _to: FirebaseNamespace = default
}
