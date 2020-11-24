package typings.fastJsonStringify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllOf extends js.Object {
  
  var allOf: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
    ]
  ] = js.native
  
  var anyOf: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
    ]
  ] = js.native
  
  var `else`: js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
  ] = js.native
  
  var `if`: js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
  ] = js.native
  
  var `then`: js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
  ] = js.native
}
object AllOf {
  
  @scala.inline
  def apply(): AllOf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllOf]
  }
  
  @scala.inline
  implicit class AllOfOps[Self <: AllOf] (val x: Self) extends AnyVal {
    
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
    def setAllOfVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object)*
    ): Self = this.set("allOf", js.Array(value :_*))
    
    @scala.inline
    def setAllOf(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
        ]
    ): Self = this.set("allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    
    @scala.inline
    def setAnyOfVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object)*
    ): Self = this.set("anyOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
        ]
    ): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    
    @scala.inline
    def setElse(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
    ): Self = this.set("else", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElse: Self = this.set("else", js.undefined)
    
    @scala.inline
    def setIf(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
    ): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf: Self = this.set("if", js.undefined)
    
    @scala.inline
    def setThen(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias fast-json-stringify.fast-json-stringify.ObjectProperties */ js.Object
    ): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
  }
}
