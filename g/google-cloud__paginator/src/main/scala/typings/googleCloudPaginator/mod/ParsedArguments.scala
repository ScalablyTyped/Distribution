package typings.googleCloudPaginator.mod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedArguments extends TransformOptions {
  /**
    * Auto-pagination enabled.
    */
  var autoPaginate: js.UndefOr[Boolean] = js.native
  /**
    * Callback function.
    */
  var callback: js.UndefOr[js.Function] = js.native
  /**
    * Maximum API calls to make.
    */
  var maxApiCalls: js.UndefOr[Double] = js.native
  /**
    * Maximum results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Query object. This is most commonly an object, but to make the API more
    * simple, it can also be a string in some places.
    */
  var query: js.UndefOr[ParsedArguments] = js.native
  var streamOptions: js.UndefOr[ParsedArguments] = js.native
}

object ParsedArguments {
  @scala.inline
  def apply(): ParsedArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedArguments]
  }
  @scala.inline
  implicit class ParsedArgumentsOps[Self <: ParsedArguments] (val x: Self) extends AnyVal {
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
    def setAutoPaginate(value: Boolean): Self = this.set("autoPaginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPaginate: Self = this.set("autoPaginate", js.undefined)
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setMaxApiCalls(value: Double): Self = this.set("maxApiCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxApiCalls: Self = this.set("maxApiCalls", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setQuery(value: ParsedArguments): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setStreamOptions(value: ParsedArguments): Self = this.set("streamOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamOptions: Self = this.set("streamOptions", js.undefined)
  }
  
}

