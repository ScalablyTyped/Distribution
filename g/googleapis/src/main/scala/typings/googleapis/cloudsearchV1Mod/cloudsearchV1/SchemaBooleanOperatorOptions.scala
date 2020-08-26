package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to provide a search operator for boolean properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
@js.native
trait SchemaBooleanOperatorOptions extends js.Object {
  /**
    * Indicates the operator name required in the query in order to isolate the
    * boolean property. For example, if operatorName is *closed* and the
    * property&#39;s name is *isClosed*, then queries like
    * *closed:&amp;lt;value&amp;gt;* will show results only where the value of
    * the property named *isClosed* matches *&amp;lt;value&amp;gt;*. By
    * contrast, a search that uses the same *&amp;lt;value&amp;gt;* without an
    * operator will return all items where *&amp;lt;value&amp;gt;* matches the
    * value of any String properties or text within the content field for the
    * item. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}

object SchemaBooleanOperatorOptions {
  @scala.inline
  def apply(): SchemaBooleanOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanOperatorOptions]
  }
  @scala.inline
  implicit class SchemaBooleanOperatorOptionsOps[Self <: SchemaBooleanOperatorOptions] (val x: Self) extends AnyVal {
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
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
  }
  
}

