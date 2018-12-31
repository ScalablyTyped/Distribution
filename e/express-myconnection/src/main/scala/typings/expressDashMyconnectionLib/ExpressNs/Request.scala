package typings
package expressDashMyconnectionLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var getConnection: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[
        /* err */ expressDashMyconnectionLib.mysqlNs.MysqlError, 
        /* connection */ expressDashMyconnectionLib.mysqlNs.Connection, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
}

