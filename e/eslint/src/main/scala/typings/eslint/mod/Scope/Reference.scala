package typings.eslint.mod.Scope

import typings.estree.mod.Identifier
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reference extends js.Object {
  var from: typings.eslint.mod.Scope.Scope = js.native
  var identifier: Identifier = js.native
  var init: Boolean = js.native
  var resolved: Variable | Null = js.native
  var writeExpr: Node | Null = js.native
  def isRead(): Boolean = js.native
  def isReadOnly(): Boolean = js.native
  def isReadWrite(): Boolean = js.native
  def isWrite(): Boolean = js.native
  def isWriteOnly(): Boolean = js.native
}

object Reference {
  @scala.inline
  def apply(
    from: typings.eslint.mod.Scope.Scope,
    identifier: Identifier,
    init: Boolean,
    isRead: () => Boolean,
    isReadOnly: () => Boolean,
    isReadWrite: () => Boolean,
    isWrite: () => Boolean,
    isWriteOnly: () => Boolean
  ): Reference = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], isRead = js.Any.fromFunction0(isRead), isReadOnly = js.Any.fromFunction0(isReadOnly), isReadWrite = js.Any.fromFunction0(isReadWrite), isWrite = js.Any.fromFunction0(isWrite), isWriteOnly = js.Any.fromFunction0(isWriteOnly))
    __obj.asInstanceOf[Reference]
  }
  @scala.inline
  implicit class ReferenceOps[Self <: Reference] (val x: Self) extends AnyVal {
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
    def setFrom(value: typings.eslint.mod.Scope.Scope): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: Boolean): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRead(value: () => Boolean): Self = this.set("isRead", js.Any.fromFunction0(value))
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction0(value))
    @scala.inline
    def setIsReadWrite(value: () => Boolean): Self = this.set("isReadWrite", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWrite(value: () => Boolean): Self = this.set("isWrite", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWriteOnly(value: () => Boolean): Self = this.set("isWriteOnly", js.Any.fromFunction0(value))
    @scala.inline
    def setResolved(value: Variable): Self = this.set("resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedNull: Self = this.set("resolved", null)
    @scala.inline
    def setWriteExpr(value: Node): Self = this.set("writeExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteExprNull: Self = this.set("writeExpr", null)
  }
  
}

