package typings
package fluxibleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Update extends js.Object {
  /**
           * POST request to the server
           * @param resource name of resourse
           * @param params query string parameters as key-value object
           * @param body json request body
           * @param callback
           */
  var create: js.Function4[
    /* resource */ java.lang.String, 
    /* params */ js.Any, 
    /* body */ js.Any, 
    /* callback */ js.Function2[/* error */ nodeLib.Error, /* data */ js.Any, scala.Unit], 
    scala.Unit
  ]
  /**
           *
           * @param resource name of resourse
           * @param params query string parameters as key-value object
           * @param callback
           */
  var delete: js.Function3[
    /* resource */ java.lang.String, 
    /* params */ js.Any, 
    /* callback */ js.Function2[/* error */ nodeLib.Error, /* data */ js.Any, scala.Unit], 
    scala.Unit
  ]
  /**
           * GET request to the server
           * @param resource name of resourse
           * @param params query string parameters as key-value object
           * @param callback
           */
  var read: js.Function3[
    /* resource */ java.lang.String, 
    /* params */ js.Any, 
    /* callback */ js.Function2[/* error */ nodeLib.Error, /* data */ js.Any, scala.Unit], 
    scala.Unit
  ]
  /**
           *
           * @param resource name of resourse
           * @param params query string parameters as key-value object
           * @param body json request body
           * @param callback
           */
  var update: js.Function4[
    /* resource */ java.lang.String, 
    /* params */ js.Any, 
    /* body */ js.Any, 
    /* callback */ js.Function2[/* error */ nodeLib.Error, /* data */ js.Any, scala.Unit], 
    scala.Unit
  ]
}

