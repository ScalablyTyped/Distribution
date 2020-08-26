package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
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
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGQ(value: GameQuery): Self = this.set("gQ", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameQuery(value: GameQuery): Self = this.set("gameQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayground(value: () => JQuery): Self = this.set("playground", js.Any.fromFunction0(value))
  }
  
}

