package typings.expressValidator.anon

import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcValidationResultMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Run extends StObject {
  
  def run(req: Request): js.Promise[Result[Any]]
}
object Run {
  
  inline def apply(run: Request => js.Promise[Result[Any]]): Run = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[Run]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Run] (val x: Self) extends AnyVal {
    
    inline def setRun(value: Request => js.Promise[Result[Any]]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
