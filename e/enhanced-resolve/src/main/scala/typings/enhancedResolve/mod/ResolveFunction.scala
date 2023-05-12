package typings.enhancedResolve.mod

import typings.enhancedResolve.enhancedResolveBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveFunction extends StObject {
  
  def apply(context: js.Object, path: String, request: String): String | `false` = js.native
  def apply(path: String, request: String): String | `false` = js.native
}
