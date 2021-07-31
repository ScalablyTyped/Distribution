package typings.githubUsernameRegex

import org.scalablytyped.runtime.Shortcut
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("github-username-regex", JSImport.Namespace)
  @js.native
  val ^ : RegExp = js.native
  
  type _To = RegExp
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RegExp = ^
}
