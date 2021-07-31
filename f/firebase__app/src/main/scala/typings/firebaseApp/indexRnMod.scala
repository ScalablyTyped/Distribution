package typings.firebaseApp

import org.scalablytyped.runtime.Shortcut
import typings.firebaseAppTypes.mod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexRnMod extends Shortcut {
  
  @JSImport("@firebase/app/dist/packages/app/index.rn", JSImport.Default)
  @js.native
  val default: FirebaseNamespace = js.native
  
  @JSImport("@firebase/app/dist/packages/app/index.rn", "firebase")
  @js.native
  val firebase: FirebaseNamespace = js.native
  
  type _To = FirebaseNamespace
  
  /* This means you don't have to write `default`, but can instead just say `indexRnMod.foo` */
  override def _to: FirebaseNamespace = default
}
