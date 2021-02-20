package typings.enhancedResolve

import typings.enhancedResolve.anon.Paths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathsMod {
  
  @JSImport("enhanced-resolve/lib/getPaths", JSImport.Default)
  @js.native
  def default(path: String): Paths = js.native
  
  @JSImport("enhanced-resolve/lib/getPaths", "basename")
  @js.native
  def basename(path: String): String | Null = js.native
}
