package typings.firebaseDatabase

import typings.firebaseDatabase.nodeFilterMod.NodeFilter
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.queryParamsMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", JSImport.Namespace)
@js.native
object rangedFilterMod extends js.Object {
  
  @js.native
  class RangedFilter protected () extends NodeFilter {
    /**
      * @param {!QueryParams} params
      */
    def this(params: QueryParams) = this()
    
    /**
      * @const
      * @type {!NamedNode}
      * @private
      */
    var endPost_ : js.Any = js.native
    
    /**
      * @return {!NamedNode}
      */
    def getEndPost(): NamedNode = js.native
    
    /**
      * @return {!NamedNode}
      */
    def getStartPost(): NamedNode = js.native
    
    /**
      * @const
      * @type {!Index}
      * @private
      */
    var index_ : js.Any = js.native
    
    /**
      * @type {!IndexedFilter}
      * @const
      * @private
      */
    var indexedFilter_ : js.Any = js.native
    
    /**
      * @param {!NamedNode} node
      * @return {boolean}
      */
    def matches(node: NamedNode): Boolean = js.native
    
    /**
      * @const
      * @type {!NamedNode}
      * @private
      */
    var startPost_ : js.Any = js.native
  }
  /* static members */
  @js.native
  object RangedFilter extends js.Object {
    
    /**
      * @param {!QueryParams} params
      * @return {!NamedNode}
      * @private
      */
    var getEndPost_ : js.Any = js.native
    
    /**
      * @param {!QueryParams} params
      * @return {!NamedNode}
      * @private
      */
    var getStartPost_ : js.Any = js.native
  }
}
