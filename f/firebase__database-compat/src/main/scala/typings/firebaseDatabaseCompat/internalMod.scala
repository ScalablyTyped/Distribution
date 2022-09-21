package typings.firebaseDatabaseCompat

import typings.firebaseDatabaseCompat.anon.App
import typings.firebaseDatabaseCompat.anon.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/api/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initStandalone[T](hasAppUrlVersionCustomAuthImplNamespaceNodeAdmin: App[T]): Instance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("initStandalone")(hasAppUrlVersionCustomAuthImplNamespaceNodeAdmin.asInstanceOf[js.Any]).asInstanceOf[Instance[T]]
}
