package typings.dexie.mod

import typings.dexie.anon.Stack
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Middleware[TStack /* <: Stack */] extends js.Object {
  
  def create(down: TStack): Partial[TStack] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var stack: /* import warning: importer.ImportType#apply Failed type conversion: TStack['stack'] */ js.Any = js.native
}
object Middleware {
  
  @scala.inline
  def apply[TStack /* <: Stack */](
    create: TStack => Partial[TStack],
    stack: /* import warning: importer.ImportType#apply Failed type conversion: TStack['stack'] */ js.Any
  ): Middleware[TStack] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware[TStack]]
  }
  
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware[_], TStack /* <: Stack */] (val x: Self with Middleware[TStack]) extends AnyVal {
    
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
    def setCreate(value: TStack => Partial[TStack]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStack(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TStack['stack'] */ js.Any
    ): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
