package typings.faker

import org.scalablytyped.runtime.Shortcut
import typings.faker.Faker.FakerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frMod extends Shortcut {
  
  @JSImport("faker/locale/fr", JSImport.Namespace)
  @js.native
  val ^ : FakerStatic = js.native
  
  type _To = FakerStatic
  
  /* This means you don't have to write `^`, but can instead just say `frMod.foo` */
  override def _to: FakerStatic = ^
}
