package typings.firebaseApp

import org.scalablytyped.runtime.Shortcut
import typings.firebaseAppTypes.mod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNodeMod extends Shortcut {
  
  @JSImport("@firebase/app/dist/packages/app/index.node", JSImport.Default)
  @js.native
  val default: FirebaseNamespace = js.native
  
  @JSImport("@firebase/app/dist/packages/app/index.node", "firebase")
  @js.native
  val firebase: FirebaseNamespace = js.native
  
  type _To = FirebaseNamespace
  
  /* This means you don't have to write `default`, but can instead just say `indexNodeMod.foo` */
  override def _to: FirebaseNamespace = default
}
