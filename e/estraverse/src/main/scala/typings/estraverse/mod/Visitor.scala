package typings.estraverse.mod

import typings.estraverse.estraverseStrings.iteration
import typings.estree.mod.Node
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Visitor extends js.Object {
  
  var enter: js.UndefOr[
    js.ThisFunction2[
      /* this */ Controller, 
      /* node */ Node, 
      /* parent */ Node | Null, 
      VisitorOption | Node | Unit
    ]
  ] = js.native
  
  var fallback: js.UndefOr[
    iteration | (js.ThisFunction1[/* this */ Controller, /* node */ Node, js.Array[String]])
  ] = js.native
  
  var keys: js.UndefOr[Record[String, js.Array[String]]] = js.native
  
  var leave: js.UndefOr[
    js.ThisFunction2[
      /* this */ Controller, 
      /* node */ Node, 
      /* parent */ Node | Null, 
      VisitorOption | Node | Unit
    ]
  ] = js.native
}
object Visitor {
  
  @scala.inline
  def apply(): Visitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visitor]
  }
  
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    
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
    def setEnter(
      value: js.ThisFunction2[
          /* this */ Controller, 
          /* node */ Node, 
          /* parent */ Node | Null, 
          VisitorOption | Node | Unit
        ]
    ): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setFallback(value: iteration | (js.ThisFunction1[/* this */ Controller, /* node */ Node, js.Array[String]])): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setKeys(value: Record[String, js.Array[String]]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLeave(
      value: js.ThisFunction2[
          /* this */ Controller, 
          /* node */ Node, 
          /* parent */ Node | Null, 
          VisitorOption | Node | Unit
        ]
    ): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
  }
}
