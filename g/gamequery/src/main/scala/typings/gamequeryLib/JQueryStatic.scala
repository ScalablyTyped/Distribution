package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var gQ: GameQuery
  var gameQuery: GameQuery
  def playground(): JQuery
}

object JQueryStatic {
  @scala.inline
  def apply(gQ: GameQuery, gameQuery: GameQuery, playground: () => JQuery): JQueryStatic = {
    val __obj = js.Dynamic.literal(gQ = gQ, gameQuery = gameQuery, playground = js.Any.fromFunction0(playground))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

