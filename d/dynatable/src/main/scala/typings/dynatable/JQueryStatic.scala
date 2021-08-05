package typings.dynatable

import typings.dynatable.JQueryDynatable.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static members of jQuery (those on $ and jQuery themselves) */
trait JQueryStatic extends StObject {
  
  /**
    * Global dynatable plugin setting defaults
    *
    * @param options The configuration options to be set globally
    */
  def dynatableSetup(options: Options): Unit
}
object JQueryStatic {
  
  inline def apply(dynatableSetup: Options => Unit): JQueryStatic = {
    val __obj = js.Dynamic.literal(dynatableSetup = js.Any.fromFunction1(dynatableSetup))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setDynatableSetup(value: Options => Unit): Self = StObject.set(x, "dynatableSetup", js.Any.fromFunction1(value))
  }
}
