package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an expression text. Example:      title: &quot;User account
  * presence&quot;     description: &quot;Determines whether the request has a
  * user account&quot;     expression: &quot;size(request.user) &gt; 0&quot;
  */
@js.native
trait SchemaExpr extends js.Object {
  /**
    * An optional description of the expression. This is a longer text which
    * describes the expression, e.g. when hovered over it in a UI.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Textual representation of an expression in Common Expression Language
    * syntax.  The application context of the containing message determines
    * which well-known feature set of CEL is supported.
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * An optional string indicating the location of the expression for error
    * reporting, e.g. a file name and a position in the file.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * An optional title for the expression, i.e. a short string describing its
    * purpose. This can be used e.g. in UIs which allow to enter the
    * expression.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaExpr {
  @scala.inline
  def apply(): SchemaExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpr]
  }
  @scala.inline
  implicit class SchemaExprOps[Self <: SchemaExpr] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

