package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

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
  def apply(
    description: String = null,
    expression: String = null,
    location: String = null,
    title: String = null
  ): SchemaExpr = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExpr]
  }
}

