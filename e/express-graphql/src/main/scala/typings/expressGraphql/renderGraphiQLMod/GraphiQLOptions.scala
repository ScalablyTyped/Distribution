package typings.expressGraphql.renderGraphiQLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphiQLOptions extends js.Object {
  /**
    * An optional GraphQL string to use when no query is provided and no stored
    * query exists from a previous session.  If undefined is provided, GraphiQL
    * will use its own default query.
    */
  var defaultQuery: js.UndefOr[String] = js.native
  /**
    * An optional boolean which enables the header editor when true.
    * Defaults to false.
    */
  var headerEditorEnabled: js.UndefOr[Boolean] = js.native
}

object GraphiQLOptions {
  @scala.inline
  def apply(): GraphiQLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphiQLOptions]
  }
  @scala.inline
  implicit class GraphiQLOptionsOps[Self <: GraphiQLOptions] (val x: Self) extends AnyVal {
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
    def setDefaultQuery(value: String): Self = this.set("defaultQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultQuery: Self = this.set("defaultQuery", js.undefined)
    @scala.inline
    def setHeaderEditorEnabled(value: Boolean): Self = this.set("headerEditorEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderEditorEnabled: Self = this.set("headerEditorEnabled", js.undefined)
  }
  
}

