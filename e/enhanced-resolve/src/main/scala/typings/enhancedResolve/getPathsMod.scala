package typings.enhancedResolve

import typings.enhancedResolve.anon.Paths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathsMod {
  
  @JSImport("enhanced-resolve/lib/getPaths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(path: String): Paths = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[Paths]
  
  @scala.inline
  def basename(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
