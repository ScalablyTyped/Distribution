package typings
package atFirebaseDatabaseLib.distSrcCoreViewQueryParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/QueryParams", "QueryParams")
@js.native
class QueryParams () extends js.Object {
  var `endNameSet_`: js.Any = js.native
  var `endSet_`: js.Any = js.native
  var `indexEndName_`: js.Any = js.native
  var `indexEndValue_`: js.Any = js.native
  var `indexStartName_`: js.Any = js.native
  var `indexStartValue_`: js.Any = js.native
  var `index_`: js.Any = js.native
  var `limitSet_`: js.Any = js.native
  var `limit_`: js.Any = js.native
  var `startNameSet_`: js.Any = js.native
  var `startSet_`: js.Any = js.native
  var `viewFrom_`: js.Any = js.native
  /**
       * @return {!QueryParams}
       * @private
       */
  /* private */ def `copy_`(): js.Any = js.native
  /**
       * @param {*} indexValue
       * @param {?string=} key
       * @return {!QueryParams}
       */
  def endAt(indexValue: js.Any): QueryParams = js.native
  /**
       * @param {*} indexValue
       * @param {?string=} key
       * @return {!QueryParams}
       */
  def endAt(indexValue: js.Any, key: java.lang.String): QueryParams = js.native
  /**
       * @return {!Index}
       */
  def getIndex(): atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index = js.native
  /**
       * Only valid to call if hasEnd() returns true.
       * Returns the end key name for the range defined by these query parameters
       * @return {!string}
       */
  def getIndexEndName(): java.lang.String = js.native
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
  def getIndexStartName(): java.lang.String = js.native
  /**
       * Only valid to call if hasStart() returns true
       * @return {*}
       */
  def getIndexStartValue(): js.Any = js.native
  /**
       * Only valid to call if hasLimit() returns true
       * @return {!number}
       */
  def getLimit(): scala.Double = js.native
  /**
       * @return {!NodeFilter}
       */
  def getNodeFilter(): atFirebaseDatabaseLib.distSrcCoreViewFilterNodeFilterMod.NodeFilter = js.native
  /**
       * @return {!Object}
       */
  def getQueryObject(): js.Object = js.native
  /**
       * @return {boolean} True if a limit has been set and it has been explicitly anchored
       */
  def hasAnchoredLimit(): scala.Boolean = js.native
  /**
       * @return {boolean}
       */
  def hasEnd(): scala.Boolean = js.native
  /**
       * @return {boolean}
       */
  def hasLimit(): scala.Boolean = js.native
  /**
       * @return {boolean}
       */
  def hasStart(): scala.Boolean = js.native
  /**
       * @return {boolean}
       */
  def isDefault(): scala.Boolean = js.native
  /**
       * @return {boolean} True if it would return from left.
       */
  def isViewFromLeft(): scala.Boolean = js.native
  /**
       * @param {!number} newLimit
       * @return {!QueryParams}
       */
  def limit(newLimit: scala.Double): QueryParams = js.native
  /**
       * @param {!number} newLimit
       * @return {!QueryParams}
       */
  def limitToFirst(newLimit: scala.Double): QueryParams = js.native
  /**
       * @param {!number} newLimit
       * @return {!QueryParams}
       */
  def limitToLast(newLimit: scala.Double): QueryParams = js.native
  /**
       * @return {boolean}
       */
  def loadsAllData(): scala.Boolean = js.native
  /**
       * @param {!Index} index
       * @return {!QueryParams}
       */
  def orderBy(index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): QueryParams = js.native
  /**
       * @param {*} indexValue
       * @param {?string=} key
       * @return {!QueryParams}
       */
  def startAt(indexValue: js.Any): QueryParams = js.native
  /**
       * @param {*} indexValue
       * @param {?string=} key
       * @return {!QueryParams}
       */
  def startAt(indexValue: js.Any, key: java.lang.String): QueryParams = js.native
  /**
       * Returns a set of REST query string parameters representing this query.
       *
       * @return {!Object.<string,*>} query string parameters
       */
  def toRestQueryStringParameters(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("@firebase/database/dist/src/core/view/QueryParams", "QueryParams")
@js.native
object QueryParams extends js.Object {
  /**
       * Default, empty query parameters
       * @type {!QueryParams}
       * @const
       */
  val DEFAULT: atFirebaseDatabaseLib.distSrcCoreViewQueryParamsMod.QueryParams = js.native
  /**
       * REST Query Constants
       * @const
       * @enum {string}
       * @private
       */
  val `REST_QUERY_CONSTANTS_`: js.Any = js.native
  /**
       * Wire Protocol Constants
       * @const
       * @enum {string}
       * @private
       */
  val `WIRE_PROTOCOL_CONSTANTS_`: js.Any = js.native
}

