package typings.enigmaJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("enigma.js", JSImport.Namespace)
  @js.native
  val ^ : IEnigmaClass = js.native
  
  type _To = IEnigmaClass
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IEnigmaClass = ^
}
