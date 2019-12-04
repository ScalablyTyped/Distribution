package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.data.util")
@js.native
object util extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/util/JsonQuery.html
    *
    *
    */
  @js.native
  class JsonQuery () extends js.Object {
    /**
      *
      */
    var jsonQueryPagination: Boolean = js.native
    /**
      *
      */
    var useFullIdInQueries: Boolean = js.native
    /**
      *
      * @param request
      * @param baseResults
      */
    def clientSideFetch(request: js.Object, baseResults: js.Array[_]): js.Any = js.native
    /**
      *
      * @param args
      */
    def fetch(args: js.Any): js.Any = js.native
    /**
      *
      */
    def isUpdateable(): Boolean = js.native
    /**
      *
      * @param item
      * @param request
      */
    def matchesQuery(item: js.Any, request: js.Any): js.Any = js.native
    /**
      *
      * @param argsSuper
      * @param argsSub
      */
    def querySuperSet(argsSuper: js.Any, argsSub: js.Any): js.Any = js.native
  }
  
}

