package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import typings.firebaseDatabase.distSrcCoreViewFilterNodeFilterMod.NodeFilter
import typings.firebaseDatabase.distSrcCoreViewQueryParamsMod.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreViewFilterRangedFilterMod {
  
  @JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", "RangedFilter")
  @js.native
  open class RangedFilter protected ()
    extends StObject
       with NodeFilter {
    def this(params: QueryParams) = this()
    
    /* private */ var endIsInclusive_ : Any = js.native
    
    /* private */ var endPost_ : Any = js.native
    
    def getEndPost(): NamedNode = js.native
    
    def getStartPost(): NamedNode = js.native
    
    /* private */ var index_ : Any = js.native
    
    /* private */ var indexedFilter_ : Any = js.native
    
    def matches(node: NamedNode): Boolean = js.native
    
    /* private */ var startIsInclusive_ : Any = js.native
    
    /* private */ var startPost_ : Any = js.native
  }
  /* static members */
  object RangedFilter {
    
    @JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", "RangedFilter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", "RangedFilter.getEndPost_")
    @js.native
    def getEndPost_ : Any = js.native
    inline def getEndPost__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getEndPost_")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/src/core/view/filter/RangedFilter", "RangedFilter.getStartPost_")
    @js.native
    def getStartPost_ : Any = js.native
    inline def getStartPost__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getStartPost_")(x.asInstanceOf[js.Any])
  }
}
