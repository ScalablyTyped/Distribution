package typings.firebaseDatabase

import typings.firebaseDatabase.filterNodeFilterMod.NodeFilter
import typings.firebaseDatabase.indexesIndexMod.Index
import typings.firebaseDatabase.indexesPriorityIndexMod.PriorityIndex
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewQueryParamsMod {
  
  @JSImport("@firebase/database/dist/src/core/view/QueryParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/view/QueryParams", "QueryParams")
  @js.native
  open class QueryParams () extends StObject {
    
    def copy(): QueryParams = js.native
    
    var endBeforeSet_ : Boolean = js.native
    
    var endNameSet_ : Boolean = js.native
    
    var endSet_ : Boolean = js.native
    
    def getIndex(): Index = js.native
    
    /**
      * Only valid to call if hasEnd() returns true.
      * Returns the end key name for the range defined by these query parameters
      */
    def getIndexEndName(): String = js.native
    
    /**
      * Only valid to call if hasEnd() returns true.
      */
    def getIndexEndValue(): Any = js.native
    
    /**
      * Only valid to call if hasStart() returns true.
      * Returns the starting key name for the range defined by these query parameters
      */
    def getIndexStartName(): String = js.native
    
    /**
      * Only valid to call if hasStart() returns true
      */
    def getIndexStartValue(): Any = js.native
    
    /**
      * Only valid to call if hasLimit() returns true
      */
    def getLimit(): Double = js.native
    
    /**
      * @returns True if a limit has been set and it has been explicitly anchored
      */
    def hasAnchoredLimit(): Boolean = js.native
    
    def hasEnd(): Boolean = js.native
    
    def hasEndBefore(): Boolean = js.native
    
    def hasLimit(): Boolean = js.native
    
    def hasStart(): Boolean = js.native
    
    def hasStartAfter(): Boolean = js.native
    
    var indexEndName_ : String = js.native
    
    var indexEndValue_ : Any | Null = js.native
    
    var indexStartName_ : String = js.native
    
    var indexStartValue_ : Any | Null = js.native
    
    var index_ : PriorityIndex = js.native
    
    def isDefault(): Boolean = js.native
    
    /**
      * @returns True if it would return from left.
      */
    def isViewFromLeft(): Boolean = js.native
    
    var limitSet_ : Boolean = js.native
    
    var limit_ : Double = js.native
    
    def loadsAllData(): Boolean = js.native
    
    var startAfterSet_ : Boolean = js.native
    
    var startNameSet_ : Boolean = js.native
    
    var startSet_ : Boolean = js.native
    
    var viewFrom_ : String = js.native
  }
  
  inline def queryParamsEndAt(queryParams: QueryParams, indexValue: Any): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsEndAt")(queryParams.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  inline def queryParamsEndAt(queryParams: QueryParams, indexValue: Any, key: String): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsEndAt")(queryParams.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  
  inline def queryParamsEndBefore(queryParams: QueryParams, indexValue: Any): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsEndBefore")(queryParams.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  inline def queryParamsEndBefore(queryParams: QueryParams, indexValue: Any, key: String): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsEndBefore")(queryParams.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  
  inline def queryParamsGetNodeFilter(queryParams: QueryParams): NodeFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsGetNodeFilter")(queryParams.asInstanceOf[js.Any]).asInstanceOf[NodeFilter]
  
  inline def queryParamsGetQueryObject(queryParams: QueryParams): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsGetQueryObject")(queryParams.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def queryParamsLimit(queryParams: QueryParams, newLimit: Double): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsLimit")(queryParams.asInstanceOf[js.Any], newLimit.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  
  inline def queryParamsLimitToFirst(queryParams: QueryParams, newLimit: Double): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsLimitToFirst")(queryParams.asInstanceOf[js.Any], newLimit.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  
  inline def queryParamsLimitToLast(queryParams: QueryParams, newLimit: Double): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsLimitToLast")(queryParams.asInstanceOf[js.Any], newLimit.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  
  inline def queryParamsOrderBy(queryParams: QueryParams, index: Index): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsOrderBy")(queryParams.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  
  inline def queryParamsStartAfter(queryParams: QueryParams, indexValue: Any): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsStartAfter")(queryParams.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  inline def queryParamsStartAfter(queryParams: QueryParams, indexValue: Any, key: String): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsStartAfter")(queryParams.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  
  inline def queryParamsStartAt(queryParams: QueryParams, indexValue: Any): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsStartAt")(queryParams.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  inline def queryParamsStartAt(queryParams: QueryParams, indexValue: Any, key: String): QueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsStartAt")(queryParams.asInstanceOf[js.Any], indexValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryParams]
  
  inline def queryParamsToRestQueryStringParameters(queryParams: QueryParams): Record[String, String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParamsToRestQueryStringParameters")(queryParams.asInstanceOf[js.Any]).asInstanceOf[Record[String, String | Double]]
}
