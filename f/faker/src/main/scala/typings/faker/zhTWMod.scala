package typings.faker

import org.scalablytyped.runtime.Shortcut
import typings.faker.Faker.FakerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zhTWMod extends Shortcut {
  
  @JSImport("faker/locale/zh_TW", JSImport.Namespace)
  @js.native
  val ^ : FakerStatic = js.native
  
  type _To = FakerStatic
  
  /* This means you don't have to write `^`, but can instead just say `zhTWMod.foo` */
  override def _to: FakerStatic = ^
}
