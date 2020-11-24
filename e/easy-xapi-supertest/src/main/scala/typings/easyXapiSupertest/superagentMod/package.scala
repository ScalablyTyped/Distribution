package typings.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object superagentMod {
  
  type CallbackHandler = (js.Function2[
    /* err */ js.Any, 
    /* res */ typings.easyXapiSupertest.superagentMod.Response, 
    scala.Unit
  ]) | (js.Function1[/* res */ typings.easyXapiSupertest.superagentMod.Response, scala.Unit])
  
  type SuperAgentRequest = typings.easyXapiSupertest.superagentMod.Request[
    typings.easyXapiSupertest.superagentMod.Request[
      typings.easyXapiSupertest.superagentMod.Request[typings.easyXapiSupertest.superagentMod.Request[js.Any]]
    ]
  ]
}
