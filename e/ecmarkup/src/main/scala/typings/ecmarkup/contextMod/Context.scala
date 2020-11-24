package typings.ecmarkup.contextMod

import typings.ecmarkup.specMod.Spec
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var clauseNumberer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any = js.native
  
  var clauseStack: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
  ] = js.native
  
  var currentId: String | Null = js.native
  
  var importStack: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
  ] = js.native
  
  var inAlg: Boolean = js.native
  
  var inNoAutolink: Boolean = js.native
  
  var inNoEmd: Boolean = js.native
  
  var node: HTMLElement = js.native
  
  var spec: Spec = js.native
  
  var startEmd: Node | Null = js.native
  
  var tagStack: js.Array[HTMLElement] = js.native
}
object Context {
  
  @scala.inline
  def apply(
    clauseNumberer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any,
    clauseStack: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
    ],
    importStack: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
    ],
    inAlg: Boolean,
    inNoAutolink: Boolean,
    inNoEmd: Boolean,
    node: HTMLElement,
    spec: Spec,
    tagStack: js.Array[HTMLElement]
  ): Context = {
    val __obj = js.Dynamic.literal(clauseNumberer = clauseNumberer.asInstanceOf[js.Any], clauseStack = clauseStack.asInstanceOf[js.Any], importStack = importStack.asInstanceOf[js.Any], inAlg = inAlg.asInstanceOf[js.Any], inNoAutolink = inNoAutolink.asInstanceOf[js.Any], inNoEmd = inNoEmd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], tagStack = tagStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setClauseNumberer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any
    ): Self = this.set("clauseNumberer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClauseStackVarargs(value: js.Any*): Self = this.set("clauseStack", js.Array(value :_*))
    
    @scala.inline
    def setClauseStack(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
        ]
    ): Self = this.set("clauseStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportStackVarargs(value: js.Any*): Self = this.set("importStack", js.Array(value :_*))
    
    @scala.inline
    def setImportStack(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
        ]
    ): Self = this.set("importStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAlg(value: Boolean): Self = this.set("inAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInNoAutolink(value: Boolean): Self = this.set("inNoAutolink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInNoEmd(value: Boolean): Self = this.set("inNoEmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: Spec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagStackVarargs(value: HTMLElement*): Self = this.set("tagStack", js.Array(value :_*))
    
    @scala.inline
    def setTagStack(value: js.Array[HTMLElement]): Self = this.set("tagStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentId(value: String): Self = this.set("currentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIdNull: Self = this.set("currentId", null)
    
    @scala.inline
    def setStartEmd(value: Node): Self = this.set("startEmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartEmdNull: Self = this.set("startEmd", null)
  }
}
