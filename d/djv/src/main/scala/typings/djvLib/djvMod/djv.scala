package typings
package djvLib.djvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait djv extends js.Object {
  var resolved: Resolved = js.native
  def addFormat(name: java.lang.String, formatter: java.lang.String): scala.Unit = js.native
  def addFormat(
    name: java.lang.String,
    formatter: js.Function2[/* schema */ js.Object, /* tpl */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def addSchema(nameOrSchema: java.lang.String): Resolved = js.native
  def addSchema(nameOrSchema: java.lang.String, schema: js.Object): Resolved = js.native
  def addSchema(nameOrSchema: js.Object): Resolved = js.native
  def addSchema(nameOrSchema: js.Object, schema: js.Object): Resolved = js.native
  def export(): java.lang.String = js.native
  def export(name: java.lang.String): java.lang.String = js.native
  def `import`(config: js.Object): scala.Unit = js.native
  def removeSchema(name: java.lang.String): scala.Unit = js.native
  def resolve(name: java.lang.String): Resolved = js.native
  def resolve(name: js.Object): Resolved = js.native
  def setErrorHandler(
    errorHandler: js.Function2[/* errorType */ java.lang.String, /* property */ js.Any, java.lang.String]
  ): scala.Unit = js.native
  def useVersion(version: java.lang.String): scala.Unit = js.native
  def useVersion(version: java.lang.String, configure: js.Any): scala.Unit = js.native
  def validate(name: java.lang.String, `object`: js.Object): js.UndefOr[java.lang.String] = js.native
}

