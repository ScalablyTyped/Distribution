package typings.firebaseDatabase

import typings.firebaseDatabase.nodeFilterMod.NodeFilter
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.queryParamsMod.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangedFilterMod {
  
  @JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", "RangedFilter")
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
  object RangedFilter {
    
    @JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", "RangedFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {!QueryParams} params
      * @return {!NamedNode}
      * @private
      */
    @JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", "RangedFilter.getEndPost_")
    @js.native
    def getEndPost_ : js.Any = js.native
    @scala.inline
    def getEndPost__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getEndPost_")(x.asInstanceOf[js.Any])
    
    /**
      * @param {!QueryParams} params
      * @return {!NamedNode}
      * @private
      */
    @JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", "RangedFilter.getStartPost_")
    @js.native
    def getStartPost_ : js.Any = js.native
    @scala.inline
    def getStartPost__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getStartPost_")(x.asInstanceOf[js.Any])
  }
}
