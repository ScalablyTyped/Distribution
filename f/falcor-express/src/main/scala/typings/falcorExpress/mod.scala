package typings.falcorExpress

import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.falcor.mod.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("falcor-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dataSourceRoute(
    getDataSource: js.Function2[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response_[js.Any], 
      DataSource
    ]
  ): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("dataSourceRoute")(getDataSource.asInstanceOf[js.Any]).asInstanceOf[Handler]
}
