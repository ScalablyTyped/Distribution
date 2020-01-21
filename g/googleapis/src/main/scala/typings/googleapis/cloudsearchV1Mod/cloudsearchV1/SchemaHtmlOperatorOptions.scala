package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to provide a search operator for html properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
@js.native
trait SchemaHtmlOperatorOptions extends js.Object {
  /**
    * Indicates the operator name required in the query in order to isolate the
    * html property. For example, if operatorName is *subject* and the
    * property&#39;s name is *subjectLine*, then queries like
    * *subject:&amp;lt;value&amp;gt;* will show results only where the value of
    * the property named *subjectLine* matches *&amp;lt;value&amp;gt;*. By
    * contrast, a search that uses the same *&amp;lt;value&amp;gt;* without an
    * operator will return all items where *&amp;lt;value&amp;gt;* matches the
    * value of any html properties or text within the content field for the
    * item. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}

object SchemaHtmlOperatorOptions {
  @scala.inline
  def apply(operatorName: String = null): SchemaHtmlOperatorOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHtmlOperatorOptions]
  }
}

