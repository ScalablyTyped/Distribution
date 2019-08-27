package typings.expressDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashGraphqlMod {
  import typings.expressDashGraphql.Request
  import typings.expressDashGraphql.Response

  type Middleware = js.Function2[
    /* request */ Request, 
    /* response */ Response, 
    js.Promise[js.UndefOr[scala.Nothing]]
  ]
  /**
    * Used to configure the graphqlHTTP middleware by providing a schema
    * and other configuration options.
    *
    * Options can be provided as an Object, a Promise for an Object, or a Function
    * that returns an Object or a Promise for an Object.
    */
  type Options = (js.Function3[
    /* request */ Request, 
    /* response */ Response, 
    /* params */ js.UndefOr[GraphQLParams], 
    OptionsResult
  ]) | OptionsResult
  type OptionsResult = OptionsData | js.Promise[OptionsData]
}
