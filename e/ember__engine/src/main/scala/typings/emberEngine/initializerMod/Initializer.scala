package typings.emberEngine.initializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initializer[T] extends js.Object {
  
  var after: js.UndefOr[js.Array[String]] = js.native
  
  var before: js.UndefOr[js.Array[String]] = js.native
  
  def initialize(application: T): Unit = js.native
  
  var name: String = js.native
}
object Initializer {
  
  @scala.inline
  def apply[T](initialize: T => Unit, name: String): Initializer[T] = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initializer[T]]
  }
  
  @scala.inline
  implicit class InitializerOps[Self <: Initializer[_], T] (val x: Self with Initializer[T]) extends AnyVal {
    
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
    def setInitialize(value: T => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: String*): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: js.Array[String]): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
}
