package typings.faker

import org.scalablytyped.runtime.Shortcut
import typings.faker.Faker.FakerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("faker", JSImport.Namespace)
  @js.native
  val ^ : FakerStatic = js.native
  
  type _To = FakerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FakerStatic = ^
}
