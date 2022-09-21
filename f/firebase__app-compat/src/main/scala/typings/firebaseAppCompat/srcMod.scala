package typings.firebaseAppCompat

import org.scalablytyped.runtime.Shortcut
import typings.firebaseAppCompat.publicTypesMod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod extends Shortcut {
  
  @JSImport("@firebase/app-compat/dist/esm/src", JSImport.Default)
  @js.native
  val default: FirebaseNamespace = js.native
  
  type _To = FirebaseNamespace
  
  /* This means you don't have to write `default`, but can instead just say `srcMod.foo` */
  override def _to: FirebaseNamespace = default
}
