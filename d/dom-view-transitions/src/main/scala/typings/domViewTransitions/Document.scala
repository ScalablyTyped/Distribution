package typings.domViewTransitions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  def startViewTransition(updateCallback: js.Function0[js.Promise[Unit] | Unit]): ViewTransition
}
object Document {
  
  inline def apply(startViewTransition: js.Function0[js.Promise[Unit] | Unit] => ViewTransition): Document = {
    val __obj = js.Dynamic.literal(startViewTransition = js.Any.fromFunction1(startViewTransition))
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setStartViewTransition(value: js.Function0[js.Promise[Unit] | Unit] => ViewTransition): Self = StObject.set(x, "startViewTransition", js.Any.fromFunction1(value))
  }
}
