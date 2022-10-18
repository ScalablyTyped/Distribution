package typings.ecmarkup

import typings.ecmarkup.libSpecMod.Spec
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod {
  
  trait Context extends StObject {
    
    var clauseNumberer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ Any
    
    var clauseStack: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ Any
      ]
    
    var currentId: String | Null
    
    var followingEmd: Node | Null
    
    var importStack: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ Any
      ]
    
    var inAlg: Boolean
    
    var inNoAutolink: Boolean
    
    var inNoEmd: Boolean
    
    var node: HTMLElement
    
    var spec: Spec
    
    var tagStack: js.Array[HTMLElement]
  }
  object Context {
    
    inline def apply(
      clauseNumberer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ Any,
      clauseStack: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ Any
        ],
      importStack: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ Any
        ],
      inAlg: Boolean,
      inNoAutolink: Boolean,
      inNoEmd: Boolean,
      node: HTMLElement,
      spec: Spec,
      tagStack: js.Array[HTMLElement]
    ): Context = {
      val __obj = js.Dynamic.literal(clauseNumberer = clauseNumberer.asInstanceOf[js.Any], clauseStack = clauseStack.asInstanceOf[js.Any], importStack = importStack.asInstanceOf[js.Any], inAlg = inAlg.asInstanceOf[js.Any], inNoAutolink = inNoAutolink.asInstanceOf[js.Any], inNoEmd = inNoEmd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], tagStack = tagStack.asInstanceOf[js.Any], currentId = null, followingEmd = null)
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setClauseNumberer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ Any
      ): Self = StObject.set(x, "clauseNumberer", value.asInstanceOf[js.Any])
      
      inline def setClauseStack(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ Any
            ]
      ): Self = StObject.set(x, "clauseStack", value.asInstanceOf[js.Any])
      
      inline def setClauseStackVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ Any)*
      ): Self = StObject.set(x, "clauseStack", js.Array(value*))
      
      inline def setCurrentId(value: String): Self = StObject.set(x, "currentId", value.asInstanceOf[js.Any])
      
      inline def setCurrentIdNull: Self = StObject.set(x, "currentId", null)
      
      inline def setFollowingEmd(value: Node): Self = StObject.set(x, "followingEmd", value.asInstanceOf[js.Any])
      
      inline def setFollowingEmdNull: Self = StObject.set(x, "followingEmd", null)
      
      inline def setImportStack(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ Any
            ]
      ): Self = StObject.set(x, "importStack", value.asInstanceOf[js.Any])
      
      inline def setImportStackVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ Any)*
      ): Self = StObject.set(x, "importStack", js.Array(value*))
      
      inline def setInAlg(value: Boolean): Self = StObject.set(x, "inAlg", value.asInstanceOf[js.Any])
      
      inline def setInNoAutolink(value: Boolean): Self = StObject.set(x, "inNoAutolink", value.asInstanceOf[js.Any])
      
      inline def setInNoEmd(value: Boolean): Self = StObject.set(x, "inNoEmd", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setTagStack(value: js.Array[HTMLElement]): Self = StObject.set(x, "tagStack", value.asInstanceOf[js.Any])
      
      inline def setTagStackVarargs(value: HTMLElement*): Self = StObject.set(x, "tagStack", js.Array(value*))
    }
  }
}
