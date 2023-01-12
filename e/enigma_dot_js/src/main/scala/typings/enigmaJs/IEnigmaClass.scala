package typings.enigmaJs

import typings.enigmaJs.enigmaJS.IConfig
import typings.enigmaJs.enigmaJS.ISession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// declare const enigmaJS: IEnigmaClass;
// export = enigmaJS;
// export as namespace enigmaJS;
trait IEnigmaClass extends StObject {
  
  /**
    * Create a session object.
    * @returns - Returns a session.
    * Note: See Configuration for the configuration options.
    */
  def create(config: IConfig): ISession
}
object IEnigmaClass {
  
  inline def apply(create: IConfig => ISession): IEnigmaClass = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[IEnigmaClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEnigmaClass] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: IConfig => ISession): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
