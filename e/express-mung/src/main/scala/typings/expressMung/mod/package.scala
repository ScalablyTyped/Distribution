package typings.expressMung

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Transform = js.Function3[
    /* body */ js.Object, 
    /* request */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* response */ typings.express.mod.Response_[js.Any], 
    js.Any
  ]
  type TransformAsync = js.Function3[
    /* body */ js.Object, 
    /* request */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* response */ typings.express.mod.Response_[js.Any], 
    js.Thenable[js.Any]
  ]
  type TransformChunk = js.Function4[
    /* chunk */ java.lang.String | typings.node.Buffer, 
    /* encoding */ java.lang.String | scala.Null, 
    /* request */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* response */ typings.express.mod.Response_[js.Any], 
    java.lang.String | typings.node.Buffer
  ]
  type TransformHeader = js.Function2[
    /* request */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* response */ typings.express.mod.Response_[js.Any], 
    js.Any
  ]
  type TransformHeaderAsync = js.Function2[
    /* request */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* response */ typings.express.mod.Response_[js.Any], 
    js.Thenable[js.Any]
  ]
}
