package typings.expressGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.executeMod.ExecutionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestInfo extends js.Object {
  /**
    * A value to pass as the context to the graphql() function.
    */
  var context: js.UndefOr[js.Any] = js.native
  /**
    * The parsed GraphQL document.
    */
  var document: DocumentNode = js.native
  /**
    * The (optional) operation name requested.
    */
  var operationName: String | Null = js.native
  /**
    * The result of executing the operation.
    */
  var result: ExecutionResult[StringDictionary[_], StringDictionary[_]] = js.native
  /**
    * The variable values used at runtime.
    */
  var variables: StringDictionary[js.Any] | Null = js.native
}

object RequestInfo {
  @scala.inline
  def apply(document: DocumentNode, result: ExecutionResult[StringDictionary[_], StringDictionary[_]]): RequestInfo = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
  @scala.inline
  implicit class RequestInfoOps[Self <: RequestInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: ExecutionResult[StringDictionary[_], StringDictionary[_]]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationNameNull: Self = this.set("operationName", null)
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariablesNull: Self = this.set("variables", null)
  }
  
}

