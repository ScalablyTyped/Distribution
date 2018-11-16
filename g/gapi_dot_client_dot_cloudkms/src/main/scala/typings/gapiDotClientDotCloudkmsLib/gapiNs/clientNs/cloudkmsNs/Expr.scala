package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Expr extends js.Object {
  /**
               * An optional description of the expression. This is a longer text which
               * describes the expression, e.g. when hovered over it in a UI.
               */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Textual representation of an expression in
               * Common Expression Language syntax.
               *
               * The application context of the containing message determines which
               * well-known feature set of CEL is supported.
               */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An optional string indicating the location of the expression for error
               * reporting, e.g. a file name and a position in the file.
               */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An optional title for the expression, i.e. a short string describing
               * its purpose. This can be used e.g. in UIs which allow to enter the
               * expression.
               */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

