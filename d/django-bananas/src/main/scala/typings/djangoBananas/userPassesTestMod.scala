package typings.djangoBananas

import org.scalablytyped.runtime.Shortcut
import typings.djangoBananas.mod.UserInterface
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPassesTestMod extends Shortcut {
  
  @JSImport("django-bananas/auth/UserPassesTest", JSImport.Default)
  @js.native
  val default: FC[UserPassesTestProps] = js.native
  
  trait UserPassesTestProps extends StObject {
    
    def testFunc(user: UserInterface): Boolean
  }
  object UserPassesTestProps {
    
    inline def apply(testFunc: UserInterface => Boolean): UserPassesTestProps = {
      val __obj = js.Dynamic.literal(testFunc = js.Any.fromFunction1(testFunc))
      __obj.asInstanceOf[UserPassesTestProps]
    }
    
    extension [Self <: UserPassesTestProps](x: Self) {
      
      inline def setTestFunc(value: UserInterface => Boolean): Self = StObject.set(x, "testFunc", js.Any.fromFunction1(value))
    }
  }
  
  type _To = FC[UserPassesTestProps]
  
  /* This means you don't have to write `default`, but can instead just say `userPassesTestMod.foo` */
  override def _to: FC[UserPassesTestProps] = default
}
