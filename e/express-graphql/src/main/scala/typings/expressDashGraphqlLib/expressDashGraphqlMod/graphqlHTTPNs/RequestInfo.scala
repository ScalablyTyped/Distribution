package typings
package expressDashGraphqlLib.expressDashGraphqlMod.graphqlHTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestInfo extends js.Object {
  /**
           * The parsed GraphQL document.
           */
  var document: js.UndefOr[graphqlLib.languageAstMod.DocumentNode | scala.Null]
  /**
           * The (optional) operation name requested.
           */
  var operationName: js.UndefOr[java.lang.String | scala.Null]
  /**
           * The result of executing the operation.
           */
  var result: js.Any
  /**
           * The variable values used at runtime.
           */
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null]
}

