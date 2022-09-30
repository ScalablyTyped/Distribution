package typings.dexie.mod

import typings.dexie.anon.Stack
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware[TStack /* <: Stack */] extends StObject {
  
  def create(down: TStack): Partial[TStack]
  
  var level: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var stack: /* import warning: importer.ImportType#apply Failed type conversion: TStack['stack'] */ js.Any
}
object Middleware {
  
  inline def apply[TStack /* <: Stack */](
    create: TStack => Partial[TStack],
    stack: /* import warning: importer.ImportType#apply Failed type conversion: TStack['stack'] */ js.Any
  ): Middleware[TStack] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware[TStack]]
  }
  
  extension [Self <: Middleware[?], TStack /* <: Stack */](x: Self & Middleware[TStack]) {
    
    inline def setCreate(value: TStack => Partial[TStack]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStack(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TStack['stack'] */ js.Any
    ): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
