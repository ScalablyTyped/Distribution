package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeFilterMod.NodeFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryParamsMod {
  
  @JSImport("@firebase/database/dist/src/core/view/QueryParams", "QueryParams")
  @js.native
  class QueryParams () extends StObject {
    
    /**
      * @return {!QueryParams}
      * @private
      */
    var copy_ : js.Any = js.native
    
    /**
      * @param {*} indexValue
      * @param {?string=} key
      * @return {!QueryParams}
      */
    def endAt(indexValue: js.Any): QueryParams = js.native
    def endAt(indexValue: js.Any, key: String): QueryParams = js.native
    
    var endNameSet_ : js.Any = js.native
    
    var endSet_ : js.Any = js.native
    
    /**
      * @return {!Index}
      */
    def getIndex(): Index = js.native
    
    /**
      * Only valid to call if hasEnd() returns true.
      * Returns the end key name for the range defined by these query parameters
      * @return {!string}
      */
    def getIndexEndName(): String = js.native
    
    /**
      * Only valid to call if hasEnd() returns true.
      * @return {*}
      */
    def getIndexEndValue(): js.Any = js.native
    
    /**
      * Only valid to call if hasStart() returns true.
      * Returns the starting key name for the range defined by these query parameters
      * @return {!string}
      */
    def getIndexStartName(): String = js.native
    
    /**
      * Only valid to call if hasStart() returns true
      * @return {*}
      */
    def getIndexStartValue(): js.Any = js.native
    
    /**
      * Only valid to call if hasLimit() returns true
      * @return {!number}
      */
    def getLimit(): Double = js.native
    
    /**
      * @return {!NodeFilter}
      */
    def getNodeFilter(): NodeFilter = js.native
    
    /**
      * @return {!Object}
      */
    def getQueryObject(): js.Object = js.native
    
    /**
      * @return {boolean} True if a limit has been set and it has been explicitly anchored
      */
    def hasAnchoredLimit(): Boolean = js.native
    
    /**
      * @return {boolean}
      */
    def hasEnd(): Boolean = js.native
    
    /**
      * @return {boolean}
      */
    def hasLimit(): Boolean = js.native
    
    /**
      * @return {boolean}
      */
    def hasStart(): Boolean = js.native
    
    var indexEndName_ : js.Any = js.native
    
    var indexEndValue_ : js.Any = js.native
    
    var indexStartName_ : js.Any = js.native
    
    var indexStartValue_ : js.Any = js.native
    
    var index_ : js.Any = js.native
    
    /**
      * @return {boolean}
      */
    def isDefault(): Boolean = js.native
    
    /**
      * @return {boolean} True if it would return from left.
      */
    def isViewFromLeft(): Boolean = js.native
    
    /**
      * @param {!number} newLimit
      * @return {!QueryParams}
      */
    def limit(newLimit: Double): QueryParams = js.native
    
    var limitSet_ : js.Any = js.native
    
    /**
      * @param {!number} newLimit
      * @return {!QueryParams}
      */
    def limitToFirst(newLimit: Double): QueryParams = js.native
    
    /**
      * @param {!number} newLimit
      * @return {!QueryParams}
      */
    def limitToLast(newLimit: Double): QueryParams = js.native
    
    var limit_ : js.Any = js.native
    
    /**
      * @return {boolean}
      */
    def loadsAllData(): Boolean = js.native
    
    /**
      * @param {!Index} index
      * @return {!QueryParams}
      */
    def orderBy(index: Index): QueryParams = js.native
    
    /**
      * @param {*} indexValue
      * @param {?string=} key
      * @return {!QueryParams}
      */
    def startAt(indexValue: js.Any): QueryParams = js.native
    def startAt(indexValue: js.Any, key: String): QueryParams = js.native
    
    var startNameSet_ : js.Any = js.native
    
    var startSet_ : js.Any = js.native
    
    /**
      * Returns a set of REST query string parameters representing this query.
      *
      * @return {!Object.<string,*>} query string parameters
      */
    def toRestQueryStringParameters(): StringDictionary[String | Double] = js.native
    
    var viewFrom_ : js.Any = js.native
  }
  /* static members */
  object QueryParams {
    
    /**
      * Default, empty query parameters
      * @type {!QueryParams}
      * @const
      */
    @JSImport("@firebase/database/dist/src/core/view/QueryParams", "QueryParams.DEFAULT")
    @js.native
    val DEFAULT: QueryParams = js.native
    
    /**
      * REST Query Constants
      * @const
      * @enum {string}
      * @private
      */
    @JSImport("@firebase/database/dist/src/core/view/QueryParams", "QueryParams.REST_QUERY_CONSTANTS_")
    @js.native
    val REST_QUERY_CONSTANTS_ : js.Any = js.native
    
    /**
      * Wire Protocol Constants
      * @const
      * @enum {string}
      * @private
      */
    @JSImport("@firebase/database/dist/src/core/view/QueryParams", "QueryParams.WIRE_PROTOCOL_CONSTANTS_")
    @js.native
    val WIRE_PROTOCOL_CONSTANTS_ : js.Any = js.native
  }
}
