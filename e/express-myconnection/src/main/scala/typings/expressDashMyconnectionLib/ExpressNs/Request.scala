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

object Request {
  @scala.inline
  def apply(
    getConnection: /* callback */ js.Function2[
      /* err */ expressDashMyconnectionLib.mysqlNs.MysqlError, 
      /* connection */ expressDashMyconnectionLib.mysqlNs.Connection, 
      scala.Unit
    ] => scala.Unit = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (getConnection != null) __obj.updateDynamic("getConnection")(js.Any.fromFunction1(getConnection))
    __obj.asInstanceOf[Request]
  }
}

