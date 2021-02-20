package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var gQ: GameQuery = js.native
  
  var gameQuery: GameQuery = js.native
  
  def playground(): JQuery = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(gQ: GameQuery, gameQuery: GameQuery, playground: () => JQuery): JQueryStatic = {
    val __obj = js.Dynamic.literal(gQ = gQ.asInstanceOf[js.Any], gameQuery = gameQuery.asInstanceOf[js.Any], playground = js.Any.fromFunction0(playground))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGQ(value: GameQuery): Self = StObject.set(x, "gQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameQuery(value: GameQuery): Self = StObject.set(x, "gameQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayground(value: () => JQuery): Self = StObject.set(x, "playground", js.Any.fromFunction0(value))
  }
}
