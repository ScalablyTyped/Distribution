package typings.emotionNative.anon

import typings.reactNative.mod.addons.TestModuleStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofaddons extends StObject {
  
  val TestModule: TestModuleStatic
}
object Typeofaddons {
  
  inline def apply(TestModule: TestModuleStatic): Typeofaddons = {
    val __obj = js.Dynamic.literal(TestModule = TestModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofaddons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofaddons] (val x: Self) extends AnyVal {
    
    inline def setTestModule(value: TestModuleStatic): Self = StObject.set(x, "TestModule", value.asInstanceOf[js.Any])
  }
}
